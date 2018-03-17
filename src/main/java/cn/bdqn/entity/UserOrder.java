package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
public class UserOrder {
    /*
    *
    *
        订单表id	orderId	int			TRUE	FALSE	TRUE
        用户id2	id	int			FALSE	TRUE	FALSE
        订单编号	orderNum	int			FALSE	FALSE	FALSE
        用户Id	userId	int			FALSE	FALSE	FALSE
        订单创建时间	orderNewDate	date			FALSE	FALSE	FALSE
        订单状态	orderStatus	int			FALSE	FALSE	FALSE
        收货地址	address	double			FALSE	FALSE	FALSE
        订单金额	orderMoney	double			FALSE	FALSE	FALSE
        商品总数量	goodsSum	int			FALSE	FALSE	FALSE
    *
    *
    * */
    private int orderId,userId,orderNum,orderStatus,goodsSum;
    private String  address;
    private Date orderNewDate;
    private double orderMoney;
    private TUser tUser;

    public UserOrder() {
    }

    public UserOrder(int orderId, int userId, int orderNum, int orderStatus, int goodsSum, String address, Date orderNewDate, double orderMoney, TUser tUser) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderNum = orderNum;
        this.orderStatus = orderStatus;
        this.goodsSum = goodsSum;
        this.address = address;
        this.orderNewDate = orderNewDate;
        this.orderMoney = orderMoney;
        this.tUser = tUser;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getGoodsSum() {
        return goodsSum;
    }

    public void setGoodsSum(int goodsSum) {
        this.goodsSum = goodsSum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOrderNewDate() {
        return orderNewDate;
    }

    public void setOrderNewDate(Date orderNewDate) {
        this.orderNewDate = orderNewDate;
    }

    public double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderNum=" + orderNum +
                ", orderStatus=" + orderStatus +
                ", goodsSum=" + goodsSum +
                ", address='" + address + '\'' +
                ", orderNewDate=" + orderNewDate +
                ", orderMoney=" + orderMoney +
                ", tUser=" + tUser +
                '}';
    }
}
