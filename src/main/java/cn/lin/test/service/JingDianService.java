package cn.lin.test.service;

import cn.lin.test.mapper.JingDianMapper;
import cn.lin.test.pojo.JingDian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shumei on 2019/1/12.
 */
@Service
public class JingDianService {
    @Autowired
    private JingDianMapper jdm;

    public JingDian getJingDianLableById (int id){
        JingDian jd=jdm.findByPrimaryKey(id);
        return jd;
    }



}
