package io.bootify.my_app_test.service;

import io.bootify.my_app_test.domain.Operation;
import io.bootify.my_app_test.model.OperationDTO;
import io.bootify.my_app_test.repos.OperationRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class OperationService {

    private final OperationRepository operationRepository;

    public OperationService(final OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    public List<OperationDTO> findAll() {
        return operationRepository.findAll(Sort.by("id"))
                .stream()
                .map(operation -> mapToDTO(operation, new OperationDTO()))
                .collect(Collectors.toList());
    }

    public OperationDTO get(final UUID id) {
        return operationRepository.findById(id)
                .map(operation -> mapToDTO(operation, new OperationDTO()))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public UUID create(final OperationDTO operationDTO) {
        final Operation operation = new Operation();
        mapToEntity(operationDTO, operation);
        return operationRepository.save(operation).getId();
    }

    public void update(final UUID id, final OperationDTO operationDTO) {
        final Operation operation = operationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        mapToEntity(operationDTO, operation);
        operationRepository.save(operation);
    }

    public void delete(final UUID id) {
        operationRepository.deleteById(id);
    }

    private OperationDTO mapToDTO(final Operation operation, final OperationDTO operationDTO) {
        operationDTO.setId(operation.getId());
        operationDTO.setMtnComp(operation.getMtnComp());
        operationDTO.setNumCarte(operation.getNumCarte());
        operationDTO.setSdbr1(operation.getSdbr1());
        operationDTO.setSdbr2(operation.getSdbr2());
        return operationDTO;
    }

    private Operation mapToEntity(final OperationDTO operationDTO, final Operation operation) {
        operation.setMtnComp(operationDTO.getMtnComp());
        operation.setNumCarte(operationDTO.getNumCarte());
        operation.setSdbr1(operationDTO.getSdbr1());
        operation.setSdbr2(operationDTO.getSdbr2());
        return operation;
    }

}
