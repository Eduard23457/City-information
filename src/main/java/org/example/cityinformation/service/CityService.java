package org.example.cityinformation.service;

import org.example.cityinformation.dto.CityRequestDto;
import org.example.cityinformation.dto.CityResponseDto;
import org.example.cityinformation.entity.City;

import java.util.List;

public interface CityService {
    CityResponseDto addCity(CityRequestDto cityRequestDto);

    List<CityResponseDto>findAll();

    CityResponseDto findById(Long id);

    CityResponseDto update(Long id, CityRequestDto cityRequestDto);

    void deleteCity(Long id);
}
