package cn.lin.test.util;

import org.apache.poi.hssf.usermodel.*;

import java.io.FileOutputStream;

/**
 * Created by shumei on 2019/1/15.
 * 导出到excle
 */
public class ExcleUtil {

    public static HSSFWorkbook getWorkbook(String sheetName ,String[] title,
                                           String[][] values,HSSFWorkbook wb){
        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        if(wb==null){
           wb = new HSSFWorkbook();
        }
        // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet=wb.createSheet(sheetName);
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row=sheet.createRow(0);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style=wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //声明列对象
        HSSFCell cell =null;
        //创建标题
        for (int i = 0; i <title.length ; i++) {
            cell=row.createCell(i);
            cell.setCellValue(title[i]);
            cell.setCellStyle(style);
        }
        //创建内容
        for (int i = 0; i <values.length ; i++) {
            row=sheet.createRow(i+1);
            for (int j = 0; j <values[i].length ; j++) {
                row.createCell(j).setCellValue(values[i][j]);
            }
        }
        return wb;
    }
    /*
    直接将工作簿写出到excle
     */
    public static String writeToExcle(HSSFWorkbook wb,String fileName){
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            wb.write(fout);
            fout.close();
            return "成功";
        } catch (Exception e)  {
            e.printStackTrace();
            return "失败";
        }


    }


}
