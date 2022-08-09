package io.bootify.my_app_test.service;

import io.bootify.my_app_test.domain.Import629;
import io.bootify.my_app_test.domain.Operation;
import io.bootify.my_app_test.model.Import629DTO;
import io.bootify.my_app_test.repos.Import629Repository;
import io.bootify.my_app_test.repos.OperationRepository;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class Import629Service {



    private final Import629Repository import629Repository;
    private final OperationRepository operationRepository;

    private static String json = "{\n" +
            "    \"mntAccoc\": \"8.00\",\n" +
            "    \"rib\": \"0081500000070464\",\n" +
            "    \"typeImport\": \"import630_10254\",\n" +
            "    \"id\": \"20afc36f-b0d6-47e3-ba5b-24c37e650399\",\n" +
            "    \"libac\": \"LEIV254 DTNBP00049741043440IC020408GJJc75056\"\n" +
            "}\n";

    public Import629Service(final Import629Repository import629Repository,
            final OperationRepository operationRepository) {
        this.import629Repository = import629Repository;
        this.operationRepository = operationRepository;
    }

    public Import629DTO addImport629Fraude(final UUID id) {

                Import629DTO import629DTO = new Import629DTO();
                Import629 imp = fromImport629Dto(import629DTO);

                try {
                    Operation operation = operationRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
                    JSONObject jsonObject = new JSONObject(json);
                    System.err.println(jsonObject);
                        if (operation.getId() != null && operation.getMtnComp() <= 40){
                            imp.setMnt1(operation.getMtnComp());
                            imp.setMtn2(-operation.getMtnComp());
                            imp.setDenote(operation.getNumCarte()+""+operation.getSdbr1());
                            imp.setSiegeDenot(operation.getSdbr2());
                            imp.setDateTreso(convertDateToString(new Date()));
                            imp.setDateAop(convertStringToDate("20220723"));
                            imp.setLibac(jsonObject.getString("libac"));
                            imp.setImportOperation(operation);
                            import629Repository.save(imp);
                        }
                }catch (Exception e){
                    e.printStackTrace();
                }

            return fromImport629(imp);
    }


    @Async
    @Scheduled(cron = "0 0/5 * * * *") // seconde minute heure jour mois annee
    public void addImportAutomatique(){
        List<Operation> operations = operationRepository.findAll();
        Import629 import629 = new Import629();
        Random radom = new Random();
        int randomItem = radom.nextInt(operations.size());

        for (Operation randomOperation : operations){
            randomOperation = operations.get(randomItem);
            Operation operation = operationRepository
                    .findById(randomOperation.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

            if (operation.getId() != null){
                if (operation.getMtnComp() <= 40){
                    import629.setMnt1(operation.getMtnComp());
                    import629.setMtn2(-operation.getMtnComp());
                    import629.setDenote(operation.getNumCarte()+""+operation.getSdbr1());
                    import629.setSiegeDenot(operation.getSdbr2());
                    import629.setDateTreso(convertDateToString(new Date()));
                    import629.setDateAop(convertStringToDate("20220723"));
                }
                import629Repository.save(import629);
            }
        }

    }

    public List<Import629DTO> findAll() {
        return import629Repository.findAll(Sort.by("id"))
                .stream()
                .map(import629 -> mapToDTO(import629, new Import629DTO()))
                .collect(Collectors.toList());
    }

    public Import629DTO get(final UUID id) {
        return import629Repository.findById(id)
                .map(import629 -> mapToDTO(import629, new Import629DTO()))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public UUID create(final Import629DTO import629DTO) {
        final Import629 import629 = new Import629();
        mapToEntity(import629DTO, import629);
        return import629Repository.save(import629).getId();
    }

    public void update(final UUID id, final Import629DTO import629DTO) {
        final Import629 import629 = import629Repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        mapToEntity(import629DTO, import629);
        import629Repository.save(import629);
    }

    public void delete(final UUID id) {
        import629Repository.deleteById(id);
    }

    private Import629DTO mapToDTO(final Import629 import629, final Import629DTO import629DTO) {
        import629DTO.setId(import629.getId());
        import629DTO.setMnt1(import629.getMnt1());
        import629DTO.setMtn2(import629.getMtn2());
        import629DTO.setSiegeDenot(import629.getSiegeDenot());
        import629DTO.setDenote(import629.getDenote());
        import629DTO.setLibac(import629.getLibac());
        import629DTO.setImportOperation(import629.getImportOperation() == null ? null : import629.getImportOperation().getId());
        return import629DTO;
    }

    private Import629 mapToEntity(final Import629DTO import629DTO, final Import629 import629) {
        import629.setMnt1(import629DTO.getMnt1());
        import629.setMtn2(import629DTO.getMtn2());
        import629.setSiegeDenot(import629DTO.getSiegeDenot());
        import629.setDenote(import629DTO.getDenote());
        import629.setLibac(import629DTO.getLibac());
        final Operation importOperation = import629DTO.getImportOperation() == null ? null : operationRepository.findById(import629DTO.getImportOperation())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "importOperation not found"));
        import629.setImportOperation(importOperation);
        return import629;
    }

    private Import629DTO fromImport629(Import629 import629){
        Import629DTO import629DTO = new Import629DTO();
        BeanUtils.copyProperties(import629, import629DTO);
        return  import629DTO;
    }

    private Import629 fromImport629Dto(Import629DTO import629DTO){
        Import629 import629 = new Import629();
        BeanUtils.copyProperties(import629DTO, import629);
        return  import629;
    }

    public String convertDateToString(Date date) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        // System.err.println("t-est heur:"+df.format(getStartOfDay(date)));
        return df.format(date);

    }
    public  Date convertStringToDate(String dateInString){
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            return dateFormat.parse((dateInString));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String SixteenFirstCaracter(String str){

        return str.length() < 16 ? str: str.substring(0, 16);
    }

}
