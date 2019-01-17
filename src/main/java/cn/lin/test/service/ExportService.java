package cn.lin.test.service;

import cn.lin.test.mapper.ExportMapper;
import cn.lin.test.pojo.TableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by shumei on 2019/1/16.
 */
@Service
public class ExportService {

    @Autowired
    private ExportMapper eMapper;

    public ArrayList<TableMessage> getlist(String database){
        ArrayList<TableMessage> list =eMapper.findTableMessageBySchema(database);
        return list;
    }



}
