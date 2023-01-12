package io.bootify.my_app_test.domain;

import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Operation {

    @Id
    @Column(nullable = false, updatable = false, columnDefinition = "UUID")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(nullable = false)
    private Double mtnComp;

    @Column(nullable = false)
    private String numCarte;

    @Column(nullable = false)
    private String sdbr1;

    @Column(nullable = false)
    private String sdbr2;

    private String dossier2;
    private String dossier3;
    private String libBac;

    private String typeImport;

    private Double mntAccoc;

    private String libac;

    public String getLibBac() {
        return libBac;
    }

    public void setLibBac(String libBac) {
        this.libBac = libBac;
    }

    public Double getMntAccoc() {
        return mntAccoc;
    }

    public void setMntAccoc(Double mntAccoc) {
        this.mntAccoc = mntAccoc;
    }

    public String getTypeImport() {
        return typeImport;
    }

    public void setTypeImport(String typeImport) {
        this.typeImport = typeImport;
    }

    @OneToMany(mappedBy = "importOperation")
    private Set<Import629> importOperationImport629s;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
