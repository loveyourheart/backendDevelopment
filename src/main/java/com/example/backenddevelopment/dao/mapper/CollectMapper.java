package com.example.backenddevelopment.dao.mapper;

import com.example.backenddevelopment.domain.impl.Collect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectMapper {
    int addCollectItem(Collect collect);
    int deleteCollectItem(Integer aid);
    List<Collect>  getAllCollect(Integer id);
}
