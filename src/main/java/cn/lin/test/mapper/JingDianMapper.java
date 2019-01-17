package cn.lin.test.mapper;

import cn.lin.test.pojo.JingDian;
import cn.lin.test.util.MyMapper;

/**
 * Created by shumei on 2019/1/12.
 */
public interface JingDianMapper extends MyMapper<JingDian>{
   JingDian findByPrimaryKey(int id);
}
