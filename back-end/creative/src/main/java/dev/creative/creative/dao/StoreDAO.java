package dev.creative.creative.dao;

import dev.creative.creative.entity.StoreEntity;

import java.util.List;

public interface StoreDAO {

    public StoreEntity createStore(StoreEntity storeEntity);
    public StoreEntity readStore(long id);
    public List<StoreEntity> readAllStore();
    public boolean deleteStore(long id);
}