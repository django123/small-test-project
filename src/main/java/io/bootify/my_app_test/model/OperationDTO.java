package io.bootify.my_app_test.model;

import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OperationDTO {

    private UUID id;

    @NotNull
    private Double mtnComp;

    @NotNull
    @Size(max = 255)
    private String numCarte;

    @NotNull
    @Size(max = 255)
    private String sdbr1;

    @NotNull
    @Size(max = 255)
    private String sdbr2;

    @Size(max = 255)
    private String dossier2;

    @Size(max = 255)
    private String dossier3;

    @Size(max = 255)
    private String libBac;

}
