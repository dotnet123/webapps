package cn.le55.dsj.pojo;

/**
 * Created by MaiBenBen on 2016/10/25.
 */
public abstract class BaseQuery {

    private long[] ids;


    private Integer take ;
    private Integer skip ;
    private Integer count;

    private String orderField ;

    private String orderDirection ;
    public String getOrderField() {

        if (orderField == null || orderField == "") return " id ";
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }



    public String getOrderDirection() {
        if (orderDirection == null || orderDirection == "") return " desc ";
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public Integer getTake() {
        return take;
    }

    public void setTake(Integer _take) {
        this.take = _take;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer _skip) {
        this.skip = _skip;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer _count) {
        this.count = _count;
    }

    public long[] getIds() {

        return ids;
    }

    public void setIds(long[] _ids) {

        this.ids = _ids;
    }

}
