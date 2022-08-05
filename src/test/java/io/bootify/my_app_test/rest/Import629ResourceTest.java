package io.bootify.my_app_test.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.bootify.my_app_test.domain.Import629;
import io.bootify.my_app_test.domain.Operation;
import io.bootify.my_app_test.model.Import629DTO;
import io.bootify.my_app_test.repos.Import629Repository;
import io.bootify.my_app_test.repos.OperationRepository;
import io.bootify.my_app_test.service.Import629Service;

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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {Import629Resource.class})
@ExtendWith(SpringExtension.class)
class Import629ResourceTest {
    @Autowired
    private Import629Resource import629Resource;

    @MockBean
    private Import629Service import629Service;

    @MockBean
    private OperationRepository operationRepository;

    /**
     * Method under test: {@link Import629Resource#getImport629(UUID)}
     */
    @Test
    void testGetImport6292() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

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
        Import629Repository import629Repository = mock(Import629Repository.class);
        when(import629Repository.findById((UUID) any())).thenReturn(Optional.of(import629));
        Import629Resource import629Resource = new Import629Resource(
                new Import629Service(import629Repository, mock(OperationRepository.class)), mock(OperationRepository.class));
        ResponseEntity<Import629DTO> actualImport629 = import629Resource.getImport629(UUID.randomUUID());
        assertTrue(actualImport629.hasBody());
        assertTrue(actualImport629.getHeaders().isEmpty());
        assertEquals(HttpStatus.OK, actualImport629.getStatusCode());
        Import629DTO body = actualImport629.getBody();
        assertSame(randomUUIDResult, body.getImportOperation());
        assertSame(randomUUIDResult1, body.getId());
        assertEquals(10.0d, body.getMtn2().doubleValue());
        assertEquals("Siege Denot", body.getSiegeDenot());
        assertEquals(10.0d, body.getMnt1().doubleValue());
        assertEquals("Denote", body.getDenote());
        verify(import629Repository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Resource#getImport629(UUID)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetImport6293() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.web.server.ResponseStatusException: 404 NOT_FOUND
        //       at io.bootify.my_app_test.service.Import629Service.lambda$get$4(Import629Service.java:109)
        //       at java.util.Optional.orElseThrow(Optional.java:408)
        //       at io.bootify.my_app_test.service.Import629Service.get(Import629Service.java:109)
        //       at io.bootify.my_app_test.rest.Import629Resource.getImport629(Import629Resource.java:44)
        //   In order to prevent getImport629(UUID)
        //   from throwing ResponseStatusException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getImport629(UUID).
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
        Import629Repository import629Repository = mock(Import629Repository.class);
        when(import629Repository.findById((UUID) any())).thenReturn(Optional.empty());
        Import629Resource import629Resource = new Import629Resource(
                new Import629Service(import629Repository, mock(OperationRepository.class)), mock(OperationRepository.class));
        import629Resource.getImport629(UUID.randomUUID());
    }

