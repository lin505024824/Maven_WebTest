package cn.lin.test.controller;

import cn.lin.test.pojo.TableMessage;
import cn.lin.test.service.ExportService;
import cn.lin.test.util.ExcleUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by shumei on 2019/1/15.
 */
@Controller
public class ExportController {
    @Autowired
    private ExportService service;

    @RequestMapping("/excle")
    @ResponseBody
    public String export(){
        ArrayList<TableMessage> list=service.getlist("hydb");

        String[][] content=new String[list.size()][];
        //excel标题
        String[] title = {"表名","表注释","序号","列名","列类型","列注释"};
        //内容
        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            TableMessage tm = list.get(i);
            content[i][0] = tm.getTableName();
            content[i][1] = tm.getTableComment();
            content[i][2] = tm.getOrdinalPosition();
            content[i][3] = tm.getColumnName();
            content[i][4] = tm.getDataType();
            content[i][5] = tm.getColumnComment();
        }

        //文件名
        String fileName="E:\\"+"学生信息表"+System.currentTimeMillis()+".xls";
        //sheet名
        String sheetName = "学生信息表";
        //创建工作簿
        HSSFWorkbook wb = ExcleUtil.getWorkbook(sheetName,title,content,null);
        //导出到本地
        String mes=ExcleUtil.writeToExcle(wb,fileName);
        return mes;
    }


}
