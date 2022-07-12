package com.example.spacexcatalog.BLL.Mapper.Implementation.Response;

import com.example.spacexcatalog.BLL.Dto.Response.MissileResponseDto;
import com.example.spacexcatalog.BLL.Mapper.Abstraction.GenericResponseMapper;
import com.example.spacexcatalog.DAL.Entities.Missile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MissileResponseMapper extends GenericResponseMapper<Missile, MissileResponseDto> {
}
