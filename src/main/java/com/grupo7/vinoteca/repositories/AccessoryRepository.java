package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoryRepository  extends BaseRepository<Accessory, Long>  {
}
