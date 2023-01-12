package io.bootify.my_app_test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.bootify.my_app_test.domain.Operation;
import io.bootify.my_app_test.repos.Import629Repository;
import io.bootify.my_app_test.repos.OperationRepository;

import java.util.HashSet;
import java.util.UUID;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {OperationService.class})
@ExtendWith(SpringExtension.class)
class OperationServiceTest {
    @MockBean
     Import629Repository import629Repository;

    @MockBean
     OperationRepository operationRepository;

    @Autowired
     OperationService operationService;

    /**
     * Method under test: {@link OperationService#generateImport(Operation)}
     */
    @Test
    void testGenerateImport() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("Dossier2");
        operation.setDossier3("Dossier3");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("Lib Bac");
        operation.setLibac("Libac");
        operation.setMntAccoc(10.0d);
        operation.setMtnComp(10.0d);
        operation.setNumCarte("Num Carte");
        operation.setSdbr1("Sdbr1");
        operation.setSdbr2("Sdbr2");
        operation.setTypeImport("Type Import");
        when(operationRepository.save(any())).thenReturn(operation);

        Operation operation1 = new Operation();
        operation1.setDateCreated(null);
        operation1.setDossier2("Dossier2");
        operation1.setDossier3("Dossier3");
        UUID randomUUIDResult = UUID.randomUUID();
        operation1.setId(randomUUIDResult);
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("Lib Bac");
        operation1.setLibac("Libac");
        operation1.setMntAccoc(10.0d);
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("Num Carte");
        operation1.setSdbr1("Sdbr1");
        operation1.setSdbr2("Sdbr2");
        operation1.setTypeImport("Type Import");
        operationService.generateImport(operation1);
        verify(operationRepository).save(any());
        assertEquals("Type Import", operation1.getTypeImport());
        assertEquals("Sdbr2", operation1.getSdbr2());
        assertEquals("Sdbr1", operation1.getSdbr1());
        assertEquals("Num Carte", operation1.getNumCarte());
        assertEquals(10.0d, operation1.getMtnComp().doubleValue());
        assertEquals(10.0d, operation1.getMntAccoc().doubleValue());
        assertEquals("Libac", operation1.getLibac());
        assertEquals("Lib Bac", operation1.getLibBac());
        assertTrue(operation1.getImportOperationImport629s().isEmpty());
        assertSame(randomUUIDResult, operation1.getId());
        assertEquals("Dossier3", operation1.getDossier3());
        assertEquals("Dossier2", operation1.getDossier2());
    }


}

