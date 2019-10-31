package com.imooc.icake.biz.impl;

import com.imooc.icake.biz.AccountBiz;
import com.imooc.icake.dao.AccountDao;
import com.imooc.icake.entity.Account;
import com.imooc.icake.global.DaoFactory;

import java.util.List;

public class AccountBizImpl implements AccountBiz {

    private AccountDao accountDao = DaoFactory.getInstence().getDao(AccountDao.class);

    public Account login(String name, String password) {
        List<Account> list = accountDao.selectByName(name);
        for(Account account:list)
            if(account.getPassword().equals(password))
                return account;
        return null;
    }
}
