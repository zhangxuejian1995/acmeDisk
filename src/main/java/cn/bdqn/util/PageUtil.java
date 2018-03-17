package cn.bdqn.util;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by samsung on 2018/3/5.
 */
public class PageUtil<T> {
    private int total;
    private List<T> rows;

    public PageUtil(PageInfo<T> pageInfo) {
        this.total = (int) pageInfo.getTotal();
        this.rows = pageInfo.getList();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
