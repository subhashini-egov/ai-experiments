package org.egov.assetregistry.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssetAMC {
    @Id
    @GeneratedValue
    private UUID amcID;

    @NotNull
    private String tenantId;

    @NotNull
    private UUID assetID;

    private String contractNumber;

    private String vendorCode;

    private Long contractStartDate;

    private Long contractEndDate;

    @ElementCollection
    private List<String> visitSchedule;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AssetAMCVisit> visits;
}
