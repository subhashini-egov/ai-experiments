package org.egov.assetregistry.service;

import org.egov.assetregistry.model.Asset;
import org.egov.assetregistry.repository.AssetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AssetService {
    private final AssetRepository assetRepository;

    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public Asset create(Asset asset) {
        return assetRepository.save(asset);
    }

    public Asset update(Asset asset) {
        return assetRepository.save(asset);
    }

    public List<Asset> search() {
        return assetRepository.findAll();
    }

    public Optional<Asset> get(UUID id) {
        return assetRepository.findById(id);
    }
}
