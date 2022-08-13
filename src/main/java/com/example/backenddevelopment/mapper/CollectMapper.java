package com.example.backenddevelopment.mapper;

import com.example.backenddevelopment.daoimp.Collect;
import com.example.backenddevelopment.daoimp.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectMapper {
    int addCollectItem(Collect collect);
    int deleteCollectItem(Integer aid);
    List<Collect>  getAllCollect(Integer id);
}
