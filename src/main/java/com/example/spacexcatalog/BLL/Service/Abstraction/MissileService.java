package com.example.spacexcatalog.BLL.Service.Abstraction;

import com.example.spacexcatalog.BLL.Dto.Request.LaunchSiteRequestDto;
import com.example.spacexcatalog.BLL.Dto.Request.MissileRequestDto;
import com.example.spacexcatalog.BLL.Dto.Response.MissileResponseDto;

import java.util.List;

public interface MissileService {

    void saveMissile(MissileRequestDto missileRequestDto);

    List<MissileResponseDto> findAll();

    void updateById(Long id, MissileRequestDto missileRequestDto);

    void deleteById(Long id);
}