    /**
     * Method under test: {@link Import629Resource#getImport629(UUID)}
     */
    @Test
    void testGetImport6294() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

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
        Optional.of(import629);

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
        Import629Service import629Service = mock(Import629Service.class);
        when(import629Service.get((UUID) any())).thenReturn(import629DTO);
        Import629Resource import629Resource = new Import629Resource(import629Service, mock(OperationRepository.class));
        ResponseEntity<Import629DTO> actualImport629 = import629Resource.getImport629(UUID.randomUUID());
        assertTrue(actualImport629.hasBody());
        assertTrue(actualImport629.getHeaders().isEmpty());
        assertEquals(HttpStatus.OK, actualImport629.getStatusCode());
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
        verify(import629Service).get((UUID) any());
    }

    /**
     * Method under test: {@link Import629Resource#addImportFraude(UUID)}
     */
    @Test
    void testAddImportFraude2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

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
        OperationRepository operationRepository1 = mock(OperationRepository.class);
        when(operationRepository1.findById((UUID) any())).thenReturn(Optional.of(operation2));
        Import629Resource import629Resource = new Import629Resource(import629Service, operationRepository1);
        ResponseEntity<Import629DTO> actualAddImportFraudeResult = import629Resource.addImportFraude(UUID.randomUUID());
        assertTrue(actualAddImportFraudeResult.hasBody());
        assertTrue(actualAddImportFraudeResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.OK, actualAddImportFraudeResult.getStatusCode());
        Import629DTO body = actualAddImportFraudeResult.getBody();
        assertNull(body.getId());
        assertNull(body.getEntite4());
        assertNull(body.getEntite3());
        assertNull(body.getEntite2());
        assertEquals("Num CarteSdbr1", body.getDenote());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals("2022-07-23", simpleDateFormat.format(body.getDateAop()));
        assertEquals("Sdbr2", body.getSiegeDenot());
        assertEquals(10.0d, body.getMnt1().doubleValue());
        assertEquals(-10.0d, body.getMtn2().doubleValue());
        verify(import629Repository).save((Import629) any());
        verify(operationRepository).findById((UUID) any());
        verify(operationRepository1).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Resource#addImportFraude(UUID)}
     */
    @Test
    void testAddImportFraude3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

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
        Operation operation1 = mock(Operation.class);
        when(operation1.getId()).thenReturn(null);
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
        OperationRepository operationRepository = mock(OperationRepository.class);
        when(operationRepository.findById((UUID) any())).thenReturn(Optional.of(operation1));
        Import629Service import629Service = new Import629Service(import629Repository, operationRepository);

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
        OperationRepository operationRepository1 = mock(OperationRepository.class);
        when(operationRepository1.findById((UUID) any())).thenReturn(Optional.of(operation2));
        Import629Resource import629Resource = new Import629Resource(import629Service, operationRepository1);
        ResponseEntity<Import629DTO> actualAddImportFraudeResult = import629Resource.addImportFraude(UUID.randomUUID());
        assertTrue(actualAddImportFraudeResult.hasBody());
        assertTrue(actualAddImportFraudeResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.OK, actualAddImportFraudeResult.getStatusCode());
        Import629DTO body = actualAddImportFraudeResult.getBody();
        assertNull(body.getId());
        assertNull(body.getEntite4());
        assertNull(body.getEntite3());
        assertNull(body.getEntite2());
        assertNull(body.getDenote());
        assertNull(body.getDateTreso());
        assertNull(body.getDateAop());
        assertNull(body.getSiegeDenot());
        assertNull(body.getMnt1());
        assertNull(body.getMtn2());
        verify(operationRepository).findById((UUID) any());
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
        verify(operationRepository1).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Resource#addImportFraude(UUID)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddImportFraude4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.web.server.ResponseStatusException: 404 NOT_FOUND
        //       at io.bootify.my_app_test.service.Import629Service.lambda$addImport629Fraude$0(Import629Service.java:50)
        //       at java.util.Optional.orElseThrow(Optional.java:408)
        //       at io.bootify.my_app_test.service.Import629Service.addImport629Fraude(Import629Service.java:50)
        //       at io.bootify.my_app_test.rest.Import629Resource.addImportFraude(Import629Resource.java:50)
        //   In order to prevent addImportFraude(UUID)
        //   from throwing ResponseStatusException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addImportFraude(UUID).
        //   See https://diff.blue/R013 to resolve this issue.

        Operation operation = mock(Operation.class);
        when(operation.getId()).thenReturn(UUID.randomUUID());
        doNothing().when(operation).setDateCreated((OffsetDateTime) any());
        doNothing().when(operation).setDossier2((String) any());
        doNothing().when(operation).setDossier3((String) any());
        doNothing().when(operation).setId((UUID) any());
        doNothing().when(operation).setImportOperationImport629s((Set<Import629>) any());
        doNothing().when(operation).setLastUpdated((OffsetDateTime) any());
        doNothing().when(operation).setLibBac((String) any());
        doNothing().when(operation).setMtnComp((Double) any());
        doNothing().when(operation).setNumCarte((String) any());
        doNothing().when(operation).setSdbr1((String) any());
        doNothing().when(operation).setSdbr2((String) any());
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
        import629.setImportOperation(operation1);
        import629.setLastUpdated(null);
        import629.setMnt1(10.0d);
        import629.setMtn2(10.0d);
        import629.setSiegeDenot("Siege Denot");
        Import629Repository import629Repository = mock(Import629Repository.class);
        when(import629Repository.save((Import629) any())).thenReturn(import629);
        OperationRepository operationRepository = mock(OperationRepository.class);
        when(operationRepository.findById((UUID) any())).thenReturn(Optional.empty());
        Import629Service import629Service = new Import629Service(import629Repository, operationRepository);

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
        OperationRepository operationRepository1 = mock(OperationRepository.class);
        when(operationRepository1.findById((UUID) any())).thenReturn(Optional.of(operation2));
        Import629Resource import629Resource = new Import629Resource(import629Service, operationRepository1);
        import629Resource.addImportFraude(UUID.randomUUID());
    }

    /**
     * Method under test: {@link Import629Resource#addImportFraude(UUID)}
     */
    @Test
    void testAddImportFraude5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        Operation operation = mock(Operation.class);
        when(operation.getId()).thenReturn(UUID.randomUUID());
        doNothing().when(operation).setDateCreated((OffsetDateTime) any());
        doNothing().when(operation).setDossier2((String) any());
        doNothing().when(operation).setDossier3((String) any());
        doNothing().when(operation).setId((UUID) any());
        doNothing().when(operation).setImportOperationImport629s((Set<Import629>) any());
        doNothing().when(operation).setLastUpdated((OffsetDateTime) any());
        doNothing().when(operation).setLibBac((String) any());
        doNothing().when(operation).setMtnComp((Double) any());
        doNothing().when(operation).setNumCarte((String) any());
        doNothing().when(operation).setSdbr1((String) any());
        doNothing().when(operation).setSdbr2((String) any());
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
        Optional.of(operation);

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
        Import629Service import629Service = mock(Import629Service.class);
        when(import629Service.addImport629Fraude((UUID) any())).thenReturn(import629DTO);

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
        Import629Resource import629Resource = new Import629Resource(import629Service, operationRepository);
        ResponseEntity<Import629DTO> actualAddImportFraudeResult = import629Resource.addImportFraude(UUID.randomUUID());
        assertTrue(actualAddImportFraudeResult.hasBody());
        assertTrue(actualAddImportFraudeResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.OK, actualAddImportFraudeResult.getStatusCode());
        verify(operation).setDateCreated((OffsetDateTime) any());
        verify(operation).setDossier2((String) any());
        verify(operation).setDossier3((String) any());
        verify(operation).setId((UUID) any());
        verify(operation).setImportOperationImport629s((Set<Import629>) any());
        verify(operation).setLastUpdated((OffsetDateTime) any());
        verify(operation).setLibBac((String) any());
        verify(operation).setMtnComp((Double) any());
        verify(operation).setNumCarte((String) any());
        verify(operation).setSdbr1((String) any());
        verify(operation).setSdbr2((String) any());
        verify(import629Service).addImport629Fraude((UUID) any());
        verify(operationRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link Import629Resource#addImportFraude(UUID)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddImportFraude6() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:382)
        //       at io.bootify.my_app_test.rest.Import629Resource.addImportFraude(Import629Resource.java:49)
        //   In order to prevent addImportFraude(UUID)
        //   from throwing NoSuchElementException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addImportFraude(UUID).
        //   See https://diff.blue/R013 to resolve this issue.

        Operation operation = mock(Operation.class);
        when(operation.getId()).thenReturn(UUID.randomUUID());
        doNothing().when(operation).setDateCreated((OffsetDateTime) any());
        doNothing().when(operation).setDossier2((String) any());
        doNothing().when(operation).setDossier3((String) any());
        doNothing().when(operation).setId((UUID) any());
        doNothing().when(operation).setImportOperationImport629s((Set<Import629>) any());
        doNothing().when(operation).setLastUpdated((OffsetDateTime) any());
        doNothing().when(operation).setLibBac((String) any());
        doNothing().when(operation).setMtnComp((Double) any());
        doNothing().when(operation).setNumCarte((String) any());
        doNothing().when(operation).setSdbr1((String) any());
        doNothing().when(operation).setSdbr2((String) any());
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
        Optional.of(operation);

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
        Import629Service import629Service = mock(Import629Service.class);
        when(import629Service.addImport629Fraude((UUID) any())).thenReturn(import629DTO);
        OperationRepository operationRepository = mock(OperationRepository.class);
        when(operationRepository.findById((UUID) any())).thenReturn(Optional.empty());
        Import629Resource import629Resource = new Import629Resource(import629Service, operationRepository);
        import629Resource.addImportFraude(UUID.randomUUID());
    }

    /**
     * Method under test: {@link Import629Resource#addImportFraude(UUID)}
     */
    @Test
    void testAddImportFraude() throws Exception {
        // Arrange
        // TODO: Populate arranged inputs
        Object[] uriVars = new Object[]{UUID.randomUUID()};
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/import629s/operation/{id}",
                uriVars);
        Object[] controllers = new Object[]{import629Resource};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Resource#createImport629(Import629DTO)}
     */
    @Test
    void testCreateImport629() throws Exception {
        // Arrange
        // TODO: Populate arranged inputs
        Object[] uriVars = new Object[]{};
        MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.get("/api/import629s", uriVars)
                .contentType(MediaType.APPLICATION_JSON);

        Import629DTO import629DTO = new Import629DTO();
        ZoneId zone = ZoneId.of("UTC");
        import629DTO.setDateAop(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(zone).toInstant()));
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

        ObjectMapper objectMapper = new ObjectMapper();
        MockHttpServletRequestBuilder requestBuilder = contentTypeResult
                .content(objectMapper.writeValueAsString(import629DTO));
        Object[] controllers = new Object[]{import629Resource};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Resource#createImport629(Import629DTO)}
     */
    @Test
    void testCreateImport6292() throws Exception {
        when(import629Service.findAll()).thenReturn(new ArrayList<>());

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
        String content = (new ObjectMapper()).writeValueAsString(import629DTO);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/import629s")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link Import629Resource#deleteImport629(UUID)}
     */
    @Test
    void testDeleteImport629() throws Exception {
        // Arrange
        // TODO: Populate arranged inputs
        Object[] uriVars = new Object[]{UUID.randomUUID()};
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/import629s/{id}", uriVars);
        Object[] controllers = new Object[]{import629Resource};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Resource#deleteImport629(UUID)}
     */
    @Test
    void testDeleteImport6292() throws Exception {
        doNothing().when(import629Service).delete((UUID) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/import629s/{id}",
                UUID.randomUUID());
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    /**
     * Method under test: {@link Import629Resource#deleteImport629(UUID)}
     */
    @Test
    void testDeleteImport6293() throws Exception {
        doNothing().when(import629Service).delete((UUID) any());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/api/import629s/{id}",
                UUID.randomUUID());
        deleteResult.characterEncoding("Encoding");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(deleteResult);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    /**
     * Method under test: {@link Import629Resource#getAllImport629s()}
     */
    @Test
    void testGetAllImport629s() throws Exception {
        // Arrange
        // TODO: Populate arranged inputs
        Object[] uriVars = new Object[]{};
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/import629s", uriVars);
        Object[] controllers = new Object[]{import629Resource};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Resource#getAllImport629s()}
     */
    @Test
    void testGetAllImport629s2() throws Exception {
        when(import629Service.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/import629s");
        MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link Import629Resource#getAllImport629s()}
     */
    @Test
    void testGetAllImport629s3() throws Exception {
        when(import629Service.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/api/import629s");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link Import629Resource#getImport629(UUID)}
     */
    @Test
    void testGetImport629() throws Exception {
        // Arrange
        // TODO: Populate arranged inputs
        Object[] uriVars = new Object[]{UUID.randomUUID()};
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/import629s/{id}", uriVars);
        Object[] controllers = new Object[]{import629Resource};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Resource#updateImport629(UUID, Import629DTO)}
     */
    @Test
    void testUpdateImport629() throws Exception {
        // Arrange
        // TODO: Populate arranged inputs
        Object[] uriVars = new Object[]{UUID.randomUUID()};
        MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.put("/api/import629s/{id}", uriVars)
                .contentType(MediaType.APPLICATION_JSON);

        Import629DTO import629DTO = new Import629DTO();
        ZoneId zone = ZoneId.of("UTC");
        import629DTO.setDateAop(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(zone).toInstant()));
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

        ObjectMapper objectMapper = new ObjectMapper();
        MockHttpServletRequestBuilder requestBuilder = contentTypeResult
                .content(objectMapper.writeValueAsString(import629DTO));
        Object[] controllers = new Object[]{import629Resource};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Import629Resource#updateImport629(UUID, Import629DTO)}
     */
    @Test
    void testUpdateImport6292() throws Exception {
        doNothing().when(import629Service).update((UUID) any(), (Import629DTO) any());

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
        String content = (new ObjectMapper()).writeValueAsString(import629DTO);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .put("/api/import629s/{id}", UUID.randomUUID())
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

