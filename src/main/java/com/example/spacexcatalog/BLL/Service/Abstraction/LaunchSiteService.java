package com.example.spacexcatalog.BLL.Service.Abstraction;

import com.example.spacexcatalog.BLL.Dto.Request.LaunchSiteRequestDto;
import com.example.spacexcatalog.BLL.Dto.Response.LaunchSiteResponseDto;

import java.util.List;

public interface LaunchSiteService {

    void saveLaunchSite(LaunchSiteRequestDto launchSiteRequestDto);

    List<LaunchSiteResponseDto> findAll();

    List<LaunchSiteResponseDto> updateById(Long id);

    void deleteById(Long id);
}
