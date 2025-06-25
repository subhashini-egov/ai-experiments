package com.example.assetregistry.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
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

    // getters and setters
    public UUID getAmcID() {
        return amcID;
    }

    public void setAmcID(UUID amcID) {
        this.amcID = amcID;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UUID getAssetID() {
        return assetID;
    }

    public void setAssetID(UUID assetID) {
        this.assetID = assetID;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public Long getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Long contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Long getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Long contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public List<String> getVisitSchedule() {
        return visitSchedule;
    }

    public void setVisitSchedule(List<String> visitSchedule) {
        this.visitSchedule = visitSchedule;
    }

    public List<AssetAMCVisit> getVisits() {
        return visits;
    }

    public void setVisits(List<AssetAMCVisit> visits) {
        this.visits = visits;
    }
}
