package com.bw.blockchainexplorer.dao;

import com.bw.blockchainexplorer.po.Blockchain;

public interface BlockchainMapper {
    int deleteByPrimaryKey(Integer blockchainId);

    int insert(Blockchain record);

    int insertSelective(Blockchain record);

    Blockchain selectByPrimaryKey(Integer blockchainId);

    int updateByPrimaryKeySelective(Blockchain record);

    int updateByPrimaryKey(Blockchain record);
}