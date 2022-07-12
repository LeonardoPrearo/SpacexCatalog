package com.example.spacexcatalog.BLL.Mapper.Implementation.Response;

import com.example.spacexcatalog.BLL.Dto.Response.LaunchSiteResponseDto;
import com.example.spacexcatalog.BLL.Mapper.Abstraction.GenericResponseMapper;
import com.example.spacexcatalog.DAL.Entities.LaunchSite;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LaunchSiteResponseMapper extends GenericResponseMapper<LaunchSite, LaunchSiteResponseDto> {
}
