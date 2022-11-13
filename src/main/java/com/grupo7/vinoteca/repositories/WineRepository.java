package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WineRepository extends BaseRepository<Wine, Long> {

    //No funciona
    /*@Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:name% ", nativeQuery = true)
    List<Wine> findWineForName(String name);
    @Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:name% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForNamePaged(String name, Pageable pageable);*/

    //Funciona
    List<Wine> findByNameContaining(String name);

    Page<Wine> findByNameContaining(String name, Pageable pageable);

    //No funciona
    /*@Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:varietal% ", nativeQuery = true)
    List<Wine> findWineForVarietal(String varietal);
    @Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:varietal% ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForVarietalPaged(String varietal, Pageable pageable);*/

    //No funciona
   /* @Query(value = "SELECT * FROM wines WHERE wines.price >= :price ", nativeQuery = true)
    List<Wine> findWineForPriceUpper(float price);
    @Query(value = "SELECT * FROM wines WHERE wines.price >= :price ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForPriceUpperPaged(float price, Pageable pageable);*/

    //Funciona
    List<Wine> findWineByPriceGreaterThanEqual(float price);

    Page<Wine> findWineByPriceGreaterThanEqual(float price, Pageable pageable);

    //No funciona
    /*@Query(value = "SELECT * FROM wines WHERE wines.price <= :price ", nativeQuery = true)
    List<Wine> findWineForPriceLower(float price);
    @Query(value = "SELECT * FROM wines WHERE wines.price <= :price ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForPriceLowerPaged(float price, Pageable pageable);*/

    //Funciona
    List<Wine> findWineByPriceLessThanEqual(float price);

    Page<Wine> findWineByPriceLessThanEqual(float price, Pageable pageable);

    //No funciona
    /*@Query(value = "SELECT * FROM wines WHERE wines.active LIKE :active ", nativeQuery = true)
    List<Wine> findWineForActive(boolean active);
    @Query(value = "SELECT * FROM wines WHERE wines.active LIKE :active ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForActivePaged(boolean active, Pageable pageable);*/

    //Funciona
    List<Wine> findWineByActiveEquals(boolean active);

    Page<Wine> findWineByActiveEquals(boolean active, Pageable pageable);

    //No funciona
    /*@Query(value = "SELECT * FROM wines WHERE wines.brand LIKE %:brand% ", nativeQuery = true)
    List<Wine> findWineForBrand(String brand);
    @Query(value = "SELECT * FROM wines WHERE wines.brand LIKE %:brand% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForBrandPaged(String brand, Pageable pageable);*/

    //No funciona
    /*@Query(value = "SELECT * FROM wines WHERE wines.category LIKE %:category% ", nativeQuery = true)
    List<Wine> findWineForCategory(String category);
    @Query(value = "SELECT * FROM wines WHERE wines.category LIKE %:category% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForCategoryPaged(String category, Pageable pageable);*/

    //No funciona
    /*@Query(value = "SELECT * FROM wines WHERE wines.stock > 0 ", nativeQuery = true)
    List<Wine> findWineHasStock();
    @Query(value = "SELECT * FROM wines WHERE wines.stock > 0 ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineHasStockPaged(Pageable pageable);*/

    //Funciona
    List<Wine> findWineByStockGreaterThanEqual(int stock);

    Page<Wine> findWineByStockGreaterThanEqual(int stock, Pageable pageable);
}