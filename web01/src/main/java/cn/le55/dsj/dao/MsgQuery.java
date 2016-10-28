package cn.le55.dsj.dao;

import cn.le55.dsj.pojo.*;

import java.util.List;

public class MsgQuery extends AbsQuery<Msg> {

    private String title;

    public Long[] getCateid() {
        return cateid;
    }

    public void setCateid(Long[] cateid) {
        this.cateid = cateid;
    }

    private Long[] cateid;
    public String getTitle() {

        if (title == null || title == "") return "";
        return "%" + title + "%";

    }

    public void setTitle(String _title) {

        title = _title;

    }
}
