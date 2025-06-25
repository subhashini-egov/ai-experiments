package com.example.assetregistry.controller;

import com.example.assetregistry.model.AssetAMC;
import com.example.assetregistry.service.AssetAMCService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/asset/amc")
public class AssetAMCController {
    private final AssetAMCService service;

    public AssetAMCController(AssetAMCService service) {
        this.service = service;
    }

    @PostMapping("/_create")
    public ResponseEntity<AssetAMC> create(@Valid @RequestBody AssetAMC amc) {
        return new ResponseEntity<>(service.create(amc), HttpStatus.CREATED);
    }

    @PostMapping("/_update")
    public ResponseEntity<AssetAMC> update(@Valid @RequestBody AssetAMC amc) {
        return ResponseEntity.ok(service.update(amc));
    }

    @GetMapping("/_search")
    public ResponseEntity<List<AssetAMC>> search() {
        return ResponseEntity.ok(service.search());
    }
}
