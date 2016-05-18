package com.swroom.service;

import com.swroom.beans.StockException;

/**
 * 股票处理接口
 * Created by Ray on 2016/5/17.
 */
public interface IStockProcessService {
    void openAccount(String aname, double money);
    void openStock(String sname, int amount);
    void buyStock(String aname, double money, String sname, int amount) throws StockException;
}
