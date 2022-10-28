package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.ImageAccessory;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.ImageAccessoryRepository;
import com.grupo7.vinoteca.services.ImageAccessoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageAccessoryServiceImpl extends BaseServiceImp<ImageAccessory, Long> implements ImageAccessoryService {

    @Autowired
    private ImageAccessoryRepository imageAccessoryRepository;

    public ImageAccessoryServiceImpl(BaseRepository<ImageAccessory, Long> baseRepository) {
        super(baseRepository);
    }
}
