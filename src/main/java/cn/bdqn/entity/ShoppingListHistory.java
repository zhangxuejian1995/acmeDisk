package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
/*购物清单历史*/
public class ShoppingListHistory {
    /*
    *
购物订单列表Id	purchaseOrderListId	int			TRUE	FALSE	TRUE
用户id	userid	int			FALSE	TRUE	FALSE
购物过的商品名称	highestName	varchar(50)	50		FALSE	FALSE	FALSE
购物过的商品编号	highestNum	int			FALSE	FALSE	FALSE
购买价格	highestPrice	double			FALSE	FALSE	FALSE
返现	returnCash	int			FALSE	FALSE	FALSE
送积分	returnIntegral	int			FALSE	FALSE	FALSE
购买数量	quantity	int			FALSE	FALSE	FALSE
发货时间	shipDate	date			FALSE	FALSE	FALSE
    * */
    private int purchaseOrderListId,highestNum,returnCash,returnIntegral,quantity;
    private String highestName ;
    private Date shipDate;
    private TUser user;

    public ShoppingListHistory() {
    }

    public ShoppingListHistory(int purchaseOrderListId, int highestNum, int returnCash, int returnIntegral, int quantity, String highestName, Date shipDate, TUser user) {
        this.purchaseOrderListId = purchaseOrderListId;
        this.highestNum = highestNum;
        this.returnCash = returnCash;
        this.returnIntegral = returnIntegral;
        this.quantity = quantity;
        this.highestName = highestName;
        this.shipDate = shipDate;
        this.user = user;
    }

    public int getPurchaseOrderListId() {
        return purchaseOrderListId;
    }

    public void setPurchaseOrderListId(int purchaseOrderListId) {
        this.purchaseOrderListId = purchaseOrderListId;
    }

    public int getHighestNum() {
        return highestNum;
    }

    public void setHighestNum(int highestNum) {
        this.highestNum = highestNum;
    }

    public int getReturnCash() {
        return returnCash;
    }

    public void setReturnCash(int returnCash) {
        this.returnCash = returnCash;
    }

    public int getReturnIntegral() {
        return returnIntegral;
    }

    public void setReturnIntegral(int returnIntegral) {
        this.returnIntegral = returnIntegral;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getHighestName() {
        return highestName;
    }

    public void setHighestName(String highestName) {
        this.highestName = highestName;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public TUser getUser() {
        return user;
    }

    public void setUser(TUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ShoppingListHistory{" +
                "purchaseOrderListId=" + purchaseOrderListId +
                ", highestNum=" + highestNum +
                ", returnCash=" + returnCash +
                ", returnIntegral=" + returnIntegral +
                ", quantity=" + quantity +
                ", highestName='" + highestName + '\'' +
                ", shipDate=" + shipDate +
                ", user=" + user +
                '}';
    }
}
