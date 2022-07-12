package com.example.spacexcatalog.BLL.Dto.Request;

import lombok.Data;

@Data
public class MissileRequestDto {

    private String name;

    private String description;

    private String image;

    private LaunchSiteRequestDto launchSiteRequestDto;
}
