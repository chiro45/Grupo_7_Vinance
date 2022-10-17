package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.UserRepository;
import com.grupo7.vinoteca.services.Implementation.BaseServiceImp;
import com.grupo7.vinoteca.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl extends BaseServiceImp<User, Long> implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(BaseRepository<User, Long> baseRepository) {

        super(baseRepository);
    }

    @Override
    public User loginUser(String name, String password) throws Exception {
        try {
            List<User> arrUsers = userRepository.loginUser(name, password);

            if(arrUsers.size() > 0){

                return arrUsers.get(0);
            }else{
                return null;
            }

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }
}


