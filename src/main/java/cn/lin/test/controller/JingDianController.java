package cn.lin.test.controller;

import cn.lin.test.pojo.JingDian;
import cn.lin.test.service.JingDianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shumei on 2019/1/12.
 */
@Controller
public class JingDianController {
    @Autowired
    private JingDianService service;

    @RequestMapping("lable")
    @ResponseBody
    public String getLable (){
        JingDian jd=service.getJingDianLableById(1);
        System.out.println(jd.getId());
        System.out.println(jd.getLable());
        return "success";

    }
}
