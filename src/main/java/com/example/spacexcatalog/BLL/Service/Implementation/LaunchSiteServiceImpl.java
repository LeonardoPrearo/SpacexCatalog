package com.example.spacexcatalog.BLL.Service.Implementation;

import com.example.spacexcatalog.BLL.Dto.Request.LaunchSiteRequestDto;
import com.example.spacexcatalog.BLL.Dto.Request.MissileRequestDto;
import com.example.spacexcatalog.BLL.Dto.Response.LaunchSiteResponseDto;
import com.example.spacexcatalog.BLL.Dto.Response.MissileResponseDto;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Request.LaunchSiteRequestMapper;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Request.MissileRequestMapper;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Response.LaunchSiteResponseMapper;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Response.MissileResponseMapper;
import com.example.spacexcatalog.BLL.Service.Abstraction.LaunchSiteService;
import com.example.spacexcatalog.DAL.Entities.LaunchSite;
import com.example.spacexcatalog.DAL.Entities.Missile;
import com.example.spacexcatalog.DAL.Repositories.LaunchSiteRepository;
import lombok.Data;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Data
@Service
public class LaunchSiteServiceImpl implements LaunchSiteService {

    private final LaunchSiteRepository launchSiteRepository;
    private final LaunchSiteRequestMapper launchSiteRequestMapper;
    private final LaunchSiteResponseMapper launchSiteResponseMapper;

    private final MissileResponseMapper missileResponseMapper;
    private final MissileRequestMapper missileRequestMapper;

    @Override
    public void saveLaunchSite(LaunchSiteRequestDto launchSiteRequestDto) {
        LaunchSite launchSite = launchSiteRequestMapper.asEntity(launchSiteRequestDto);
        List<Missile> missileList = new ArrayList<>();
        for (MissileRequestDto missile: launchSiteRequestDto.getMissileRequestDtoList()) {
            missileList.add(missileRequestMapper.asEntity(missile));
        }
        launchSite.setMissiles(missileList);
        for (Missile m : launchSite.getMissiles()) {
            m.setLaunchSite(launchSite);
        }
        launchSiteRepository.save(launchSite);
    }

    @Override
    public List<LaunchSiteResponseDto> findAll() {
        List<LaunchSite> launchSiteList = launchSiteRepository.findAll();
        List<LaunchSiteResponseDto> launchSiteResponseDtoList = new ArrayList<>();
        for (LaunchSite launchSite : launchSiteList){
            LaunchSiteResponseDto launchSiteResponseDto = launchSiteResponseMapper.asDTO(launchSite);
            launchSiteResponseDtoList.add(launchSiteResponseDto);
        }
        return launchSiteResponseDtoList;
    }

    @Override
    public List<LaunchSiteResponseDto> updateById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
