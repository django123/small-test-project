package io.bootify.my_app_test.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.bootify.my_app_test.domain.Operation;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Import629DTO {

    private UUID id;

    @NotNull
    private Double mnt1;

    @NotNull
    private Double mtn2;

    @Size(max = 255)
    private String siegeDenot;

    @Size(max = 255)
    private String denote;

    @Size(max = 255)
    private String entite2;

    @Size(max = 255)
    private String entite3;

    @Size(max = 255)
    private String entite4;

    private String dateTreso;

    private Date dateAop;

    private UUID importOperation;


}
