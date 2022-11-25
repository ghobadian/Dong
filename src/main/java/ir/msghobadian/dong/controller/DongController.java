package ir.msghobadian.dong.controller;

import ir.msghobadian.dong.dto.DongInputDTO;
import ir.msghobadian.dong.model.PersonEntity;
import ir.msghobadian.dong.model.ProductEntity;
import ir.msghobadian.dong.service.DongService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class DongController {
    private final DongService service;

    @PostMapping("/dongs")
    public ResponseEntity<ProductEntity> saveDong(@RequestBody DongInputDTO dong) {
        //TODO checkSecurity
        return ResponseEntity.ok(service.saveDong(dong));
    }

    @GetMapping("/dongs")
    public ResponseEntity<List<ProductEntity>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/dongs/{user-id}")
    public ResponseEntity<List<ProductEntity>> findDongsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(service.findByUserId(userId));
    }





}
