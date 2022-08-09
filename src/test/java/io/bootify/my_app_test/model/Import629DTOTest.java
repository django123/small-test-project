package io.bootify.my_app_test.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class Import629DTOTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Import629DTO}
     *   <li>{@link Import629DTO#setDateAop(Date)}
     *   <li>{@link Import629DTO#setDateTreso(String)}
     *   <li>{@link Import629DTO#setDenote(String)}
     *   <li>{@link Import629DTO#setEntite2(String)}
     *   <li>{@link Import629DTO#setEntite3(String)}
     *   <li>{@link Import629DTO#setEntite4(String)}
     *   <li>{@link Import629DTO#setId(UUID)}
     *   <li>{@link Import629DTO#setImportOperation(UUID)}
     *   <li>{@link Import629DTO#setLibac(String)}
     *   <li>{@link Import629DTO#setMnt1(Double)}
     *   <li>{@link Import629DTO#setMtn2(Double)}
     *   <li>{@link Import629DTO#setSiegeDenot(String)}
     *   <li>{@link Import629DTO#getDateAop()}
     *   <li>{@link Import629DTO#getDateTreso()}
     *   <li>{@link Import629DTO#getDenote()}
     *   <li>{@link Import629DTO#getEntite2()}
     *   <li>{@link Import629DTO#getEntite3()}
     *   <li>{@link Import629DTO#getEntite4()}
     *   <li>{@link Import629DTO#getId()}
     *   <li>{@link Import629DTO#getImportOperation()}
     *   <li>{@link Import629DTO#getLibac()}
     *   <li>{@link Import629DTO#getMnt1()}
     *   <li>{@link Import629DTO#getMtn2()}
     *   <li>{@link Import629DTO#getSiegeDenot()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Import629DTO actualImport629DTO = new Import629DTO();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualImport629DTO.setDateAop(fromResult);
        actualImport629DTO.setDateTreso("2020-03-01");
        actualImport629DTO.setDenote("Denote");
        actualImport629DTO.setEntite2("Entite2");
        actualImport629DTO.setEntite3("Entite3");
        actualImport629DTO.setEntite4("Entite4");
        UUID randomUUIDResult = UUID.randomUUID();
        actualImport629DTO.setId(randomUUIDResult);
        UUID randomUUIDResult1 = UUID.randomUUID();
        actualImport629DTO.setImportOperation(randomUUIDResult1);
        actualImport629DTO.setLibac("Libac");
        actualImport629DTO.setMnt1(10.0d);
        actualImport629DTO.setMtn2(10.0d);
        actualImport629DTO.setSiegeDenot("Siege Denot");
        assertSame(fromResult, actualImport629DTO.getDateAop());
        assertEquals("2020-03-01", actualImport629DTO.getDateTreso());
        assertEquals("Denote", actualImport629DTO.getDenote());
        assertEquals("Entite2", actualImport629DTO.getEntite2());
        assertEquals("Entite3", actualImport629DTO.getEntite3());
        assertEquals("Entite4", actualImport629DTO.getEntite4());
        assertSame(randomUUIDResult, actualImport629DTO.getId());
        assertSame(randomUUIDResult1, actualImport629DTO.getImportOperation());
        assertEquals("Libac", actualImport629DTO.getLibac());
        assertEquals(10.0d, actualImport629DTO.getMnt1().doubleValue());
        assertEquals(10.0d, actualImport629DTO.getMtn2().doubleValue());
        assertEquals("Siege Denot", actualImport629DTO.getSiegeDenot());
    }
}

