package org.example.cityinformation.controller;

import lombok.RequiredArgsConstructor;
import org.example.cityinformation.dto.CityRequestDto;
import org.example.cityinformation.dto.CityResponseDto;
import org.example.cityinformation.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
