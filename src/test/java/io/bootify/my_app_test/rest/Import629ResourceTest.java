package io.bootify.my_app_test.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.bootify.my_app_test.domain.Import629;
import io.bootify.my_app_test.domain.Operation;
import io.bootify.my_app_test.model.Import629DTO;
import io.bootify.my_app_test.model.Import629LightDTO;
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
import java.util.HashMap;
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
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {Import629Resource.class,
        Import629Service.class})
@ExtendWith(SpringExtension.class)
class Import629ResourceTest {
    @MockBean
    private Import629Repository import629Repository;

    @Autowired
    private Import629Resource import629Resource;

    @MockBean
    private Import629Service import629Service;

    @MockBean
    private OperationRepository operationRepository;


    /**
     * Method under test: {@link Import629Resource#addImportFraude(UUID, Import629LightDTO)}
     */
    @Test
    void testAddImportFraude() throws Exception {
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
        import629.setTypeImport("Type Import");
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

        Import629LightDTO import629LightDTO = new Import629LightDTO();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629LightDTO.setDateAccoc(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import629LightDTO.setLibac("Libac");
        import629LightDTO.setMntAccoc(10.0d);
        import629LightDTO.setTypeImport("Type Import");
        String content = (new ObjectMapper()).writeValueAsString(import629LightDTO);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/api/import629s/operation/{id}", UUID.randomUUID())
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":null,\"mnt1\":0.0,\"mtn2\":-10.0,\"siegeDenot\":\"Sdbr2\",\"denote\":\"Num CarteSdbr1\",\"entite2\":null,"
                                        + "\"entite3\":null,\"entite4\":null,\"dateTreso\":\"20221117\",\"dateAop\":1658527200000,\"libac\":\"Libac\","
                                        + "\"importOperation\":null}"));
    }

    /**
     * Method under test: {@link Import629Resource#addImportFraude(UUID, Import629LightDTO)}
     */
    @Test
    void testAddImportFraude2() throws Exception {
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
        import629.setTypeImport("Type Import");
        when(import629Repository.save((Import629) any())).thenReturn(import629);

        Operation operation1 = new Operation();
        operation1.setDateCreated(null);
        operation1.setDossier2("Dossier2");
        operation1.setDossier3("Dossier3");
        operation1.setId(null);
        operation1.setImportOperationImport629s(new HashSet<>());
        operation1.setLastUpdated(null);
        operation1.setLibBac("Lib Bac");
        operation1.setMtnComp(10.0d);
        operation1.setNumCarte("Num Carte");
        operation1.setSdbr1("Sdbr1");
        operation1.setSdbr2("Sdbr2");
        Optional<Operation> ofResult = Optional.of(operation1);
        when(operationRepository.findById((UUID) any())).thenReturn(ofResult);

        Import629LightDTO import629LightDTO = new Import629LightDTO();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        import629LightDTO.setDateAccoc(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        import629LightDTO.setLibac("Libac");
        import629LightDTO.setMntAccoc(10.0d);
        import629LightDTO.setTypeImport("Type Import");
        String content = (new ObjectMapper()).writeValueAsString(import629LightDTO);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/api/import629s/operation/{id}", UUID.randomUUID())
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":null,\"mnt1\":null,\"mtn2\":null,\"siegeDenot\":null,\"denote\":null,\"entite2\":null,\"entite3\":null,"
                                        + "\"entite4\":null,\"dateTreso\":null,\"dateAop\":null,\"libac\":null,\"importOperation\":null}"));
    }

    /**
     * Method under test: {@link Import629Resource#createImport629(Import629DTO)}
     */
    @Test
    void testCreateImport629() throws Exception {
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
        import629DTO.setLibac("Libac");
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
     * Method under test: {@link Import629Resource#getAll(int, int)}
     */
    @Test
    void testGetAll() throws Exception {
        when(import629Service.getAllImport(anyInt(), anyInt())).thenReturn(new HashMap<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/api/import629s/all");
        MockHttpServletRequestBuilder paramResult = getResult.param("limit", String.valueOf(1));
        MockHttpServletRequestBuilder requestBuilder = paramResult.param("page", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(import629Resource)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{}"));
    }
}

