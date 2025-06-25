package com.example.assetregistry.service;

import com.example.assetregistry.model.AssetAMC;
import com.example.assetregistry.repository.AssetAMCRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AssetAMCService {
    private final AssetAMCRepository repository;

    public AssetAMCService(AssetAMCRepository repository) {
        this.repository = repository;
    }

    public AssetAMC create(AssetAMC amc) {
        return repository.save(amc);
    }

    public AssetAMC update(AssetAMC amc) {
        return repository.save(amc);
    }

    public List<AssetAMC> search() {
        return repository.findAll();
    }

    public Optional<AssetAMC> get(UUID id) {
        return repository.findById(id);
    }
}
