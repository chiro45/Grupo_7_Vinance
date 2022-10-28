package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.ImageWine;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.ImageWineRepository;
import com.grupo7.vinoteca.services.ImageWineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageWineServiceImpl extends BaseServiceImp<ImageWine, Long> implements ImageWineService {

    @Autowired
    private ImageWineRepository imageWineRepository;

    public ImageWineServiceImpl(BaseRepository<ImageWine, Long> baseRepository) {
        super(baseRepository);
    }
}
