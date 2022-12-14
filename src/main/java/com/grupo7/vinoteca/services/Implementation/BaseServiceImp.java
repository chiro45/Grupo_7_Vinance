package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Base;

import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImp <E extends Base, ID extends Serializable> implements BaseService<E,ID> {
    protected BaseRepository<E, ID> repository;

    public BaseServiceImp(BaseRepository<E,ID> baseRepository){
        this.repository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = repository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception{
        try{
            List<E> entities = repository.findAll();
            int start  =(int) pageable.getOffset();
            int end = Math.min((start + pageable.getPageSize()), entities.size());

            Page<E> page = new PageImpl<>(entities.subList(start,end), pageable,entities.size());

            return page;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> optional = repository.findById(id);
            return optional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = repository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(E entity, ID id) throws Exception {
        try{
            /*Optional<E> optional = repository.findById(id);
            E seller = optional.get();
            seller = repository.save(entity);
            repository.deleteById(id);
            return seller;*/
            if (repository.existsById(id))  {
                entity.setId((Long) id);
                repository.save(entity);
            }
           /* Optional<E> optional = repository.findById(id);
            repository.
            optional.get() = entity; */
           /* seller = repository.save(entity);
            repository.deleteById(id);*/
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if(repository.existsById(id)) {
                repository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}