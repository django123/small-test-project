package io.bootify.my_app_test.rest;

import io.bootify.my_app_test.domain.Import629;
import io.bootify.my_app_test.model.Import629DTO;
import io.bootify.my_app_test.model.OperationDTO;
import io.bootify.my_app_test.service.Import629Service;
import io.bootify.my_app_test.service.OperationService;
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
@RequestMapping(value = "/api/operations", produces = MediaType.APPLICATION_JSON_VALUE)
public class OperationResource {

    private final OperationService operationService;
    private final Import629Service import629Service;

    public OperationResource(final OperationService operationService,final Import629Service import629Service) {
        this.operationService = operationService;
        this.import629Service = import629Service;
    }



    @GetMapping
    public ResponseEntity<List<OperationDTO>> getAllOperations() {
        return ResponseEntity.ok(operationService.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<OperationDTO> getOperation(@PathVariable final UUID id) {
        return ResponseEntity.ok(operationService.get(id));
    }

/*    @GetMapping("import629/{id}")
    public ResponseEntity<Import629DTO> getOFraude(@PathVariable final UUID id) {
        return ResponseEntity.ok(import629Service.addImport629Fraude(id));
    }*/

    @PostMapping
    @ApiResponse(responseCode = "201")
    public ResponseEntity<UUID> createOperation(
            @RequestBody @Valid final OperationDTO operationDTO) {
        return new ResponseEntity<>(operationService.create(operationDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateOperation(@PathVariable final UUID id,
            @RequestBody @Valid final OperationDTO operationDTO) {
        operationService.update(id, operationDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<Void> deleteOperation(@PathVariable final UUID id) {
        operationService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
