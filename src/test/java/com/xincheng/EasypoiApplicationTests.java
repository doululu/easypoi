package com.xincheng;

import com.xincheng.model.UpExcelDemo;
import com.xincheng.util.EasyPoiUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasypoiApplicationTests {

	@Test
	public void contextLoads() {
		String filePath="E:\\imgupload/01.xlsx";
        List<UpExcelDemo> upExcelDemos = EasyPoiUtil.importExcel(filePath, 0, 1, UpExcelDemo.class);
        for(UpExcelDemo up:upExcelDemos){

            System.out.println(up.toString());
        }
	}

}
