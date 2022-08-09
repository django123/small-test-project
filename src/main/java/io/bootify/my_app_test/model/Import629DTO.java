package io.bootify.my_app_test.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;

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

    private String libac;

    private UUID importOperation;


}
