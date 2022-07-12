package com.example.spacexcatalog.BLL.Dto.Response;

import lombok.Data;

import java.util.List;
@Data
public class LaunchSiteResponseDto {

    private Long id;

    private String name;

    private List<MissileResponseDto> missileResponseDtoList;

}
