package org.example.cityinformation.controller;

import lombok.RequiredArgsConstructor;
import org.example.cityinformation.dto.CityRequestDto;
import org.example.cityinformation.dto.CityResponseDto;
import org.example.cityinformation.entity.City;
import org.example.cityinformation.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @PostMapping("/add")
    public ResponseEntity<CityResponseDto> addCityInBd(@RequestBody CityRequestDto cityRequestDto) {
        CityResponseDto responseDto = cityService.addCity(cityRequestDto);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/all/city")
    public ResponseEntity<List<CityResponseDto>> findAll() {
        List<CityResponseDto> all = cityService.findAll();
        return ResponseEntity.ok(all);
    }


    @GetMapping("/city")
    public ResponseEntity<CityResponseDto> findById(@RequestParam Long id) {
        CityResponseDto cityResponseDto = cityService.findById(id);
        return ResponseEntity.ok(cityResponseDto);
    }

    @PutMapping("/update")
    public ResponseEntity<CityResponseDto> updateCity(@RequestParam Long id, @RequestBody CityRequestDto cityRequestDto) {
        CityResponseDto update = cityService.update(id, cityRequestDto);
        return ResponseEntity.ok(update);
    }

    public ResponseEntity<Void> deleteCity(@RequestParam Long id) {
        cityService.deleteCity(id);
        return ResponseEntity.noContent().build();
    }
}
