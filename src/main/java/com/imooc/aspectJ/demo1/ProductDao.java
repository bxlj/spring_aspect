package com.imooc.aspectJ.demo1;

public class ProductDao {

    public void save(){
        System.out.println("保存信息");
    }

    public String update(){
        System.out.println("修改信息");
        return "hello";
    }

    public void delete(){
        System.out.println("删除信息");
    }

    public void findOne(){
        System.out.println("查找一个信息" );
    }

    public void findAll(){
        System.out.println("查找所有信息");
    }
}
