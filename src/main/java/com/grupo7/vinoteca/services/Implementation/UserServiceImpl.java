package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.UserRepository;
import com.grupo7.vinoteca.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImp<User, Long> implements UserService {

    @Autowired
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

    @Override
    public List<User> findUserByName(String name) throws Exception {
        try {
            List<User> users = userRepository.findUserByName(name);
            if(users.size() > 0){
                return users;
            }else{
                return null;
            }
        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<User> findUserByName(String name, Pageable pageable) throws Exception {
        try {
            Page<User> users = userRepository.findUserByNamePaged(name, pageable);
            return users;
        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }




}