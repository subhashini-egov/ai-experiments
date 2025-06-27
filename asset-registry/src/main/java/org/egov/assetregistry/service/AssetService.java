package org.egov.assetregistry.service;

import org.egov.assetregistry.model.Asset;
import org.egov.assetregistry.repository.AssetRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

    public Page<Asset> search(Pageable pageable) {
        return assetRepository.findAll(pageable);
    }

    public Optional<Asset> get(UUID id) {
        return assetRepository.findById(id);
    }
}
