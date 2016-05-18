package com.swroom.dao.impl;

import com.swroom.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Ray on 2016/5/17.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void insertAccount(String aname, double money) {
        String sql = "insert into account(aname, balance) values(?,?)";
        this.getJdbcTemplate().update(sql, aname, money);
    }

    @Override
    public void updateAccount(String aname, double money, boolean isBuy) {
        String sql = "update account set balance = balance + ? where aname = ?";
        if (isBuy) {
            sql = "update account set balance = balance - ? where aname = ?";
        }

        this.getJdbcTemplate().update(sql, money, aname);
    }
}
