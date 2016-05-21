package com.swroom.dao.impl;

import com.swroom.beans.Stock;
import com.swroom.dao.IStockDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by Ray on 2016/5/17.
 */
@Repository("stockDao")
public class StockDaoImpl implements IStockDao {
    private SessionFactory sessionFactory;

    @Override
    public void insertStock(String sname, int amount) {
        String sql = "insert into stock(sname, count) values (?, ?)";
        this.getSessionFactory().getCurrentSession().save(new Stock(sname, amount));
    }

    @Override
    public void updateStock(String sname, int amount, boolean isBuy) {
        String sql = "update stock set count = count - ? where sname = ?";
        if (isBuy) {
            sql = "update stock set count = count + ? where sname = ?";
        }

//        this.getJdbcTemplate().update(sql, amount, sname);
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
