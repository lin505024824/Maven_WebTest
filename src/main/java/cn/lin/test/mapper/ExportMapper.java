package cn.lin.test.mapper;

import cn.lin.test.pojo.TableMessage;

import java.util.ArrayList;

/**
 * Created by shumei on 2019/1/16.
 */
public interface ExportMapper {
    ArrayList<TableMessage> findTableMessageBySchema(String database);

}
