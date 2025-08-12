package org.example.cityinformation.mapper;

import org.example.cityinformation.dto.CityRequestDto;
import org.example.cityinformation.dto.CityResponseDto;
import org.example.cityinformation.entity.City;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CityMapper {
    City toEntity(CityRequestDto cityRequestDto);

    CityResponseDto toResponse(City city);

    List<CityResponseDto>allCity(List<City>cities);

    void updateEntityFromDto(CityRequestDto cityRequestDto, @MappingTarget City city);
}
