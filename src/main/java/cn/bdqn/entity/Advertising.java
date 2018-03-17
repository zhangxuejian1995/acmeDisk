package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
/*广告*/
public class Advertising {
    /*
    *
    *Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
商品ID	commodityID	int			FALSE	TRUE	FALSE
广告Id	advID	int			TRUE	FALSE	TRUE
照片Id	pictureID	int			FALSE	TRUE	FALSE
广告内容	advContent	blobtext			FALSE	FALSE	FALSE
广告作者	advAuthor	varchar(50)	50		FALSE	FALSE	FALSE
广告标题	advTitle	varchar(50)	50		FALSE	FALSE	FALSE
创建时间	advTime	date			FALSE	FALSE	FALSE
    *
    *
    * */
    private int commodityID,advID,pictureID;
    private String advContent ,advAuthor ;
    private Date advTime;
    private Commodity commodity ;
    private Commoditypicture commoditypicture;

    public Advertising() {
    }

    public Advertising(int commodityID, int advID, int pictureID, String advContent, String advAuthor, Date advTime, Commodity commodity, Commoditypicture commoditypicture) {
        this.commodityID = commodityID;
        this.advID = advID;
        this.pictureID = pictureID;
        this.advContent = advContent;
        this.advAuthor = advAuthor;
        this.advTime = advTime;
        this.commodity = commodity;
        this.commoditypicture = commoditypicture;
    }

    public Commoditypicture getCommoditypicture() {
        return commoditypicture;
    }

    public void setCommoditypicture(Commoditypicture commoditypicture) {
        this.commoditypicture = commoditypicture;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public int getAdvID() {
        return advID;
    }

    public void setAdvID(int advID) {
        this.advID = advID;
    }

    public int getPictureID() {
        return pictureID;
    }

    public void setPictureID(int pictureID) {
        this.pictureID = pictureID;
    }

    public String getAdvContent() {
        return advContent;
    }

    public void setAdvContent(String advContent) {
        this.advContent = advContent;
    }

    public String getAdvAuthor() {
        return advAuthor;
    }

    public void setAdvAuthor(String advAuthor) {
        this.advAuthor = advAuthor;
    }

    public Date getAdvTime() {
        return advTime;
    }

    public void setAdvTime(Date advTime) {
        this.advTime = advTime;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "commodityID=" + commodityID +
                ", advID=" + advID +
                ", pictureID=" + pictureID +
                ", advContent='" + advContent + '\'' +
                ", advAuthor='" + advAuthor + '\'' +
                ", advTime=" + advTime +
                ", commodity=" + commodity +
                ", commoditypicture=" + commoditypicture +
                '}';
    }
}
