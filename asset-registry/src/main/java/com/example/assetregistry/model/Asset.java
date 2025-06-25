package com.example.assetregistry.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

@Entity
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

    private Boolean isActive = true;

    // getters and setters
    public UUID getAssetID() {
        return assetID;
    }

    public void setAssetID(UUID assetID) {
        this.assetID = assetID;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UUID getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(UUID facilityID) {
        this.facilityID = facilityID;
    }

    public String getAssetTypeID() {
        return assetTypeID;
    }

    public void setAssetTypeID(String assetTypeID) {
        this.assetTypeID = assetTypeID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public String getAssetDetails() {
        return assetDetails;
    }

    public void setAssetDetails(String assetDetails) {
        this.assetDetails = assetDetails;
    }

    public String getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(String warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    public String getWarrantyDuration() {
        return warrantyDuration;
    }

    public void setWarrantyDuration(String warrantyDuration) {
        this.warrantyDuration = warrantyDuration;
    }

    public String getWarrantyEndDate() {
        return warrantyEndDate;
    }

    public void setWarrantyEndDate(String warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
    }

    public String getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(String wfStatus) {
        this.wfStatus = wfStatus;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
