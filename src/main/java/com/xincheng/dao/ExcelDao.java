package com.xincheng.dao;

import com.xincheng.model.UpExcelDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author 豆璐璐
 * @description
 * @company 易单科技
 * @date 2018/10/19 0019 16:02
 * @Version 1.0
 */
@Repository
public class ExcelDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //上传Excel
    public Integer doUpExcel(List<UpExcelDemo> upExcelDemos) {
        int row=0;  //定义插入行数
        //批量插入
        for (UpExcelDemo upExcel : upExcelDemos) {
            String id=upExcel.getId();
            String createtime = new SimpleDateFormat("yyyy-MM-dd").format(upExcel.getCreatetime());
            String address = upExcel.getAddress();
            String name = upExcel.getName();
            String phone = upExcel.getPhone();
            String product = upExcel.getProduct();
            Integer number = upExcel.getNumber();
            String sql="INSERT INTO easypoi VALUES ('"+id+"','"+createtime+"','"+address+"','"+name+"','"+phone+"','"+product+"','"+number+"')";

            row=row+jdbcTemplate.update(sql);
        }
        return row;
    }

}