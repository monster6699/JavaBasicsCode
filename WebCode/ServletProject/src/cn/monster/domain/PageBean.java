package cn.monster.domain;

import java.util.List;

public class PageBean<T> {
    private int currentPage; //当前页
    private int rows; //每页数据大小
    private List<T> list;
    private int totalPage; //总页数

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    private int totalCount; //总数据

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPage=" + currentPage +
                ", rows=" + rows +
                ", list=" + list +
                ", totalPage=" + totalPage +
                ", totalCount=" + totalCount +
                '}';
    }
}
