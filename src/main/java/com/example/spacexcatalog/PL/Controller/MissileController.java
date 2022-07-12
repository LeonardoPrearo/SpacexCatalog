package com.example.spacexcatalog.PL.Controller;

import com.example.spacexcatalog.BLL.Dto.Request.MissileRequestDto;
import com.example.spacexcatalog.BLL.Dto.Response.MissileResponseDto;
import com.example.spacexcatalog.BLL.Service.Abstraction.MissileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missile")
@CrossOrigin("http://localhost:8080")
public class MissileController {

    private final MissileService missileService;

    public MissileController(MissileService missileService) {
        this.missileService = missileService;
    }

    @PostMapping
    ResponseEntity<Void> save(@RequestBody MissileRequestDto missileRequestDto){
        missileService.saveMissile(missileRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<List<MissileResponseDto>> getAll(){
        missileService.findAll();
        return new ResponseEntity<>(HttpStatus.FOUND);
    }
}
