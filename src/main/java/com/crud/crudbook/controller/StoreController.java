package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Store;
import com.crud.crudbook.service.StoreServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class StoreController {

    @Autowired
    private StoreServiceInterface service;

    @GetMapping("get/stores")
    public List<Store> getAllStores(){
        return service.getAllStores();
    }

    @PostMapping("save/store")
    public Store saveStore(@RequestBody Store store){
        return service.saveStore(store);
    }

    @PutMapping("update/store")
    public Store updateStore(@RequestBody Store store){
        return service.updateStore(store);
    }

    @DeleteMapping("delete/store")
    public void deleteStore(@PathVariable Long id){
        service.deleteStore(id);
    }
}
