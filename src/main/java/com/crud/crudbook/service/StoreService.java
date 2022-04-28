package com.crud.crudbook.service;

import com.crud.crudbook.entity.Store;
import com.crud.crudbook.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService implements StoreServiceInterface{

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @Override
    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public Store updateStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public void deleteStore(Long id) {
        storeRepository.deleteById(id);
    }
}
