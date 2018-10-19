package com.xincheng.service;

import com.xincheng.dao.ExcelDao;
import com.xincheng.model.UpExcelDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 豆璐璐
 * @description
 * @company 易单科技
 * @date 2018/10/19 0019 11:37
 * @Version 1.0
 */
@Service
public class ExcelService {

    @Autowired
    private ExcelDao excelDao;

    /**
     * excel 上传
     * @param upExcelDemos
     * @return
     */
    public Integer doUpExcel(List<UpExcelDemo> upExcelDemos){
        return excelDao.doUpExcel(upExcelDemos);
    }

}