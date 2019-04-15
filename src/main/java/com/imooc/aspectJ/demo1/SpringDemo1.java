package com.imooc.aspectJ.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//spring扩展了junit的运行环境，除了有测试功能之外，还在里面定义了创建工厂的代码
@RunWith(SpringJUnit4ClassRunner.class)
//告诉spring的测试环境，配置文件在哪里
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {

    @Resource(name = "productDao")
    private ProductDao productDao;

    @Test
    public void demo(){

        productDao.delete();
        productDao.update();
        productDao.findOne();
        productDao.save();
        productDao.findAll();
    }
}
