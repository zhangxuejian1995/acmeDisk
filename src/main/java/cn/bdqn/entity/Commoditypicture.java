package cn.bdqn.entity;

/**
 * Created by samsung on 2018/3/17.
 */
/*照片表*/
public class Commoditypicture {
    /*
    * Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
用户id	id	int			FALSE	TRUE	FALSE
商品ID	commodityID	int			FALSE	TRUE	FALSE
照片Id	pictureID	int			TRUE	FALSE	TRUE
展示图片	pictureShow	varchar(50)	50		FALSE	FALSE	FALSE
状态	pictureState	varchar(50)	50		FALSE	FALSE	FALSE
    *
    * */
    private int userId , commodityID,pictureID;
    private String pictureShow ,pictureState;
    public Commoditypicture() {

    }

    public Commoditypicture(int userId, int commodityID, int pictureID, String pictureShow, String pictureState) {
        this.userId = userId;
        this.commodityID = commodityID;
        this.pictureID = pictureID;
        this.pictureShow = pictureShow;
        this.pictureState = pictureState;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public int getPictureID() {
        return pictureID;
    }

    public void setPictureID(int pictureID) {
        this.pictureID = pictureID;
    }

    public String getPictureShow() {
        return pictureShow;
    }

    public void setPictureShow(String pictureShow) {
        this.pictureShow = pictureShow;
    }

    public String getPictureState() {
        return pictureState;
    }

    public void setPictureState(String pictureState) {
        this.pictureState = pictureState;
    }

    @Override
    public String toString() {
        return "Commoditypicture{" +
                "userId=" + userId +
                ", commodityID=" + commodityID +
                ", pictureID=" + pictureID +
                ", pictureShow='" + pictureShow + '\'' +
                ", pictureState='" + pictureState + '\'' +
                '}';
    }
}
