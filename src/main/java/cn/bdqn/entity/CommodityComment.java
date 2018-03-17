package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
/*商品评论表*/
public class CommodityComment {
    /*
    *
    * Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
评论Id	discussId	int			TRUE	FALSE	TRUE
商品ID	commodityID	int			FALSE	TRUE	FALSE
用户id	userid	int			FALSE	TRUE	FALSE
评论内容	discussName	varchar(50)	50		FALSE	FALSE	FALSE
状态	stitue	int			FALSE	FALSE	FALSE
创建时间	createTime	date			FALSE	FALSE	FALSE
评论数	discussCount	int			FALSE	FALSE	FALSE
    *
    *
    * */
    private int discussId , commodityID ,userid , stitue ,discussCount;
    private String discussName;
    private Date createTime;
    private TUser user;
    private Commodity commodity;

    public CommodityComment() {
    }

    public CommodityComment(int discussId, int commodityID, int userid, int stitue, int discussCount, String discussName, Date createTime, TUser user, Commodity commodity) {
        this.discussId = discussId;
        this.commodityID = commodityID;
        this.userid = userid;
        this.stitue = stitue;
        this.discussCount = discussCount;
        this.discussName = discussName;
        this.createTime = createTime;
        this.user = user;
        this.commodity = commodity;
    }

    @Override
    public String toString() {
        return "CommodityComment{" +
                "discussId=" + discussId +
                ", commodityID=" + commodityID +
                ", userid=" + userid +
                ", stitue=" + stitue +
                ", discussCount=" + discussCount +
                ", discussName='" + discussName + '\'' +
                ", createTime=" + createTime +
                ", user=" + user +
                ", commodity=" + commodity +
                '}';
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

    public int getDiscussId() {
        return discussId;
    }

    public void setDiscussId(int discussId) {
        this.discussId = discussId;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getStitue() {
        return stitue;
    }

    public void setStitue(int stitue) {
        this.stitue = stitue;
    }

    public int getDiscussCount() {
        return discussCount;
    }

    public void setDiscussCount(int discussCount) {
        this.discussCount = discussCount;
    }

    public String getDiscussName() {
        return discussName;
    }

    public void setDiscussName(String discussName) {
        this.discussName = discussName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
