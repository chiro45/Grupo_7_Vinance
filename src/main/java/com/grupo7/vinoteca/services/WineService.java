package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WineService extends BaseService<Wine, Long> {

    List<Wine> findWineForName(String name) throws Exception;

    Page<Wine> findWineForNamePaged(String name, Pageable pageable) throws Exception;

    List<Wine> findWineForVarietal(String varietal) throws Exception;
    Page<Wine> findWineForVarietalPaged(String varietal, Pageable pageable) throws Exception;

    List<Wine> findWineForPriceUpper(double price) throws Exception;

    Page<Wine> findWineForPriceUpperPaged(double price, Pageable pageable) throws Exception;

    List<Wine> findWineForPriceLower(double price) throws Exception;

    Page<Wine> findWineForPriceLowerPaged(double price, Pageable pageable) throws Exception;

    List<Wine> findWineForActive(boolean active) throws Exception;

    Page<Wine> findWineForActivePaged(boolean active, Pageable pageable) throws Exception;

    List<Wine> findWineForBrand(String brand) throws Exception;
    Page<Wine> findWineForBrandPaged(String brand, Pageable pageable) throws Exception;

    List<Wine> findWineForCategory(String category) throws Exception;
    Page<Wine> findWineForCategoryPaged(String category, Pageable pageable) throws Exception;

    List<Wine> findWineHasStock(int stock) throws Exception;

    Page<Wine> findWineHasStockPaged(int stock, Pageable pageable) throws Exception;

    Page<Wine> findWineByAllPaged(String value, Pageable pageable) throws Exception;
    List<Wine> findWineByAll(String value) throws Exception;
}