package com.xincheng.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 豆璐璐
 * @description  Excel文件上传
 * @company 易单科技
 * @date 2018/10/19 0019 11:39
 * @Version 1.0
 */
public class UpExcelDemo implements Serializable {

    @Excel(name = "单据编号", width = 25, orderNum = "0")
    @NotNull(message = "单据编号不能为空")
    private String id;

    @Excel(name = "业务日期", exportFormat = "yyyy-MM-dd", orderNum = "1")
    private Date createtime;

    @Excel(name = "收货地址", orderNum = "2")
    private String address;

    @Excel(name = "收货联系人", orderNum = "3")
    private String name;

    @Excel(name = "联系人电话", orderNum = "4")
    private String phone;

    @Excel(name = "物料名称", orderNum = "5")
    private String product;

    @Excel(name = "数量", orderNum = "6")
    private Integer number;

    //无参构造方法 必须加，不然报错
    public UpExcelDemo() {
    }

    @Override
    public String toString() {
        return "UpExcelDemo{" +
                "id='" + id + '\'' +
                ", createtime=" + createtime +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", product='" + product + '\'' +
                ", number=" + number +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

