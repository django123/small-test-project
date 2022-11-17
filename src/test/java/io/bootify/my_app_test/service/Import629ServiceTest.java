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
import io.bootify.my_app_test.model.Import629LightDTO;
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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.server.ResponseStatusException;

@SpringBootTest
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


    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID, Import629LightDTO)}
     */
    @Test
    void testAddImport629Fraude() {
        UUID id = UUID.randomUUID();

        Import629LightDTO import629LightDTO = new Import629LightDTO();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629LightDTO.setDateAccoc(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629LightDTO.setLibac("Libac");
        import629LightDTO.setMntAccoc(10.0d);
        import629LightDTO.setTypeImport("Type Import");
        assertThrows(ResponseStatusException.class, () -> import629Service.addImport629Fraude(id, import629LightDTO));
    }

    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID, Import629LightDTO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddImport629Fraude2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.dao.InvalidDataAccessApiUsageException: The given id must not be null!; nested exception is java.lang.IllegalArgumentException: The given id must not be null!
        //       at com.sun.proxy.$Proxy165.findById(null)
        //       at io.bootify.my_app_test.service.Import629Service.addImport629Fraude(Import629Service.java:53)
        //   java.lang.IllegalArgumentException: The given id must not be null!
        //       at com.sun.proxy.$Proxy165.findById(null)
        //       at io.bootify.my_app_test.service.Import629Service.addImport629Fraude(Import629Service.java:53)
        //   See https://diff.blue/R013 to resolve this issue.

        Import629LightDTO import629LightDTO = new Import629LightDTO();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629LightDTO.setDateAccoc(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629LightDTO.setLibac("Libac");
        import629LightDTO.setMntAccoc(10.0d);
        import629LightDTO.setTypeImport("Type Import");
        import629Service.addImport629Fraude(null, import629LightDTO);
    }

    /**
     * Method under test: {@link Import629Service#addImport629Fraude(UUID, Import629LightDTO)}
     */
    @Test
    void testAddImport629Fraude3() {
        UUID id = new UUID(1L, 1L);

        Import629LightDTO import629LightDTO = new Import629LightDTO();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629LightDTO.setDateAccoc(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629LightDTO.setLibac("Libac");
        import629LightDTO.setMntAccoc(10.0d);
        import629LightDTO.setTypeImport("Type Import");
        assertThrows(ResponseStatusException.class, () -> import629Service.addImport629Fraude(id, import629LightDTO));
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

    /**
     * Method under test: {@link Import629Service#getAllImport(int, int)}
     */
    @Test
    void testGetAllImport() {
        when(import629Repository.findAll((Pageable) any())).thenReturn(new PageImpl<>(new ArrayList<>()));
        assertEquals(2, import629Service.getAllImport(1, 1).size());
        verify(import629Repository).findAll((Pageable) any());
    }

    /**
     * Method under test: {@link Import629Service#getAllImport(int, int)}
     */
    @Test
    void testGetAllImport2() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("data");
        operation.setDossier3("data");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("data");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("data");
        operation.setSdbr1("data");
        operation.setSdbr2("data");

        Import629 import629 = new Import629();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629.setDateCreated(null);
        import629.setDateTreso("2020-03-01");
        import629.setDenote("data");
        import629.setEntite2("data");
        import629.setEntite3("data");
        import629.setEntite4("data");
        import629.setId(UUID.randomUUID());
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setLibac("data");
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("data");

        ArrayList<Import629> import629List = new ArrayList<>();
        import629List.add(import629);
        PageImpl<Import629> pageImpl = new PageImpl<>(import629List);
        when(import629Repository.findAll((Pageable) any())).thenReturn(pageImpl);
        assertEquals(2, import629Service.getAllImport(1, 1).size());
        verify(import629Repository).findAll((Pageable) any());
    }

    /**
     * Method under test: {@link Import629Service#getAllImport(int, int)}
     */
    @Test
    void testGetAllImport3() {
        Operation operation = new Operation();
        operation.setDateCreated(null);
        operation.setDossier2("data");
        operation.setDossier3("data");
        operation.setId(UUID.randomUUID());
        operation.setImportOperationImport629s(new HashSet<>());
        operation.setLastUpdated(null);
        operation.setLibBac("data");
        operation.setMtnComp(10.0d);
        operation.setNumCarte("data");
        operation.setSdbr1("data");
        operation.setSdbr2("data");

        Import629 import629 = new Import629();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629.setDateAop(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        import629.setDateCreated(null);
        import629.setDateTreso("2020-03-01");
        import629.setDenote("data");
        import629.setEntite2("data");
        import629.setEntite3("data");
        import629.setEntite4("data");
        import629.setId(UUID.randomUUID());
        import629.setImportOperation(operation);
        import629.setLastUpdated(null);
        import629.setLibac("data");
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("data");

        Operation operation1 = new Operation();
        operation1.setDateCreated(null);
        operation1.setDossier2("data");
        operation1.setDossier3("data");
        operation1.setId(UUID.randomUUID());
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("data");
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("data");
        operation1.setSdbr1("data");
        operation1.setSdbr2("data");

        Import629 import6291 = new Import629();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import6291.setDateAop(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import6291.setDateCreated(null);
        import6291.setDateTreso("2020-03-01");
        import6291.setDenote("data");
        import6291.setEntite2("data");
        import6291.setEntite3("data");
        import6291.setEntite4("data");
        import6291.setId(UUID.randomUUID());
        import6291.setImportOperation(operation1);
        import6291.setLastUpdated(null);
        import6291.setLibac("data");
        import6291.setMnt1(10.0d);
        import6291.setMtn2(10.0d);
        import6291.setSiegeDenot("data");

        ArrayList<Import629> import629List = new ArrayList<>();
        import629List.add(import6291);
        import629List.add(import629);
        PageImpl<Import629> pageImpl = new PageImpl<>(import629List);
        when(import629Repository.findAll((Pageable) any())).thenReturn(pageImpl);
        assertEquals(2, import629Service.getAllImport(1, 1).size());
        verify(import629Repository).findAll((Pageable) any());
    }

    /**
     * Method under test: {@link Import629Service#getAllImport(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllImport4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.bootify.my_app_test.service.Import629Service.getAllImport(Import629Service.java:123)
        //   In order to prevent getAllImport(int, int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getAllImport(int, int).
        //   See https://diff.blue/R013 to resolve this issue.

        when(import629Repository.findAll((Pageable) any())).thenReturn(null);
        import629Service.getAllImport(1, 1);
    }

    /**
     * Method under test: {@link Import629Service#getAllImport(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllImport5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Page index must not be less than zero
        //       at org.springframework.data.domain.AbstractPageRequest.<init>(AbstractPageRequest.java:45)
        //       at org.springframework.data.domain.PageRequest.<init>(PageRequest.java:45)
        //       at org.springframework.data.domain.PageRequest.of(PageRequest.java:72)
        //       at org.springframework.data.domain.PageRequest.of(PageRequest.java:60)
        //       at io.bootify.my_app_test.service.Import629Service.getAllImport(Import629Service.java:121)
        //   In order to prevent getAllImport(int, int)
        //   from throwing IllegalArgumentException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getAllImport(int, int).
        //   See https://diff.blue/R013 to resolve this issue.

        when(import629Repository.findAll((Pageable) any())).thenReturn(new PageImpl<>(new ArrayList<>()));
        import629Service.getAllImport(-1, 1);
    }

    /**
     * Method under test: {@link Import629Service#getAllImport(int, int)}
     */
    @Test
    void testGetAllImport6() {
        when(import629Repository.findAll((Pageable) any())).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        assertThrows(ResponseStatusException.class, () -> import629Service.getAllImport(1, 1));
        verify(import629Repository).findAll((Pageable) any());
    }
}

