package cn.xy.dao;

import cn.xy.SpringBootMybatisApplication;
import cn.xy.domin.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by User on 2017/5/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootMybatisApplication.class)
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void  findByUsername(){
    User user=userMapper.findByUsername("admin");
    }
}
