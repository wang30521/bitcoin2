package com.bw.blockchainexplorer.dao;

import com.bw.blockchainexplorer.po.Transaction_detail;
import com.bw.blockchainexplorer.po.Transaction_detailKey;
import feign.Param;

import java.util.List;

public interface Transaction_detailMapper {
    int deleteByPrimaryKey(Transaction_detailKey key);

    int truncate();

    int insert(Transaction_detail record);

    int insertSelective(Transaction_detail record);

    Transaction_detail selectByPrimaryKey(Transaction_detailKey key);

    List<Transaction_detail> selectByAddress(@Param("address") String address);

    int updateByPrimaryKeySelective(Transaction_detail record);

    int updateByPrimaryKey(Transaction_detail record);
}