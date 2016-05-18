package com.swroom.service;

import com.swroom.beans.StockException;
import com.swroom.dao.IAccountDao;
import com.swroom.dao.IStockDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ray on 2016/5/17.
 */
public class StockProcessServiceImpl implements IStockProcessService {

    private IAccountDao accountDao;
    private IStockDao stockDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setStockDao(IStockDao stockDao) {
        this.stockDao = stockDao;
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public void openAccount(String aname, double money) {
        accountDao.insertAccount(aname, money);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public void openStock(String sname, int amount) {
        stockDao.insertStock(sname, amount);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = StockException.class)
    public void buyStock(String aname, double money, String sname, int amount) throws StockException {
        boolean isBuy = true;
        accountDao.updateAccount(aname, money, isBuy);
        if (1 == 1) {
            throw new StockException("股票异常");
        }
        stockDao.updateStock(sname, amount, isBuy);
    }
}
