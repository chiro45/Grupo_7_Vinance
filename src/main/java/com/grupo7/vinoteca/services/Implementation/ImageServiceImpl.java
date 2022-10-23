package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Image;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.ImageRepository;
import com.grupo7.vinoteca.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl extends BaseServiceImp<Image, Long> implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public ImageServiceImpl(BaseRepository<Image, Long> baseRepository) {
        super(baseRepository);
    }
}
