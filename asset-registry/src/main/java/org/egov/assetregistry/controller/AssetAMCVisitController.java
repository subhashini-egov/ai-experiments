package org.egov.assetregistry.controller;

import org.egov.assetregistry.model.AssetAMCVisit;
import org.egov.assetregistry.service.AssetAMCVisitService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/asset/amc/visit")
public class AssetAMCVisitController {
    private final AssetAMCVisitService service;

    public AssetAMCVisitController(AssetAMCVisitService service) {
        this.service = service;
    }

    @PostMapping("/_create")
    public ResponseEntity<AssetAMCVisit> create(@Valid @RequestBody AssetAMCVisit visit) {
        return new ResponseEntity<>(service.create(visit), HttpStatus.CREATED);
    }

    @PostMapping("/_update")
    public ResponseEntity<AssetAMCVisit> update(@Valid @RequestBody AssetAMCVisit visit) {
        return ResponseEntity.ok(service.update(visit));
    }

    @GetMapping("/_search")
    public ResponseEntity<List<AssetAMCVisit>> search() {
        return ResponseEntity.ok(service.search());
    }
}
