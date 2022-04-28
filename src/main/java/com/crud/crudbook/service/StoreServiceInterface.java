package com.crud.crudbook.service;

import com.crud.crudbook.entity.Store;

import java.util.List;

public interface StoreServiceInterface {

    List<Store> getAllStores();

    Store saveStore(Store store);

    Store updateStore(Store store);

    void deleteStore(Long id);
}
