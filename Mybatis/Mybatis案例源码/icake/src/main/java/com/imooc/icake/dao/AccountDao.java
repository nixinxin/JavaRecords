package com.imooc.icake.dao;

import com.imooc.icake.entity.Account;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Select("select * from account where account=#{name}")
    @Results(value={
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "account",property = "name"),
            @Result(column = "password",property = "password"),
            @Result(column = "nick_name",property = "nickName")}
    )
    List<Account> selectByName(String name);
}
