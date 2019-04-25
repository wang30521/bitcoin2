package com.bw.blockchainexplorer.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bw.blockchainexplorer.api.BitcoinApi;
import com.bw.blockchainexplorer.api.BitcoinJsonRpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempController {

    @Autowired
     private BitcoinApi bitcoinApi;

    @Autowired
    private BitcoinJsonRpcClient bitcoinJsonRpcClient;

    @GetMapping("/test")
    public void test() throws Throwable {
      /* JSONObject chainInfo = bitcoinApi.getChainInfo();
       String txhash = "6dfe8c8a4bfbdf4a46d179b4da83d402e45eedff6b6d31217501cace93b031cd";
       JSONObject transaction = bitcoinApi.getTransaction(txhash);
       String blockhash = "00000000000004c4b19c7521f98b08e22fcd5fe53ee52e19349439e6192264ab";
      JSONObject block = bitcoinApi.getBlock(blockhash);
      JSONObject noTxBlock = bitcoinApi.getNoTxBlock(blockhash);
      String blockhash2 = "000000000039fd24c8e437f61514510daaec4a4a81fa404653ee7b21737cee82";
      JSONArray blockHeaders = bitcoinApi.getBlockHeaders(10, blockhash2);
      JSONObject mempoolInfo = bitcoinApi.getMempoolInfo();
       JSONObject mempoolContents = bitcoinApi.getMempoolContents();
      String blockHashByHeight = bitcoinJsonRpcClient.getBlockHashByHeight(605240);*/
       /* String address = "2MvtUhSf1V5iPzLm132cv3sU4FTCLq6Q4yt";
        Double balanceAmount = bitcoinJsonRpcClient.getBalance(address);*/
        String txid = "9795916c3d12601fabe7476c0fabc78aa0d7094edded275f7de0533b70ce665e";
//        Integer n = 0;
//        JSONObject utxo = bitcoinApi.getUTXO(txid, n);
        JSONObject rawTransaxtion = bitcoinJsonRpcClient.getRawTransaxtion(txid);
    }
}
