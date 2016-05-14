package com.swroom.aop4;

/**
 * Created by Ray on 2016/5/9.
 */
public class SomeServiceImpl implements ISomeService {

    @Override
    public boolean check(String name, String password) throws UserException {
        if (!"张三".equals(name)) {
            throw new UsernameException("用户名输入错误！");
        }
        if (!"111".equals(password)) {
            throw new PasswordException("密码输入错误！");
        }
        return true;
    }
}
