package com.example.spacexcatalog.DAL.Repositories;

import com.example.spacexcatalog.DAL.Entities.LaunchSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaunchSiteRepository extends JpaRepository<LaunchSite, Long> {
}
