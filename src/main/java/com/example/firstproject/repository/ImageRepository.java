package com.example.firstproject.repository;

import com.example.firstproject.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    boolean existsByImageName(String imageName);
}
