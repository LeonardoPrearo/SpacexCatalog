package com.example.spacexcatalog.DAL.Repositories;

import com.example.spacexcatalog.DAL.Entities.Missile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissileRepository extends JpaRepository<Missile, Long> {
}
