package com.example.spacexcatalog.BLL.Mapper.Implementation.Request;

import com.example.spacexcatalog.BLL.Dto.Request.LaunchSiteRequestDto;
import com.example.spacexcatalog.BLL.Mapper.Abstraction.GenericRequestMapper;
import com.example.spacexcatalog.DAL.Entities.LaunchSite;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LaunchSiteRequestMapper extends GenericRequestMapper<LaunchSite, LaunchSiteRequestDto> {
}
