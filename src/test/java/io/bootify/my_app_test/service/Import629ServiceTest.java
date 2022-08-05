package io.bootify.my_app_test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
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
import java.util.List;
import java.util.Optional;
import java.util.Set;

import java.util.UUID;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.server.ResponseStatusException;

@ContextConfiguration(classes = {Import629Service.class})
@ExtendWith(SpringExtension.class)
class Import629ServiceTest {
    @MockBean
    private Import629Repository import629Repository;

    @MockBean
    private OperationRepository operationRepository;

    @Autowired
    private Import629Service import629Service;

    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID)}
     */
    @Test
    void testAddImport629Fraude() {
        // Arrange
        // TODO: Populate arranged inputs
        UUID id = null;

        // Act
        Import629DTO actualAddImport629FraudeResult = this.import629Service.addImport629Fraude(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID)}
     */
    @Test
    void testAddImport629Fraude2() {
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
        assertThrows(ResponseStatusException.class, () -> import629Service.addImport629Fraude(UUID.randomUUID()));
        verify(import629Repository).save((Import629) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID)}
     */
    @Test
    void testAddImport629Fraude4() {
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
        assertThrows(ResponseStatusException.class, () -> import629Service.addImport629Fraude(UUID.randomUUID()));
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
    void testAddImportAutomatique() {
        // Arrange and Act
        // TODO: Populate arranged inputs
        this.import629Service.addImportAutomatique();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#addImportAutomatique()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddImportAutomatique2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: bound must be positive
        //       at java.util.Random.nextInt(Random.java:388)
        //       at io.bootify.my_app_test.service.Import629Service.addImportAutomatique(Import629Service.java:77)
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
    void testAddImportAutomatique3() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     Import629Service.import629Repository
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
    void testAddImportAutomatique4() {
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
    void testAddImportAutomatique5() {
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

    /**
     * Method under test: {@link Import629Service#findAll()}
     */
    @Test
    void testFindAll() {
        // Arrange and Act
        // TODO: Populate arranged inputs
        List<Import629DTO> actualFindAllResult = this.import629Service.findAll();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#findAll()}
     */
    @Test
    void testFindAll2() {
        when(import629Repository.findAll((Sort) any())).thenReturn(new ArrayList<>());
        assertTrue(import629Service.findAll().isEmpty());
        verify(import629Repository).findAll((Sort) any());
    }

    /**
     * Method under test: {@link Import629Service#findAll()}
     */
    @Test
    void testFindAll3() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("id");
        operation.setDossier3("id");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("id");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("id");
        operation.setSdbr1("id");
        operation.setSdbr2("id");

        Import629 import629 = new Import629();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629.setDateCreated(null);
        import629.setDateTreso("2020-03-01");
        import629.setDenote("id");
        import629.setEntite2("id");
        import629.setEntite3("id");
        import629.setEntite4("id");
        import629.setId(UUID.randomUUID());
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("id");

        ArrayList<Import629> import629List = new ArrayList<>();
        import629List.add(import629);
        when(import629Repository.findAll((Sort) any())).thenReturn(import629List);
        assertEquals(1, import629Service.findAll().size());
        verify(import629Repository).findAll((Sort) any());
    }

    /**
     * Method under test: {@link Import629Service#findAll()}
     */
    @Test
    void testFindAll4() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("id");
        operation.setDossier3("id");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("id");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("id");
        operation.setSdbr1("id");
        operation.setSdbr2("id");

        Import629 import629 = new Import629();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629.setDateCreated(null);
        import629.setDateTreso("2020-03-01");
        import629.setDenote("id");
        import629.setEntite2("id");
        import629.setEntite3("id");
        import629.setEntite4("id");
        import629.setId(UUID.randomUUID());
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("id");

        Operation operation1 = new Operation();
        operation1.setDateCreated(null);
        operation1.setDossier2("id");
        operation1.setDossier3("id");
        operation1.setId(UUID.randomUUID());
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("id");
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("id");
        operation1.setSdbr1("id");
        operation1.setSdbr2("id");

        Import629 import6291 = new Import629();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import6291.setDateAop(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import6291.setDateCreated(null);
        import6291.setDateTreso("2020-03-01");
        import6291.setDenote("id");
        import6291.setEntite2("id");
        import6291.setEntite3("id");
        import6291.setEntite4("id");
        import6291.setId(UUID.randomUUID());
        import6291.setImportOperation(operation1);
        import6291.setLastUpdated(null);
        import6291.setMnt1(10.0d);
        import6291.setMtn2(10.0d);
        import6291.setSiegeDenot("id");

        ArrayList<Import629> import629List = new ArrayList<>();
        import629List.add(import6291);
        import629List.add(import629);
        when(import629Repository.findAll((Sort) any())).thenReturn(import629List);
        assertEquals(2, import629Service.findAll().size());
        verify(import629Repository).findAll((Sort) any());
    }

    /**
     * Method under test: {@link Import629Service#findAll()}
     */
    @Test
    void testFindAll5() {
        when(import629Repository.findAll((Sort) any())).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        assertThrows(ResponseStatusException.class, () -> import629Service.findAll());
        verify(import629Repository).findAll((Sort) any());
    }

    /**
     * Method under test: {@link Import629Service#get(UUID)}
     */
    @Test
    void testGet() {
        // Arrange
        // TODO: Populate arranged inputs
        UUID id = null;

        // Act
        Import629DTO actualGetResult = this.import629Service.get(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#get(UUID)}
     */
    @Test
    void testGet2() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("Dossier2");
        operation.setDossier3("Dossier3");
        UUID randomUUIDResult = UUID.randomUUID();
        operation.setId(randomUUIDResult);
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
        UUID randomUUIDResult1 = UUID.randomUUID();
        import629.setId(randomUUIDResult1);
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        Optional<Import629> ofResult = Optional.of(import629);
        when(import629Repository.findById((UUID) any())).thenReturn(ofResult);
        Import629DTO actualGetResult = import629Service.get(UUID.randomUUID());
        assertEquals("Siege Denot", actualGetResult.getSiegeDenot());
        assertEquals(10.0d, actualGetResult.getMtn2().doubleValue());
        assertEquals(10.0d, actualGetResult.getMnt1().doubleValue());
        assertSame(randomUUIDResult, actualGetResult.getImportOperation());
        assertSame(randomUUIDResult1, actualGetResult.getId());
        assertEquals("Denote", actualGetResult.getDenote());
        verify(import629Repository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#get(UUID)}
     */
    @Test
    void testGet3() {
        when(import629Repository.findById((UUID) any())).thenReturn(Optional.empty());

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
        Import629 import629 = mock(Import629.class);
        when(import629.getImportOperation()).thenReturn(operation1);
        when(import629.getMnt1()).thenReturn(10.0d);
        when(import629.getMtn2()).thenReturn(10.0d);
        when(import629.getDenote()).thenReturn("Denote");
        when(import629.getSiegeDenot()).thenReturn("Siege Denot");
        when(import629.getId()).thenReturn(UUID.randomUUID());
        doNothing().when(import629).setDateAop((Date) any());
        doNothing().when(import629).setDateCreated((OffsetDateTime) any());
        doNothing().when(import629).setDateTreso((String) any());
        doNothing().when(import629).setDenote((String) any());
        doNothing().when(import629).setEntite2((String) any());
        doNothing().when(import629).setEntite3((String) any());
        doNothing().when(import629).setEntite4((String) any());
        doNothing().when(import629).setId((UUID) any());
        doNothing().when(import629).setImportOperation((Operation) any());
        doNothing().when(import629).setLastUpdated((OffsetDateTime) any());
        doNothing().when(import629).setMnt1((Double) any());
        doNothing().when(import629).setMtn2((Double) any());
        doNothing().when(import629).setSiegeDenot((String) any());
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
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        assertThrows(ResponseStatusException.class, () -> import629Service.get(UUID.randomUUID()));
        verify(import629Repository).findById((UUID) any());
        verify(import629).setDateAop((Date) any());
        verify(import629).setDateCreated((OffsetDateTime) any());
        verify(import629).setDateTreso((String) any());
        verify(import629).setDenote((String) any());
        verify(import629).setEntite2((String) any());
        verify(import629).setEntite3((String) any());
        verify(import629).setEntite4((String) any());
        verify(import629).setId((UUID) any());
        verify(import629).setImportOperation((Operation) any());
        verify(import629).setLastUpdated((OffsetDateTime) any());
        verify(import629).setMnt1((Double) any());
        verify(import629).setMtn2((Double) any());
        verify(import629).setSiegeDenot((String) any());
    }

    /**
     * Method under test: {@link Import629Service#create(Import629DTO)}
     */
    @Test
    void testCreate() {
        // Arrange
        // TODO: Populate arranged inputs
        Import629DTO import629DTO = null;

        // Act
        UUID actualCreateResult = this.import629Service.create(import629DTO);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#create(Import629DTO)}
     */
    @Test
    void testCreate2() {
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
        UUID randomUUIDResult = UUID.randomUUID();
        import629.setId(randomUUIDResult);
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
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

        Import629DTO import629DTO = new Import629DTO();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629DTO.setDateAop(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import629DTO.setDateTreso("2020-03-01");
        import629DTO.setDenote("Denote");
        import629DTO.setEntite2("Entite2");
        import629DTO.setEntite3("Entite3");
        import629DTO.setEntite4("Entite4");
        import629DTO.setId(UUID.randomUUID());
        import629DTO.setImportOperation(UUID.randomUUID());
        import629DTO.setMnt1(10.0d);
        import629DTO.setMtn2(10.0d);
        import629DTO.setSiegeDenot("Siege Denot");
        assertSame(randomUUIDResult, import629Service.create(import629DTO));
        verify(import629Repository).save((Import629) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#create(Import629DTO)}
     */
    @Test
    void testCreate3() {
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

        Import629DTO import629DTO = new Import629DTO();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629DTO.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629DTO.setDateTreso("2020-03-01");
        import629DTO.setDenote("Denote");
        import629DTO.setEntite2("Entite2");
        import629DTO.setEntite3("Entite3");
        import629DTO.setEntite4("Entite4");
        import629DTO.setId(UUID.randomUUID());
        import629DTO.setImportOperation(UUID.randomUUID());
        import629DTO.setMnt1(10.0d);
        import629DTO.setMtn2(10.0d);
        import629DTO.setSiegeDenot("Siege Denot");
        assertThrows(ResponseStatusException.class, () -> import629Service.create(import629DTO));
        verify(import629Repository).save((Import629) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#create(Import629DTO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.bootify.my_app_test.service.Import629Service.mapToEntity(Import629Service.java:145)
        //       at io.bootify.my_app_test.service.Import629Service.create(Import629Service.java:114)
        //   In order to prevent create(Import629DTO)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(Import629DTO).
        //   See https://diff.blue/R013 to resolve this issue.

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
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        when(import629Repository.save((Import629) any())).thenReturn(import629);
        when(operationRepository.findById((UUID) any())).thenReturn(null);

        Import629DTO import629DTO = new Import629DTO();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629DTO.setDateAop(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import629DTO.setDateTreso("2020-03-01");
        import629DTO.setDenote("Denote");
        import629DTO.setEntite2("Entite2");
        import629DTO.setEntite3("Entite3");
        import629DTO.setEntite4("Entite4");
        import629DTO.setId(UUID.randomUUID());
        import629DTO.setImportOperation(UUID.randomUUID());
        import629DTO.setMnt1(10.0d);
        import629DTO.setMtn2(10.0d);
        import629DTO.setSiegeDenot("Siege Denot");
        import629Service.create(import629DTO);
    }

    /**
     * Method under test: {@link Import629Service#create(Import629DTO)}
     */
    @Test
    void testCreate5() {
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
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        when(import629Repository.save((Import629) any())).thenReturn(import629);
        when(operationRepository.findById((UUID) any())).thenReturn(Optional.empty());

        Import629DTO import629DTO = new Import629DTO();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629DTO.setDateAop(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import629DTO.setDateTreso("2020-03-01");
        import629DTO.setDenote("Denote");
        import629DTO.setEntite2("Entite2");
        import629DTO.setEntite3("Entite3");
        import629DTO.setEntite4("Entite4");
        import629DTO.setId(UUID.randomUUID());
        import629DTO.setImportOperation(UUID.randomUUID());
        import629DTO.setMnt1(10.0d);
        import629DTO.setMtn2(10.0d);
        import629DTO.setSiegeDenot("Siege Denot");
        assertThrows(ResponseStatusException.class, () -> import629Service.create(import629DTO));
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#update(UUID, Import629DTO)}
     */
    @Test
    void testUpdate() {
        // Arrange
        // TODO: Populate arranged inputs
        UUID id = null;
        Import629DTO import629DTO = null;

        // Act
        this.import629Service.update(id, import629DTO);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#update(UUID, Import629DTO)}
     */
    @Test
    void testUpdate2() {
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
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        Optional<Import629> ofResult = Optional.of(import629);

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

        Import629 import6291 = new Import629();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import6291.setDateAop(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import6291.setDateCreated(null);
        import6291.setDateTreso("2020-03-01");
        import6291.setDenote("Denote");
        import6291.setEntite2("Entite2");
        import6291.setEntite3("Entite3");
        import6291.setEntite4("Entite4");
        import6291.setId(UUID.randomUUID());
        import6291.setImportOperation(operation1);
        import6291.setLastUpdated(null);
        import6291.setMnt1(10.0d);
        import6291.setMtn2(10.0d);
        import6291.setSiegeDenot("Siege Denot");
        when(import629Repository.save((Import629) any())).thenReturn(import6291);
        when(import629Repository.findById((UUID) any())).thenReturn(ofResult);

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
        Optional<Operation> ofResult1 = Optional.of(operation2);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult1);
        UUID id = UUID.randomUUID();

        Import629DTO import629DTO = new Import629DTO();
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629DTO.setDateAop(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        import629DTO.setDateTreso("2020-03-01");
        import629DTO.setDenote("Denote");
        import629DTO.setEntite2("Entite2");
        import629DTO.setEntite3("Entite3");
        import629DTO.setEntite4("Entite4");
        import629DTO.setId(UUID.randomUUID());
        import629DTO.setImportOperation(UUID.randomUUID());
        import629DTO.setMnt1(10.0d);
        import629DTO.setMtn2(10.0d);
        import629DTO.setSiegeDenot("Siege Denot");
        import629Service.update(id, import629DTO);
        verify(import629Repository).save((Import629) any());
        verify(import629Repository).findById((UUID) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#update(UUID, Import629DTO)}
     */
    @Test
    void testUpdate3() {
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
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        Optional<Import629> ofResult = Optional.of(import629);
        when(import629Repository.save((Import629) any())).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        when(import629Repository.findById((UUID) any())).thenReturn(ofResult);

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
        Optional<Operation> ofResult1 = Optional.of(operation1);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult1);
        UUID id = UUID.randomUUID();

        Import629DTO import629DTO = new Import629DTO();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629DTO.setDateAop(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import629DTO.setDateTreso("2020-03-01");
        import629DTO.setDenote("Denote");
        import629DTO.setEntite2("Entite2");
        import629DTO.setEntite3("Entite3");
        import629DTO.setEntite4("Entite4");
        import629DTO.setId(UUID.randomUUID());
        import629DTO.setImportOperation(UUID.randomUUID());
        import629DTO.setMnt1(10.0d);
        import629DTO.setMtn2(10.0d);
        import629DTO.setSiegeDenot("Siege Denot");
        assertThrows(ResponseStatusException.class, () -> import629Service.update(id, import629DTO));
        verify(import629Repository).save((Import629) any());
        verify(import629Repository).findById((UUID) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#delete(UUID)}
     */
    @Test
    void testDelete() {
        // Arrange
        // TODO: Populate arranged inputs
        UUID id = null;

        // Act
        this.import629Service.delete(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#delete(UUID)}
     */
    @Test
    void testDelete2() {
        doNothing().when(import629Repository).deleteById((UUID) any());
        import629Service.delete(UUID.randomUUID());
        verify(import629Repository).deleteById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#delete(UUID)}
     */
    @Test
    void testDelete3() {
        doThrow(new ResponseStatusException(HttpStatus.CONTINUE)).when(import629Repository).deleteById((UUID) any());
        assertThrows(ResponseStatusException.class, () -> import629Service.delete(UUID.randomUUID()));
        verify(import629Repository).deleteById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#convertDateToString(Date)}
     */
    @Test
    void testConvertDateToString() {
        // Arrange
        // TODO: Populate arranged inputs
        Date date = null;

        // Act
        String actualConvertDateToStringResult = this.import629Service.convertDateToString(date);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#convertDateToString(Date)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConvertDateToString2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        Import629Service import629Service = new Import629Service(mock(Import629Repository.class),
                mock(OperationRepository.class));
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629Service.convertDateToString(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
    }

    /**
     * Method under test: {@link Import629Service#convertDateToString(Date)}
     */
    @Test
    void testConvertDateToString3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

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
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        Import629Repository import629Repository = mock(Import629Repository.class);
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
        OperationRepository operationRepository = mock(OperationRepository.class);
        when(operationRepository.findById((UUID) any())).thenReturn(Optional.of(operation1));

        Import629Service import629Service = new Import629Service(import629Repository, operationRepository);
        import629Service.addImport629Fraude(UUID.randomUUID());
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629Service.convertDateToString(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        verify(import629Repository).save((Import629) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Service#convertDateToString(Date)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConvertDateToString4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Calendar.setTime(Calendar.java:1800)
        //       at java.text.SimpleDateFormat.format(SimpleDateFormat.java:974)
        //       at java.text.SimpleDateFormat.format(SimpleDateFormat.java:967)
        //       at java.text.DateFormat.format(DateFormat.java:374)
        //       at io.bootify.my_app_test.service.Import629Service.convertDateToString(Import629Service.java:165)
        //   In order to prevent convertDateToString(Date)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   convertDateToString(Date).
        //   See https://diff.blue/R013 to resolve this issue.

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
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        Import629Repository import629Repository = mock(Import629Repository.class);
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
        OperationRepository operationRepository = mock(OperationRepository.class);
        when(operationRepository.findById((UUID) any())).thenReturn(Optional.of(operation1));

        Import629Service import629Service = new Import629Service(import629Repository, operationRepository);
        import629Service.addImport629Fraude(UUID.randomUUID());
        import629Service.convertDateToString(null);
    }

    /**
     * Method under test: {@link Import629Service#convertStringToDate(String)}
     */
    @Test
    void testConvertStringToDate() {
        // Arrange
        // TODO: Populate arranged inputs
        String dateInString = "";

        // Act
        Date actualConvertStringToDateResult = this.import629Service.convertStringToDate(dateInString);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Service#convertStringToDate(String)}
     */
    @Test
    void testConvertStringToDate2() {
        Date actualDate = import629Service.convertStringToDate("2020-03-01");
        assertEquals("2019-12-03", (new SimpleDateFormat("yyyy-MM-dd")).format(actualDate));
    }

    /**
     * Method under test: {@link Import629Service#convertStringToDate(String)}
     */
    @Test
    void testConvertStringToDate3() {
        assertNull(import629Service.convertStringToDate("2020/03/01"));
    }
}

