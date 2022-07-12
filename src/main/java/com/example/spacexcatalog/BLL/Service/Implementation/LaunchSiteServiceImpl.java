package com.example.spacexcatalog.BLL.Service.Implementation;

import com.example.spacexcatalog.BLL.Dto.Request.LaunchSiteRequestDto;
import com.example.spacexcatalog.BLL.Dto.Response.LaunchSiteResponseDto;
import com.example.spacexcatalog.BLL.Dto.Response.MissileResponseDto;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Request.LaunchSiteRequestMapper;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Response.LaunchSiteResponseMapper;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Response.MissileResponseMapper;
import com.example.spacexcatalog.BLL.Service.Abstraction.LaunchSiteService;
import com.example.spacexcatalog.DAL.Entities.LaunchSite;
import com.example.spacexcatalog.DAL.Entities.Missile;
import com.example.spacexcatalog.DAL.Repositories.LaunchSiteRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaunchSiteServiceImpl implements LaunchSiteService {

    private final LaunchSiteRepository launchSiteRepository;
    private final LaunchSiteRequestMapper launchSiteRequestMapper = Mappers.getMapper(LaunchSiteRequestMapper.class);
    private final LaunchSiteResponseMapper launchSiteResponseMapper = Mappers.getMapper(LaunchSiteResponseMapper.class);

    private final MissileResponseMapper missileResponseMapper = Mappers.getMapper(MissileResponseMapper.class);

    public LaunchSiteServiceImpl(LaunchSiteRepository launchSiteRepository) {
        this.launchSiteRepository = launchSiteRepository;
    }

    @Override
    public void saveLaunchSite(LaunchSiteRequestDto launchSiteRequestDto) {
        LaunchSite launchSite = launchSiteRequestMapper.asEntity(launchSiteRequestDto);
        /*List<MissileResponseDto> missileResponseDtoList = missileResponseMapper;
        for (MissileResponseDto missileResponseDto : missileResponseDtoList) {

        }*/
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
