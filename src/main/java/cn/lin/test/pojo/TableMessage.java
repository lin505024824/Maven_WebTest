package cn.lin.test.pojo;

/**
 * Created by shumei on 2019/1/16.
 */
public class TableMessage {
    private String tableName;
    private String tableComment;
    private String OrdinalPosition;
    private String ColumnName;
    private String DataType;
    private String ColumnComment;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public String getOrdinalPosition() {
        return OrdinalPosition;
    }

    public void setOrdinalPosition(String ordinalPosition) {
        OrdinalPosition = ordinalPosition;
    }

    public String getColumnName() {
        return ColumnName;
    }

    public void setColumnName(String columnName) {
        ColumnName = columnName;
    }

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public String getColumnComment() {
        return ColumnComment;
    }

    public void setColumnComment(String columnComment) {
        ColumnComment = columnComment;
    }
}
