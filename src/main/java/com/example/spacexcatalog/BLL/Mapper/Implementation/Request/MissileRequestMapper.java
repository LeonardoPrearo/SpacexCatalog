package com.example.spacexcatalog.BLL.Mapper.Implementation.Request;

import com.example.spacexcatalog.BLL.Dto.Request.MissileRequestDto;
import com.example.spacexcatalog.BLL.Mapper.Abstraction.GenericRequestMapper;
import com.example.spacexcatalog.DAL.Entities.Missile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MissileRequestMapper extends GenericRequestMapper<Missile, MissileRequestDto>{
}
