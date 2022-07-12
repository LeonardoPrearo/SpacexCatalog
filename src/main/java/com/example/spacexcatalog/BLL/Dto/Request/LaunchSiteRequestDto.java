package com.example.spacexcatalog.BLL.Dto.Request;

import com.example.spacexcatalog.BLL.Dto.Response.MissileResponseDto;
import lombok.Data;

import java.util.List;
@Data
public class LaunchSiteRequestDto {

    private String name;

    private List<MissileRequestDto> missileRequestDtoList;

}
