package org.egov.assetregistry.service;

import org.egov.assetregistry.model.AssetAMCVisit;
import org.egov.assetregistry.repository.AssetAMCVisitRepository;
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
class AssetAMCVisitServiceTest {

    @Mock
    private AssetAMCVisitRepository visitRepository;

    @InjectMocks
    private AssetAMCVisitService visitService;

    private AssetAMCVisit visit;

    @BeforeEach
    void setUp() {
        visit = new AssetAMCVisit();
    }

    @Test
    void createShouldSaveVisit() {
        when(visitRepository.save(visit)).thenReturn(visit);
        AssetAMCVisit result = visitService.create(visit);
        assertEquals(visit, result);
        verify(visitRepository).save(visit);
    }

    @Test
    void updateShouldSaveVisit() {
        when(visitRepository.save(visit)).thenReturn(visit);
        AssetAMCVisit result = visitService.update(visit);
        assertEquals(visit, result);
        verify(visitRepository).save(visit);
    }

    @Test
    void searchShouldReturnAllVisits() {
        List<AssetAMCVisit> visits = Arrays.asList(visit);
        when(visitRepository.findAll()).thenReturn(visits);
        List<AssetAMCVisit> result = visitService.search();
        assertEquals(visits, result);
        verify(visitRepository).findAll();
    }

    @Test
    void getShouldReturnVisitWhenExists() {
        UUID id = UUID.randomUUID();
        when(visitRepository.findById(id)).thenReturn(Optional.of(visit));
        Optional<AssetAMCVisit> result = visitService.get(id);
        assertTrue(result.isPresent());
        assertEquals(visit, result.get());
        verify(visitRepository).findById(id);
    }

    @Test
    void getShouldReturnEmptyWhenNotExists() {
        UUID id = UUID.randomUUID();
        when(visitRepository.findById(id)).thenReturn(Optional.empty());
        Optional<AssetAMCVisit> result = visitService.get(id);
        assertTrue(result.isEmpty());
        verify(visitRepository).findById(id);
    }
}
