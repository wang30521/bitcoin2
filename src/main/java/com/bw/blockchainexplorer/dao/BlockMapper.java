package com.bw.blockchainexplorer.dao;

import com.bw.blockchainexplorer.po.Block;

import java.util.List;

public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int truncate();

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    List<Block> selectRecent();

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);
}