package io.bootify.my_app_test.rest;

import io.bootify.my_app_test.domain.Operation;
import io.bootify.my_app_test.model.Import629DTO;
import io.bootify.my_app_test.repos.OperationRepository;
import io.bootify.my_app_test.service.Import629Service;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/import629s", produces = MediaType.APPLICATION_JSON_VALUE)
public class Import629Resource {

    private final Import629Service import629Service;
    private final OperationRepository operationRepository;

    public Import629Resource(final Import629Service import629Service,final OperationRepository operationRepository) {
        this.import629Service = import629Service;
        this.operationRepository = operationRepository;
    }

    @GetMapping
    public ResponseEntity<List<Import629DTO>> getAllImport629s() {
        return ResponseEntity.ok(import629Service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Import629DTO> getImport629(@PathVariable final UUID id) {
        return ResponseEntity.ok(import629Service.get(id));
    }

    @GetMapping("/operation/{id}")
    public ResponseEntity<Import629DTO> addImportFraude(@PathVariable final UUID id){
        Operation operation = operationRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(import629Service.addImport629Fraude(operation.getId()));
    }

    @PostMapping
    @ApiResponse(responseCode = "201")
    public ResponseEntity<UUID> createImport629(
            @RequestBody @Valid final Import629DTO import629DTO) {
        return new ResponseEntity<>(import629Service.create(import629DTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateImport629(@PathVariable final UUID id,
            @RequestBody @Valid final Import629DTO import629DTO) {
        import629Service.update(id, import629DTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<Void> deleteImport629(@PathVariable final UUID id) {
        import629Service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
