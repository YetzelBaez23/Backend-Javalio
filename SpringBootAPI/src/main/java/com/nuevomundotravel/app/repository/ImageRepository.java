package com.nuevomundotravel.app.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nuevomundotravel.app.entity.Image;


public interface ImageRepository extends CrudRepository <Image, Long> {
	List<Image> findByFullName (String fullName);  
	Image findById (long Id );
}

