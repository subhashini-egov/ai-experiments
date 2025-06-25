package org.egov.assetregistry.repository;

import org.egov.assetregistry.model.AssetAMCVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssetAMCVisitRepository extends JpaRepository<AssetAMCVisit, UUID> {
}
