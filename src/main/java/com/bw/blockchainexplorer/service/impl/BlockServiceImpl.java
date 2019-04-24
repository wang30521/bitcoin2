package com.bw.blockchainexplorer.service.impl;

import com.bw.blockchainexplorer.dao.BlockMapper;
import com.bw.blockchainexplorer.po.Block;
import com.bw.blockchainexplorer.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockServiceImpl implements BlockService {
    @Autowired
    private BlockMapper blockMapper;

    @Override
    public List<Block> selectRecent() {
        List<Block> blocks = blockMapper.selectRecent();
        return blocks;
    }
}
