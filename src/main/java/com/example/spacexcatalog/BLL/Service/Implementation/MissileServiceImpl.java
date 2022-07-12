package com.example.spacexcatalog.BLL.Service.Implementation;

import com.example.spacexcatalog.BLL.Dto.Request.MissileRequestDto;
import com.example.spacexcatalog.BLL.Dto.Response.MissileResponseDto;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Request.MissileRequestMapper;
import com.example.spacexcatalog.BLL.Mapper.Implementation.Response.MissileResponseMapper;
import com.example.spacexcatalog.BLL.Service.Abstraction.MissileService;
import com.example.spacexcatalog.DAL.Entities.Missile;
import com.example.spacexcatalog.DAL.Repositories.MissileRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MissileServiceImpl implements MissileService {

    private final MissileRepository missileRepository;
    private final MissileRequestMapper  missileRequestMapper = Mappers.getMapper(MissileRequestMapper.class);
    private final MissileResponseMapper missileResponseMapper = Mappers.getMapper(MissileResponseMapper.class);

    public MissileServiceImpl(MissileRepository missileRepository) {
        this.missileRepository = missileRepository;
    }

    @Override
    public void saveMissile(MissileRequestDto missileRequestDto) {
        Missile missile = missileRequestMapper.asEntity(missileRequestDto);
        missileRepository.save(missile);
    }

    @Override
    public List<MissileResponseDto> findAll() {
        List<Missile> missileList = missileRepository.findAll();
        List<MissileResponseDto> missileResponseDtoList = new ArrayList<>();
        for (Missile missile : missileList){
            MissileResponseDto missileResponseDto = missileResponseMapper.asDTO(missile);
            missileResponseDtoList.add(missileResponseDto);
        }
        return missileResponseDtoList;
    }

    @Override
    public List<MissileResponseDto> updateById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
