package com.imooc.aspectJ.demo2;

public class CustomerDaoImpl implements CustomerDao {
    public void save() {
        System.out.println("保存信息");
    }

    public void update() {
        System.out.println("修改信息");
    }

    public void delete() {
        System.out.println("删除信息");
    }

    public void findOne() {
        System.out.println("查询一个信息");
        //int i=1/0;
    }

    public void findAll() {
        System.out.println("查询全部信息");
    }
}
