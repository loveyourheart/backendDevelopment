package com.example.backenddevelopment.service;

import com.alibaba.druid.support.ibatis.SqlMapClientImplWrapper;
import com.example.backenddevelopment.daoimp.Collect;
import com.example.backenddevelopment.mapper.CollectMapper;
import com.example.backenddevelopment.mapper.UserMapper;
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
