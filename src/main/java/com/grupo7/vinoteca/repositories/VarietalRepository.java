package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Varietal;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

@Repository
public interface VarietalRepository extends BaseRepository<Varietal,Long>{
}
