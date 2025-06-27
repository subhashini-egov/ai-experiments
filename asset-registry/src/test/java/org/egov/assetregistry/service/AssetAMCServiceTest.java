package org.egov.assetregistry.service;

import org.egov.assetregistry.model.AssetAMC;
import org.egov.assetregistry.repository.AssetAMCRepository;
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
class AssetAMCServiceTest {

    @Mock
    private AssetAMCRepository amcRepository;

    @InjectMocks
    private AssetAMCService amcService;

    private AssetAMC amc;

    @BeforeEach
    void setUp() {
        amc = new AssetAMC();
    }

    @Test
    void createShouldSaveAMC() {
        when(amcRepository.save(amc)).thenReturn(amc);
        AssetAMC result = amcService.create(amc);
        assertEquals(amc, result);
        verify(amcRepository).save(amc);
    }

    @Test
    void updateShouldSaveAMC() {
        when(amcRepository.save(amc)).thenReturn(amc);
        AssetAMC result = amcService.update(amc);
        assertEquals(amc, result);
        verify(amcRepository).save(amc);
    }

    @Test
    void searchShouldReturnAllAMCs() {
        List<AssetAMC> amcs = Arrays.asList(amc);
        when(amcRepository.findAll()).thenReturn(amcs);
        List<AssetAMC> result = amcService.search();
        assertEquals(amcs, result);
        verify(amcRepository).findAll();
    }

    @Test
    void getShouldReturnAMCWhenExists() {
        UUID id = UUID.randomUUID();
        when(amcRepository.findById(id)).thenReturn(Optional.of(amc));
        Optional<AssetAMC> result = amcService.get(id);
        assertTrue(result.isPresent());
        assertEquals(amc, result.get());
        verify(amcRepository).findById(id);
    }

    @Test
    void getShouldReturnEmptyWhenNotExists() {
        UUID id = UUID.randomUUID();
        when(amcRepository.findById(id)).thenReturn(Optional.empty());
        Optional<AssetAMC> result = amcService.get(id);
        assertTrue(result.isEmpty());
        verify(amcRepository).findById(id);
    }
}
