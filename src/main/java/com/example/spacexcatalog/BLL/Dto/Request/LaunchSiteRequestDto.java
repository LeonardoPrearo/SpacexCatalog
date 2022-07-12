package com.example.spacexcatalog.BLL.Dto.Request;

import com.example.spacexcatalog.BLL.Dto.Response.MissileResponseDto;

import java.util.List;

public class LaunchSiteRequestDto {

    private String name;

    private List<MissileResponseDto> missileResponseDtoList;

    public LaunchSiteRequestDto(String name, List<MissileResponseDto> missileResponseDtoList) {
        this.name = name;
        this.missileResponseDtoList = missileResponseDtoList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MissileResponseDto> getMissileResponseDtoList() {
        return missileResponseDtoList;
    }

    public void setMissileRequestDtoList(List<MissileResponseDto> missileResponseDtoList) {
        this.missileResponseDtoList = missileResponseDtoList;
    }

    @Override
    public String toString() {
        return "LaunchSiteRequestDto{" +
                "name='" + name + '\'' +
                ", missileResponseDtoList=" + missileResponseDtoList +
                '}';
    }
}
