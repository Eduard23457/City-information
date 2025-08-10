package org.example.cityinformation.service;

import org.example.cityinformation.dto.CityRequestDto;
import org.example.cityinformation.dto.CityResponseDto;

public interface CityService {
    CityResponseDto addCity(CityRequestDto cityRequestDto);
}
