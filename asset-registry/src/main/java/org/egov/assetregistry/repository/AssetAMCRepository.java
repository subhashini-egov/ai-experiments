package org.egov.assetregistry.repository;

import org.egov.assetregistry.model.AssetAMC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssetAMCRepository extends JpaRepository<AssetAMC, UUID> {
}
