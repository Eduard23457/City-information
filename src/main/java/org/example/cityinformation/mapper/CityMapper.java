package org.example.cityinformation.mapper;

import org.example.cityinformation.dto.CityRequestDto;
import org.example.cityinformation.dto.CityResponseDto;
import org.example.cityinformation.entity.City;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CityMapper {
    City toEntity(CityRequestDto cityRequestDto);

    CityResponseDto toResponse(City city);
}
