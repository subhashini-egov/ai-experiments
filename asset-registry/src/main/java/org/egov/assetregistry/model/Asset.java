package org.egov.assetregistry.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asset {
    @Id
    @GeneratedValue
    private UUID assetID;

    @NotNull
    private String tenantId;

    @NotNull
    private UUID facilityID;

    @NotNull
    private String assetTypeID;

    @NotNull
    private String serialNumber;

    private String modelNumber;

    @NotNull
    private String brandID;

    private String assetDetails;

    @NotNull
    private String warrantyStartDate;

    @NotNull
    private String warrantyDuration;

    @NotNull
    private String warrantyEndDate;

    private String wfStatus;

    @Column(columnDefinition = "boolean default true")
    private Boolean isActive;
}
