package org.egov.assetregistry.controller;

import org.egov.assetregistry.model.Asset;
import org.egov.assetregistry.service.AssetService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.List;

@RestController
@RequestMapping("/v1/asset")
public class AssetController {
    private final AssetService service;

    public AssetController(AssetService service) {
        this.service = service;
    }

    @PostMapping("/_create")
    public ResponseEntity<Asset> create(@Valid @RequestBody Asset asset) {
        return new ResponseEntity<>(service.create(asset), HttpStatus.CREATED);
    }

    @PostMapping("/_update")
    public ResponseEntity<Asset> update(@Valid @RequestBody Asset asset) {
        return ResponseEntity.ok(service.update(asset));
    }

    @GetMapping("/_search")
    public ResponseEntity<Page<Asset>> search(Pageable pageable) {
        return ResponseEntity.ok(service.search(pageable));
    }

    @PostMapping("/workflow/_update")
    public ResponseEntity<Asset> updateWorkflow(@RequestParam UUID assetID, @RequestParam String wfStatus) {
        return service.get(assetID)
                .map(a -> { a.setWfStatus(wfStatus); return ResponseEntity.ok(service.update(a)); })
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/bulk/_create")
    public ResponseEntity<List<Asset>> bulkCreate(@Valid @RequestBody List<Asset> assets) {
        return new ResponseEntity<>(assets.stream().map(service::create).toList(), HttpStatus.CREATED);
    }
}
