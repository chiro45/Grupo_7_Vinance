package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements BaseService<User>{

    @Autowired
    private UserRepository userRepository;
    @Override
    @Transactional
    public List<User> findAll() throws Exception {
        try{
            List<User> entities = userRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User findById(long id) throws Exception {
        try{
            Optional<User> optional = userRepository.findById(id);
            return optional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User save(User entity) throws Exception {
        try{
            entity = userRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User update(User entity, long id) throws Exception {
        try{
            Optional<User> optional = userRepository.findById(id);
            User user = optional.get();
            user = userRepository.save(entity);
            return user;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(long id) throws Exception {
        try{
            if(userRepository.existsById(id)) {
                userRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
