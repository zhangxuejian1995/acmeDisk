package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
/*用户商品收藏表*/
public class Favorite {
    /*
    *
Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
收藏表ID	favoritesid	int			TRUE	FALSE	TRUE
用户id	userid	int			FALSE	TRUE	FALSE
商品ID	commodityID	int			FALSE	TRUE	FALSE
商品编号	commodityNum	int			FALSE	FALSE	FALSE
商品名称	commodityName	varchar(50)	50		FALSE	FALSE	FALSE
展示图片	picture	varchar(50)	50		FALSE	FALSE	FALSE
显示价格	price	double			FALSE	FALSE	FALSE
商品状态	commodityState	varchar(50)	50		FALSE	FALSE	FALSE
创建时间	creatorTime	time			FALSE	FALSE	FALSE
创建者	creator	varchar(50)	50		FALSE	FALSE	FALSE
    *
    * */
    private int  favoritesid ,userid,commodityID,commodityNum;
    private Date creatorTime;
    private String commodityName , picture , commodityState ,creator;
    private TUser user ;
    private Commodity commodity;

    public Favorite() {
    }

    public Favorite(int favoritesid, int userid, int commodityID, int commodityNum, Date creatorTime, String commodityName, String picture, String commodityState, String creator, TUser user, Commodity commodity) {
        this.favoritesid = favoritesid;
        this.userid = userid;
        this.commodityID = commodityID;
        this.commodityNum = commodityNum;
        this.creatorTime = creatorTime;
        this.commodityName = commodityName;
        this.picture = picture;
        this.commodityState = commodityState;
        this.creator = creator;
        this.user = user;
        this.commodity = commodity;
    }

    public int getFavoritesid() {
        return favoritesid;
    }

    public void setFavoritesid(int favoritesid) {
        this.favoritesid = favoritesid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public int getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(int commodityNum) {
        this.commodityNum = commodityNum;
    }

    public Date getCreatorTime() {
        return creatorTime;
    }

    public void setCreatorTime(Date creatorTime) {
        this.creatorTime = creatorTime;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCommodityState() {
        return commodityState;
    }

    public void setCommodityState(String commodityState) {
        this.commodityState = commodityState;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public TUser getUser() {
        return user;
    }

    public void setUser(TUser user) {
        this.user = user;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "favoritesid=" + favoritesid +
                ", userid=" + userid +
                ", commodityID=" + commodityID +
                ", commodityNum=" + commodityNum +
                ", creatorTime=" + creatorTime +
                ", commodityName='" + commodityName + '\'' +
                ", picture='" + picture + '\'' +
                ", commodityState='" + commodityState + '\'' +
                ", creator='" + creator + '\'' +
                ", user=" + user +
                ", commodity=" + commodity +
                '}';
    }
}
