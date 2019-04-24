package com.bw.blockchainexplorer.controller;

import com.alibaba.fastjson.*;
import okhttp3.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class BlockControllerTest2 {
    @Test
    public void getRecentBlocks() throws Throwable {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://localhost:8080/block/getRecentBlocks")
                .build();
        Response response = client.newCall(request).execute();
        String string = response.body().string();
        JSONArray jsonArray = JSON.parseArray(string);
        assertEquals(5,jsonArray.size());
    }
}
