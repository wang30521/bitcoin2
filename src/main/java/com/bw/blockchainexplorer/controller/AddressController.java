package com.bw.blockchainexplorer.controller;

import com.bw.blockchainexplorer.dao.Transaction_detailMapper;
import com.bw.blockchainexplorer.dto.AddressInfo;
import com.bw.blockchainexplorer.dto.TransactionInBlockDTO;
import com.bw.blockchainexplorer.po.Transaction_detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private Transaction_detailMapper transactionDetailMapper;

    @GetMapping("/getAddressInfo")
    public AddressInfo getAddressInfo(@RequestParam String address){
        return null;
    }

    @GetMapping("/getAddressTransactions")
    public List<Transaction_detail> getAddressTransactions(@RequestParam String address,
                                                          @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        List<Transaction_detail> transactionDetails = transactionDetailMapper.selectByAddress(address);
        return transactionDetails;
    }
}
