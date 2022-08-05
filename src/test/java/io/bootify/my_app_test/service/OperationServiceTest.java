package io.bootify.my_app_test.service;

import io.bootify.my_app_test.model.OperationDTO;

import java.util.List;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {OperationService.class})
@ExtendWith(SpringExtension.class)
class OperationServiceTest {
    @Autowired
    private OperationService operationService;

    /**
     * Method under test: {@link OperationService#findAll()}
     */
    @Test
    void testFindAll() {
        // Arrange and Act
        // TODO: Populate arranged inputs
        List<OperationDTO> actualFindAllResult = this.operationService.findAll();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link OperationService#get(UUID)}
     */
    @Test
    void testGet() {
        // Arrange
        // TODO: Populate arranged inputs
        UUID id = null;

        // Act
        OperationDTO actualGetResult = this.operationService.get(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link OperationService#create(OperationDTO)}
     */
    @Test
    void testCreate() {
        // Arrange
        // TODO: Populate arranged inputs
        OperationDTO operationDTO = null;

        // Act
        UUID actualCreateResult = this.operationService.create(operationDTO);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link OperationService#update(UUID, OperationDTO)}
     */
    @Test
    void testUpdate() {
        // Arrange
        // TODO: Populate arranged inputs
        UUID id = null;
        OperationDTO operationDTO = null;

        // Act
        this.operationService.update(id, operationDTO);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link OperationService#delete(UUID)}
     */
    @Test
    void testDelete() {
        // Arrange
        // TODO: Populate arranged inputs
        UUID id = null;

        // Act
        this.operationService.delete(id);

        // Assert
        // TODO: Add assertions on result
    }
}

