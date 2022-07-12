package com.example.spacexcatalog.BLL.Dto.Response;

import java.util.List;

public class LaunchSiteResponseDto {

    private Long id;

    private String name;

    private List<MissileResponseDto> missileResponseDtoList;

    public LaunchSiteResponseDto(Long id, String name, List<MissileResponseDto> missileResponseDtoList) {
        this.id = id;
        this.name = name;
        this.missileResponseDtoList = missileResponseDtoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setMissileResponseDtoList(List<MissileResponseDto> missileResponseDtoList) {
        this.missileResponseDtoList = missileResponseDtoList;
    }

    @Override
    public String toString() {
        return "LaunchSiteResponseDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", missileResponseDtoList=" + missileResponseDtoList +
                '}';
    }
}
