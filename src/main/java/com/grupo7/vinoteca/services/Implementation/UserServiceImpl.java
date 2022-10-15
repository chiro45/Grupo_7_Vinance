package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.UserRepository;
import com.grupo7.vinoteca.services.Implementation.BaseServiceImp;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends BaseServiceImp<User, Long> {

    private UserRepository userRepository;

    public UserServiceImpl(BaseRepository<User, Long> baseRepository) {

        super(baseRepository);
    }

}


