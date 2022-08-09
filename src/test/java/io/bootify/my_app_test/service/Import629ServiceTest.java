package io.bootify.my_app_test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.bootify.my_app_test.domain.Import629;
import io.bootify.my_app_test.domain.Operation;
import io.bootify.my_app_test.model.Import629DTO;
import io.bootify.my_app_test.repos.Import629Repository;
import io.bootify.my_app_test.repos.OperationRepository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.server.ResponseStatusException;

@ContextConfiguration(classes = {Import629Service.class})
@ExtendWith(SpringExtension.class)
class Import629ServiceTest {
    @MockBean
    private Import629Repository import629Repository;

    @Autowired
    private Import629Service import629Service;

    @MockBean
    private OperationRepository operationRepository;

    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID)}
     */
    @Test
    void testAddImport629Fraude() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("Dossier2");
        operation.setDossier3("Dossier3");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("Lib Bac");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("Num Carte");
        operation.setSdbr1("Sdbr1");
        operation.setSdbr2("Sdbr2");

        Import629 import629 = new Import629();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629.setDateCreated(null);
        import629.setDateTreso("2020-03-01");
        import629.setDenote("Denote");
        import629.setEntite2("Entite2");
        import629.setEntite3("Entite3");
        import629.setEntite4("Entite4");
        import629.setId(UUID.randomUUID());
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setLibac("Libac");
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        when(import629Repository.save((Import629) any())).thenReturn(import629);

        Operation operation1 = new Operation();
        operation1.setDateCreated(null);
        operation1.setDossier2("Dossier2");
        operation1.setDossier3("Dossier3");
        operation1.setId(UUID.randomUUID());
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("Lib Bac");
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("Num Carte");
        operation1.setSdbr1("Sdbr1");
        operation1.setSdbr2("Sdbr2");
        Optional<Operation> ofResult = Optional.of(operation1);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult);
        Import629DTO actualAddImport629FraudeResult = import629Service.addImport629Fraude(UUID.randomUUID());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals("2022-07-23", simpleDateFormat.format(actualAddImport629FraudeResult.getDateAop()));
        assertEquals("Sdbr2", actualAddImport629FraudeResult.getSiegeDenot());
        assertEquals(-10.0d, actualAddImport629FraudeResult.getMtn2().doubleValue());
        assertEquals(10.0d, actualAddImport629FraudeResult.getMnt1().doubleValue());
        assertEquals("LEIV254 DTNBP00049741043440IC020408GJJc75056", actualAddImport629FraudeResult.getLibac());
        assertNull(actualAddImport629FraudeResult.getId());
        assertNull(actualAddImport629FraudeResult.getEntite4());
        assertNull(actualAddImport629FraudeResult.getEntite3());
        assertNull(actualAddImport629FraudeResult.getEntite2());
        assertEquals("Num CarteSdbr1", actualAddImport629FraudeResult.getDenote());
        verify(import629Repository).save((Import629) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID)}
     */
    @Test
    void testAddImport629Fraude2() {
        when(import629Repository.save((Import629) any())).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));

        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("Dossier2");
        operation.setDossier3("Dossier3");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("Lib Bac");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("Num Carte");
        operation.setSdbr1("Sdbr1");
        operation.setSdbr2("Sdbr2");
        Optional<Operation> ofResult = Optional.of(operation);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult);
        Import629DTO actualAddImport629FraudeResult = import629Service.addImport629Fraude(UUID.randomUUID());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals("2022-07-23", simpleDateFormat.format(actualAddImport629FraudeResult.getDateAop()));
        assertEquals("Sdbr2", actualAddImport629FraudeResult.getSiegeDenot());
        assertEquals(-10.0d, actualAddImport629FraudeResult.getMtn2().doubleValue());
        assertEquals(10.0d, actualAddImport629FraudeResult.getMnt1().doubleValue());
        assertEquals("LEIV254 DTNBP00049741043440IC020408GJJc75056", actualAddImport629FraudeResult.getLibac());
        assertNull(actualAddImport629FraudeResult.getId());
        assertNull(actualAddImport629FraudeResult.getEntite4());
        assertNull(actualAddImport629FraudeResult.getEntite3());
        assertNull(actualAddImport629FraudeResult.getEntite2());
        assertEquals("Num CarteSdbr1", actualAddImport629FraudeResult.getDenote());
        verify(import629Repository).save((Import629) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID)}
     */
    @Test
    void testAddImport629Fraude3() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("Dossier2");
        operation.setDossier3("Dossier3");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("Lib Bac");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("Num Carte");
        operation.setSdbr1("Sdbr1");
        operation.setSdbr2("Sdbr2");

        Import629 import629 = new Import629();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629.setDateCreated(null);
        import629.setDateTreso("2020-03-01");
        import629.setDenote("Denote");
        import629.setEntite2("Entite2");
        import629.setEntite3("Entite3");
        import629.setEntite4("Entite4");
        import629.setId(UUID.randomUUID());
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setLibac("Libac");
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        when(import629Repository.save((Import629) any())).thenReturn(import629);
        Operation operation1 = mock(Operation.class);
        when(operation1.getMtnComp()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(operation1.getNumCarte()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(operation1.getSdbr1()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(operation1.getSdbr2()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(operation1.getId()).thenReturn(UUID.randomUUID());
        doNothing().when(operation1).setDateCreated((OffsetDateTime) any());
        doNothing().when(operation1).setDossier2((String) any());
        doNothing().when(operation1).setDossier3((String) any());
        doNothing().when(operation1).setId((UUID) any());
        doNothing().when(operation1).setImportOperationImport629s((Set<Import629>) any());
        doNothing().when(operation1).setLastUpdated((OffsetDateTime) any());
        doNothing().when(operation1).setLibBac((String) any());
        doNothing().when(operation1).setMtnComp((Double) any());
        doNothing().when(operation1).setNumCarte((String) any());
        doNothing().when(operation1).setSdbr1((String) any());
        doNothing().when(operation1).setSdbr2((String) any());
        operation1.setDateCreated(null);
        operation1.setDossier2("Dossier2");
        operation1.setDossier3("Dossier3");
        operation1.setId(UUID.randomUUID());
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("Lib Bac");
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("Num Carte");
        operation1.setSdbr1("Sdbr1");
        operation1.setSdbr2("Sdbr2");
        Optional<Operation> ofResult = Optional.of(operation1);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult);
        Import629DTO actualAddImport629FraudeResult = import629Service.addImport629Fraude(UUID.randomUUID());
        assertNull(actualAddImport629FraudeResult.getDateAop());
        assertNull(actualAddImport629FraudeResult.getSiegeDenot());
        assertNull(actualAddImport629FraudeResult.getMtn2());
        assertNull(actualAddImport629FraudeResult.getMnt1());
        assertNull(actualAddImport629FraudeResult.getLibac());
        assertNull(actualAddImport629FraudeResult.getId());
        assertNull(actualAddImport629FraudeResult.getEntite4());
        assertNull(actualAddImport629FraudeResult.getEntite3());
        assertNull(actualAddImport629FraudeResult.getEntite2());
        assertNull(actualAddImport629FraudeResult.getDenote());
        assertNull(actualAddImport629FraudeResult.getDateTreso());
        verify(operationRepository).findById((UUID) any());
        verify(operation1).getMtnComp();
        verify(operation1).getId();
        verify(operation1).setDateCreated((OffsetDateTime) any());
        verify(operation1).setDossier2((String) any());
        verify(operation1).setDossier3((String) any());
        verify(operation1).setId((UUID) any());
        verify(operation1).setImportOperationImport629s((Set<Import629>) any());
        verify(operation1).setLastUpdated((OffsetDateTime) any());
        verify(operation1).setLibBac((String) any());
        verify(operation1).setMtnComp((Double) any());
        verify(operation1).setNumCarte((String) any());
        verify(operation1).setSdbr1((String) any());
        verify(operation1).setSdbr2((String) any());
    }

    /**
     * Method under test: {@link Import629Service#addImportAutomatique()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddImportAutomatique() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: bound must be positive
        //       at java.util.Random.nextInt(Random.java:388)
        //       at io.bootify.my_app_test.service.Import629Service.addImportAutomatique(Import629Service.java:85)
        //   In order to prevent addImportAutomatique()
        //   from throwing IllegalArgumentException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addImportAutomatique().
        //   See https://diff.blue/R013 to resolve this issue.

        when(operationRepository.findAll()).thenReturn(new ArrayList<>());
        import629Service.addImportAutomatique();
    }

    /**
     * Method under test: {@link Import629Service#addImportAutomatique()}
     */
    @Test
    void testAddImportAutomatique2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     Import629Service.import629Repository
        //     Import629Service.json
        //     Import629Service.operationRepository

        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("Dossier2");
        operation.setDossier3("Dossier3");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("Lib Bac");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("Num Carte");
        operation.setSdbr1("Sdbr1");
        operation.setSdbr2("Sdbr2");

        Import629 import629 = new Import629();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629.setDateCreated(null);
        import629.setDateTreso("2020-03-01");
        import629.setDenote("Denote");
        import629.setEntite2("Entite2");
        import629.setEntite3("Entite3");
        import629.setEntite4("Entite4");
        import629.setId(UUID.randomUUID());
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setLibac("Libac");
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        when(import629Repository.save((Import629) any())).thenReturn(import629);

        Operation operation1 = new Operation();
        operation1.setDateCreated(null);
        operation1.setDossier2("Dossier2");
        operation1.setDossier3("Dossier3");
        operation1.setId(UUID.randomUUID());
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("Lib Bac");
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("Num Carte");
        operation1.setSdbr1("Sdbr1");
        operation1.setSdbr2("Sdbr2");

        ArrayList<Operation> operationList = new ArrayList<>();
        operationList.add(operation1);

        Operation operation2 = new Operation();
        operation2.setDateCreated(null);
        operation2.setDossier2("Dossier2");
        operation2.setDossier3("Dossier3");
        operation2.setId(UUID.randomUUID());
        operation2.setImportOperationImport629s(new HashSet<>());
        operation2.setLastUpdated(null);
        operation2.setLibBac("Lib Bac");
        operation2.setMtnComp(10.0d);
        operation2.setNumCarte("Num Carte");
        operation2.setSdbr1("Sdbr1");
        operation2.setSdbr2("Sdbr2");
        Optional<Operation> ofResult = Optional.of(operation2);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult);
        when(operationRepository.findAll()).thenReturn(operationList);
        import629Service.addImportAutomatique();
    }

    /**
     * Method under test: {@link Import629Service#addImportAutomatique()}
     */
    @Test
    void testAddImportAutomatique3() {
        when(import629Repository.save((Import629) any())).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));

        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("Dossier2");
        operation.setDossier3("Dossier3");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("Lib Bac");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("Num Carte");
        operation.setSdbr1("Sdbr1");
        operation.setSdbr2("Sdbr2");

        ArrayList<Operation> operationList = new ArrayList<>();
        operationList.add(operation);

        Operation operation1 = new Operation();
        operation1.setDateCreated(null);
        operation1.setDossier2("Dossier2");
        operation1.setDossier3("Dossier3");
        operation1.setId(UUID.randomUUID());
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("Lib Bac");
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("Num Carte");
        operation1.setSdbr1("Sdbr1");
        operation1.setSdbr2("Sdbr2");
        Optional<Operation> ofResult = Optional.of(operation1);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult);
        when(operationRepository.findAll()).thenReturn(operationList);
        assertThrows(ResponseStatusException.class, () -> import629Service.addImportAutomatique());
        verify(import629Repository).save((Import629) any());
        verify(operationRepository).findAll();
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#addImportAutomatique()}
     */
    @Test
    void testAddImportAutomatique4() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("Dossier2");
        operation.setDossier3("Dossier3");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("Lib Bac");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("Num Carte");
        operation.setSdbr1("Sdbr1");
        operation.setSdbr2("Sdbr2");

        Import629 import629 = new Import629();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629.setDateCreated(null);
        import629.setDateTreso("2020-03-01");
        import629.setDenote("Denote");
        import629.setEntite2("Entite2");
        import629.setEntite3("Entite3");
        import629.setEntite4("Entite4");
        import629.setId(UUID.randomUUID());
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setLibac("Libac");
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        when(import629Repository.save((Import629) any())).thenReturn(import629);

        Operation operation1 = new Operation();
        operation1.setDateCreated(null);
        operation1.setDossier2("Dossier2");
        operation1.setDossier3("Dossier3");
        operation1.setId(UUID.randomUUID());
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("Lib Bac");
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("Num Carte");
        operation1.setSdbr1("Sdbr1");
        operation1.setSdbr2("Sdbr2");

        ArrayList<Operation> operationList = new ArrayList<>();
        operationList.add(operation1);
        Operation operation2 = mock(Operation.class);
        when(operation2.getMtnComp()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(operation2.getNumCarte()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(operation2.getSdbr1()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(operation2.getSdbr2()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(operation2.getId()).thenReturn(UUID.randomUUID());
        doNothing().when(operation2).setDateCreated((OffsetDateTime) any());
        doNothing().when(operation2).setDossier2((String) any());
        doNothing().when(operation2).setDossier3((String) any());
        doNothing().when(operation2).setId((UUID) any());
        doNothing().when(operation2).setImportOperationImport629s((Set<Import629>) any());
        doNothing().when(operation2).setLastUpdated((OffsetDateTime) any());
        doNothing().when(operation2).setLibBac((String) any());
        doNothing().when(operation2).setMtnComp((Double) any());
        doNothing().when(operation2).setNumCarte((String) any());
        doNothing().when(operation2).setSdbr1((String) any());
        doNothing().when(operation2).setSdbr2((String) any());
        operation2.setDateCreated(null);
        operation2.setDossier2("Dossier2");
        operation2.setDossier3("Dossier3");
        operation2.setId(UUID.randomUUID());
        operation2.setImportOperationImport629s(new HashSet<>());
        operation2.setLastUpdated(null);
        operation2.setLibBac("Lib Bac");
        operation2.setMtnComp(10.0d);
        operation2.setNumCarte("Num Carte");
        operation2.setSdbr1("Sdbr1");
        operation2.setSdbr2("Sdbr2");
        Optional<Operation> ofResult = Optional.of(operation2);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult);
        when(operationRepository.findAll()).thenReturn(operationList);
        assertThrows(ResponseStatusException.class, () -> import629Service.addImportAutomatique());
        verify(operationRepository).findAll();
        verify(operationRepository).findById((UUID) any());
        verify(operation2).getMtnComp();
        verify(operation2).getId();
        verify(operation2).setDateCreated((OffsetDateTime) any());
        verify(operation2).setDossier2((String) any());
        verify(operation2).setDossier3((String) any());
        verify(operation2).setId((UUID) any());
        verify(operation2).setImportOperationImport629s((Set<Import629>) any());
        verify(operation2).setLastUpdated((OffsetDateTime) any());
        verify(operation2).setLibBac((String) any());
        verify(operation2).setMtnComp((Double) any());
        verify(operation2).setNumCarte((String) any());
        verify(operation2).setSdbr1((String) any());
        verify(operation2).setSdbr2((String) any());
    }
}

