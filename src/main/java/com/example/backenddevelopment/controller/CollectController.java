package com.example.backenddevelopment.controller;

import com.example.backenddevelopment.daoimp.Collect;
import com.example.backenddevelopment.mapper.CollectMapper;
import com.example.backenddevelopment.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollectController {
    @Autowired
    CollectService collectService;
    @GetMapping("/collect")
    public int collect(Collect collect){
        return collectService.addCollectItem(collect);

    }
    @GetMapping("/getAllCollect")
    public List<Collect> getAllCollect(Integer id){

        return collectService.getAllCollect(id);
    }
    @GetMapping("/deleteCollectByVid")
    public int deleteCollectByVid(Integer vid){
        return collectService.deleteCollectItem(vid);
    }
}
