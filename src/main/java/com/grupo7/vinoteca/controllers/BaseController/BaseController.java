package com.grupo7.vinoteca.controllers.BaseController;

import com.grupo7.vinoteca.entities.Base;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends Base,ID extends Serializable> {

    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getAll(Integer page);

    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update( @RequestBody E entity, @PathVariable Long id);

    public ResponseEntity<?> delete(@PathVariable ID id);

}