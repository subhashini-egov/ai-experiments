package com.example.assetregistry.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssetAMCVisit {
    @Id
    @GeneratedValue
    private UUID visitId;

    @NotNull
    private String tenantId;

    private UUID assetId;

    private UUID facilityId;

    private Long scheduledDate;

    private Long visitDate;

    private String engineerName;

    private String observations;

    private String nextDueDate;

    private String visitStatus;
}
