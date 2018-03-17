package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
public class Commodity {
    /*
    *
    *
    商品ID	commodityID	int			TRUE	FALSE	TRUE
    商品编号	commodityNum		varchar(50)	50		FALSE	FALSE	FALSE
    标签Id	labelId	int			FALSE	FALSE	FALSE
    商品名称	commodityName	varchar(50)	50		FALSE	FALSE	FALSE
    显示价格	priceShow	double			FALSE	FALSE	FALSE
    商品简介	commodityIntro	varchar(50)	50		FALSE	FALSE	FALSE
    展示图片	pictureShow	varchar(50)	50		FALSE	FALSE	FALSE
    是否置顶	ifTop	varchar(50)	50		FALSE	FALSE	FALSE
    是否导航栏	ifGPS	varchar(50)	50		FALSE	FALSE	FALSE
    是否热门	ifHot	varchar(50)	50		FALSE	FALSE	FALSE
    是否上架	ifPut	varchar(50)	50		FALSE	FALSE	FALSE
    上架时间	PutTime	date			FALSE	FALSE	FALSE
    上架人	putPeople	varchar(50)	50		FALSE	FALSE	FALSE
    搜索关键词	Search	varchar(50)	50		FALSE	FALSE	FALSE
    页面标题	tatles	varchar(50)	50		FALSE	FALSE	FALSE
    页面描述	tatleDescribe	varchar(50)	50		FALSE	FALSE	FALSE
    页面关键词	KeyWords	varchar(50)	50		FALSE	FALSE	FALSE
    备注	commodityRemark	varchar(50)	50		FALSE	FALSE	FALSE
    赠品(商品id)	gift	int			FALSE	FALSE	FALSE
    *
    * */
    private int commodityID ,labelId,gift;
    private String commodityNum,commodityName,commodityIntro,pictureShow;
    private String ifTop,ifGPS,ifHot,ifPut,putPeople,Search,tatles,tatleDescribe,KeyWords,commodityRemark;
    private Date PutTime;
    private double priceShow;

    public Commodity() {
    }

    public Commodity(int commodityID, int labelId, int gift, String commodityNum, String commodityName, String commodityIntro, String pictureShow, String ifTop, String ifGPS, String ifHot, String ifPut, String putPeople, String search, String tatles, String tatleDescribe, String keyWords, String commodityRemark, Date putTime, double priceShow) {
        this.commodityID = commodityID;
        this.labelId = labelId;
        this.gift = gift;
        this.commodityNum = commodityNum;
        this.commodityName = commodityName;
        this.commodityIntro = commodityIntro;
        this.pictureShow = pictureShow;
        this.ifTop = ifTop;
        this.ifGPS = ifGPS;
        this.ifHot = ifHot;
        this.ifPut = ifPut;
        this.putPeople = putPeople;
        Search = search;
        this.tatles = tatles;
        this.tatleDescribe = tatleDescribe;
        KeyWords = keyWords;
        this.commodityRemark = commodityRemark;
        PutTime = putTime;
        this.priceShow = priceShow;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public int getGift() {
        return gift;
    }

    public void setGift(int gift) {
        this.gift = gift;
    }

    public String getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(String commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityIntro() {
        return commodityIntro;
    }

    public void setCommodityIntro(String commodityIntro) {
        this.commodityIntro = commodityIntro;
    }

    public String getPictureShow() {
        return pictureShow;
    }

    public void setPictureShow(String pictureShow) {
        this.pictureShow = pictureShow;
    }

    public String getIfTop() {
        return ifTop;
    }

    public void setIfTop(String ifTop) {
        this.ifTop = ifTop;
    }

    public String getIfGPS() {
        return ifGPS;
    }

    public void setIfGPS(String ifGPS) {
        this.ifGPS = ifGPS;
    }

    public String getIfHot() {
        return ifHot;
    }

    public void setIfHot(String ifHot) {
        this.ifHot = ifHot;
    }

    public String getIfPut() {
        return ifPut;
    }

    public void setIfPut(String ifPut) {
        this.ifPut = ifPut;
    }

    public String getPutPeople() {
        return putPeople;
    }

    public void setPutPeople(String putPeople) {
        this.putPeople = putPeople;
    }

    public String getSearch() {
        return Search;
    }

    public void setSearch(String search) {
        Search = search;
    }

    public String getTatles() {
        return tatles;
    }

    public void setTatles(String tatles) {
        this.tatles = tatles;
    }

    public String getTatleDescribe() {
        return tatleDescribe;
    }

    public void setTatleDescribe(String tatleDescribe) {
        this.tatleDescribe = tatleDescribe;
    }

    public String getKeyWords() {
        return KeyWords;
    }

    public void setKeyWords(String keyWords) {
        KeyWords = keyWords;
    }

    public String getCommodityRemark() {
        return commodityRemark;
    }

    public void setCommodityRemark(String commodityRemark) {
        this.commodityRemark = commodityRemark;
    }

    public Date getPutTime() {
        return PutTime;
    }

    public void setPutTime(Date putTime) {
        PutTime = putTime;
    }

    public double getPriceShow() {
        return priceShow;
    }

    public void setPriceShow(double priceShow) {
        this.priceShow = priceShow;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityID=" + commodityID +
                ", labelId=" + labelId +
                ", gift=" + gift +
                ", commodityNum='" + commodityNum + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", commodityIntro='" + commodityIntro + '\'' +
                ", pictureShow='" + pictureShow + '\'' +
                ", ifTop='" + ifTop + '\'' +
                ", ifGPS='" + ifGPS + '\'' +
                ", ifHot='" + ifHot + '\'' +
                ", ifPut='" + ifPut + '\'' +
                ", putPeople='" + putPeople + '\'' +
                ", Search='" + Search + '\'' +
                ", tatles='" + tatles + '\'' +
                ", tatleDescribe='" + tatleDescribe + '\'' +
                ", KeyWords='" + KeyWords + '\'' +
                ", commodityRemark='" + commodityRemark + '\'' +
                ", PutTime=" + PutTime +
                ", priceShow=" + priceShow +
                '}';
    }
}
