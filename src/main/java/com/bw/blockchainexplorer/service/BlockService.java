package com.bw.blockchainexplorer.service;

import com.bw.blockchainexplorer.po.Block;

import java.util.List;

public interface BlockService {
    List<Block> selectRecent();
}
