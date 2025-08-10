package org.example.cityinformation.service;

import lombok.RequiredArgsConstructor;
import org.example.cityinformation.dto.CityRequestDto;
import org.example.cityinformation.dto.CityResponseDto;
import org.example.cityinformation.entity.City;
import org.example.cityinformation.mapper.CityMapper;
import org.example.cityinformation.repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    @Override
    public CityResponseDto addCity(CityRequestDto cityRequestDto) {
        City city = cityMapper.toEntity(cityRequestDto);
        cityRepository.save(city);
        CityResponseDto response = cityMapper.toResponse(city);
        return response;
    }
}
