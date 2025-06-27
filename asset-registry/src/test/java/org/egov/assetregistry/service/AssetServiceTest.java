package org.egov.assetregistry.service;

import org.egov.assetregistry.model.Asset;
import org.egov.assetregistry.repository.AssetRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AssetServiceTest {

    @Mock
    private AssetRepository assetRepository;

    @InjectMocks
    private AssetService assetService;

    private Asset asset;

    @BeforeEach
    void setUp() {
        asset = new Asset();
    }

    @Test
    void createShouldSaveAsset() {
        when(assetRepository.save(asset)).thenReturn(asset);
        Asset result = assetService.create(asset);
        assertEquals(asset, result);
        verify(assetRepository).save(asset);
    }

    @Test
    void updateShouldSaveAsset() {
        when(assetRepository.save(asset)).thenReturn(asset);
        Asset result = assetService.update(asset);
        assertEquals(asset, result);
        verify(assetRepository).save(asset);
    }

    @Test
    void searchShouldReturnAllAssets() {
        List<Asset> assets = Arrays.asList(asset);
        when(assetRepository.findAll()).thenReturn(assets);
        List<Asset> result = assetService.search();
        assertEquals(assets, result);
        verify(assetRepository).findAll();
    }

    @Test
    void getShouldReturnAssetWhenExists() {
        UUID id = UUID.randomUUID();
        when(assetRepository.findById(id)).thenReturn(Optional.of(asset));
        Optional<Asset> result = assetService.get(id);
        assertTrue(result.isPresent());
        assertEquals(asset, result.get());
        verify(assetRepository).findById(id);
    }

    @Test
    void getShouldReturnEmptyWhenNotExists() {
        UUID id = UUID.randomUUID();
        when(assetRepository.findById(id)).thenReturn(Optional.empty());
        Optional<Asset> result = assetService.get(id);
        assertTrue(result.isEmpty());
        verify(assetRepository).findById(id);
    }
}
