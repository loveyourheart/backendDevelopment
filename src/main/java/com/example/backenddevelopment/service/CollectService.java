package com.example.backenddevelopment.service;

import com.example.backenddevelopment.domain.impl.Collect;
import com.example.backenddevelopment.dao.mapper.CollectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectService {
    @Autowired
    CollectMapper collectMapper;
    public int  addCollectItem(Collect collect){
        return collectMapper.addCollectItem(collect);
    }
    public List<Collect> getAllCollect(Integer id){
        return  collectMapper.getAllCollect(id) ;

    }
    public  int deleteCollectItem(Integer vid){
        return collectMapper.deleteCollectItem(vid);
    }
}
