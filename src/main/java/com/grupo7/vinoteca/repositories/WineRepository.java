package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WineRepository extends BaseRepository<Wine, Long>  {

    @Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:name% ", nativeQuery = true)
    List<Wine> findWineForName(String name);

    @Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:name% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForNamePaged(String name, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:varietal% ", nativeQuery = true)
    List<Wine> findWineForVarietal(String varietal);

    @Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:varietal% ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForVarietalPaged(String varietal, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.price >= :price ", nativeQuery = true)
    List<Wine> findWineForPriceUpper(float price);

    @Query(value = "SELECT * FROM wines WHERE wines.price >= :price ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForPriceUpperPaged(float price, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.price <= :price ", nativeQuery = true)
    List<Wine> findWineForPriceLower(float price);

    @Query(value = "SELECT * FROM wines WHERE wines.price <= :price ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForPriceLowerPaged(float price, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.price == :price ", nativeQuery = true)
    List<Wine> findWineForPriceEquals(float price);

    @Query(value = "SELECT * FROM wines WHERE wines.price == :price ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForPriceEqualsPaged(float price, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.active :active ", nativeQuery = true)
    List<Wine> findWineForActive(boolean active);

    @Query(value = "SELECT * FROM wines WHERE wines.active :active ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForActivePaged(boolean active, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.brand LIKE %:brand% ", nativeQuery = true)
    List<Wine> findWineForBrand(String brand);

    @Query(value = "SELECT * FROM wines WHERE wines.brand LIKE %:brand% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForBrandPaged(String brand, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.category LIKE %:category% ", nativeQuery = true)
    List<Wine> findWineForCategory(String category);

    @Query(value = "SELECT * FROM wines WHERE wines.category LIKE %:category% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForCategoryPaged(String category, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.stock > 0 ", nativeQuery = true)
    List<Wine> findWineHasStock();

    @Query(value = "SELECT * FROM wines WHERE wines.stock > 0 ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineHasStockPaged(Pageable pageable);
}