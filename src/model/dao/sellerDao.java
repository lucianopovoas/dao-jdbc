package model.dao;

import model.entities.Seller;

import java.util.List;

public interface sellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void insert(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
