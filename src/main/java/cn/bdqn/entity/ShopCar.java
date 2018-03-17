package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
/*购物车*/
public class ShopCar {
    /*
    *
    * Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
购物车ID	shopCarId	int			TRUE	FALSE	TRUE
用户id	id	int			FALSE	TRUE	FALSE
商品规格编号	productId	int			FALSE	FALSE	FALSE
购买数量	quantitys	int			FALSE	FALSE	FALSE
创建时间	foundTime	date			FALSE	FALSE	FALSE
更新时间	renewalTime	date			FALSE	FALSE	FALSE
购物车状态	shopCarCOntdition	varchar(50)	50		FALSE	FALSE	FALSE
    *
    * */
    private int shopCarId , userId , productId ,quantitys;
    private Date foundTime , renewalTime;
    private String shopCarCOntdition;
    private TUser user;

    public ShopCar() {
    }

    public ShopCar(int shopCarId, int userId, int productId, int quantitys, Date foundTime, Date renewalTime, String shopCarCOntdition, TUser user) {
        this.shopCarId = shopCarId;
        this.userId = userId;
        this.productId = productId;
        this.quantitys = quantitys;
        this.foundTime = foundTime;
        this.renewalTime = renewalTime;
        this.shopCarCOntdition = shopCarCOntdition;
        this.user = user;
    }

    public int getShopCarId() {
        return shopCarId;
    }

    public void setShopCarId(int shopCarId) {
        this.shopCarId = shopCarId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantitys() {
        return quantitys;
    }

    public void setQuantitys(int quantitys) {
        this.quantitys = quantitys;
    }

    public Date getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
    }

    public Date getRenewalTime() {
        return renewalTime;
    }

    public void setRenewalTime(Date renewalTime) {
        this.renewalTime = renewalTime;
    }

    public String getShopCarCOntdition() {
        return shopCarCOntdition;
    }

    public void setShopCarCOntdition(String shopCarCOntdition) {
        this.shopCarCOntdition = shopCarCOntdition;
    }

    public TUser getUser() {
        return user;
    }

    public void setUser(TUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ShopCar{" +
                "shopCarId=" + shopCarId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", quantitys=" + quantitys +
                ", foundTime=" + foundTime +
                ", renewalTime=" + renewalTime +
                ", shopCarCOntdition='" + shopCarCOntdition + '\'' +
                ", user=" + user +
                '}';
    }
}
