package com.xincheng.controller;

import com.xincheng.model.UpExcelDemo;
import com.xincheng.service.ExcelService;
import com.xincheng.util.EasyPoiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 豆璐璐
 * @description   上传excel文件
 * @company 易单科技
 * @date 2018/10/19 0019 11:31
 * @Version 1.0
 */
@Controller
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    // 上传excel文件
    @RequestMapping("/upExcel")
    public String insertExcel(HttpServletRequest request, MultipartFile file) {

        //根据接收的Excel文件来导入Excel,并封装成实体类
        List<UpExcelDemo> upExcelDemos = EasyPoiUtil.importExcel(file, 0, 1, UpExcelDemo.class);
        if(excelService.doUpExcel(upExcelDemos)>0){  //上传成功
            //获取所有数据到页面回显
            return "/upSuccess";
        }else{
            return "Defeated";
        }
    }
}