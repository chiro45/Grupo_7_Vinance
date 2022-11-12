package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Brand;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BrandRepository extends BaseRepository<Brand,Long>{

    @Query(value = "SELECT * FROM brands WHERE brands.brand = :brand ", nativeQuery = true)
    List<Brand> findBrandByName(String brand);

    boolean existsByBrand(String brand);

    Optional<Brand> findByBrand(String brand);
}
