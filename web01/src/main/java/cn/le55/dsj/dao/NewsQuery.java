package cn.le55.dsj.dao;

import cn.le55.dsj.pojo.*;

public class NewsQuery extends AbsQuery<News> {
    private String title;

    public String getTitle() {

        if (title == null || title == "") return "";

        return "%"+title+"%";

    }
    public void setTitle(String _title) {

        title=_title;
    }
}
