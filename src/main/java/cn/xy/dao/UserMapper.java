package cn.xy.dao;

import cn.xy.domin.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by User on 2017/5/3.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where user_name=#{1}")
    User findByUsername(String username);
}
