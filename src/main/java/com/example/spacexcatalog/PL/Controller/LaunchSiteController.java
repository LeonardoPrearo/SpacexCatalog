package com.example.spacexcatalog.PL.Controller;

import com.example.spacexcatalog.BLL.Dto.Request.LaunchSiteRequestDto;
import com.example.spacexcatalog.BLL.Dto.Response.LaunchSiteResponseDto;
import com.example.spacexcatalog.BLL.Service.Abstraction.LaunchSiteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/launch-site")
@CrossOrigin("http://localhost:8080")
public class LaunchSiteController {

    private final LaunchSiteService launchSiteService;

    public LaunchSiteController(LaunchSiteService launchSiteService) {
        this.launchSiteService = launchSiteService;
    }

    @PostMapping
    ResponseEntity<Void> save(@RequestBody LaunchSiteRequestDto launchSiteRequestDto){
        launchSiteService.saveLaunchSite(launchSiteRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<List<LaunchSiteResponseDto>> getAll(){
        launchSiteService.findAll();
        return new ResponseEntity<>(HttpStatus.FOUND);
    }
}
