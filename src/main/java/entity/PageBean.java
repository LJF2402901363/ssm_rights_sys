package entity;

import java.io.Serializable;
import java.util.List;

/**
 * Classname:PageBean
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-09-09 23:14
 * @Version: 1.0
 **/
public class PageBean<T> implements Serializable {
    //分页总数
    private int total;
    //分页数
    private int totalPage;
    //每页的大小
    private int pageSize;
    //当前页码
    private int currPage;
    //起始位置
    private int offset;
    //结果集
    private List<T> dataList;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", currPage=" + currPage +
                ", offset=" + offset +
                ", dataList=" + dataList +
                '}';
    }
}
