package org.egov.assetregistry.service;

import org.egov.assetregistry.model.AssetAMCVisit;
import org.egov.assetregistry.repository.AssetAMCVisitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AssetAMCVisitService {
    private final AssetAMCVisitRepository repository;

    public AssetAMCVisitService(AssetAMCVisitRepository repository) {
        this.repository = repository;
    }

    public AssetAMCVisit create(AssetAMCVisit visit) {
        return repository.save(visit);
    }

    public AssetAMCVisit update(AssetAMCVisit visit) {
        return repository.save(visit);
    }

    public List<AssetAMCVisit> search() {
        return repository.findAll();
    }

    public Optional<AssetAMCVisit> get(UUID id) {
        return repository.findById(id);
    }
}
