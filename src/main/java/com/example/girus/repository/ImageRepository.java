package com.example.girus.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.girus.entity.ImageEntity;


@Repository
public interface ImageRepository  extends JpaRepository<ImageEntity,Integer>{

//	String save(ImageEntity image);






}
