package org.generation.GradleDemo.Service;



import org.generation.GradleDemo.entity.Image;

public interface ImageService {
	Image getImageById(Long id);
	Image createImage(Image image);
}
