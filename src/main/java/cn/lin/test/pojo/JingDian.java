package cn.lin.test.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by shumei on 2019/1/12.
 */
@Table(name="tb_tl")
public class JingDian {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String lable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
