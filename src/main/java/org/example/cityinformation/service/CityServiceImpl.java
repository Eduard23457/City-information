package org.example.cityinformation.service;

import lombok.RequiredArgsConstructor;
import org.example.cityinformation.dto.CityRequestDto;
import org.example.cityinformation.dto.CityResponseDto;
import org.example.cityinformation.entity.City;
import org.example.cityinformation.mapper.CityMapper;
import org.example.cityinformation.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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

    @Override
    public List<CityResponseDto> findAll() {
        List<City> allCities = cityRepository.findAll();
        List<CityResponseDto> cityResponseDtos = cityMapper.allCity(allCities);
        return cityResponseDtos;

    }

    @Override
    public CityResponseDto findById(Long id) {
        City city = cityRepository.findById(id).orElseThrow(() -> new NoSuchElementException("City with id " + id + " not found"));
        CityResponseDto response = cityMapper.toResponse(city);
        return response;


    }


}
