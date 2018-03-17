package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
/*回复表*/
public class Reply {
    /*
    * Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
回复Id	replyId	int			TRUE	FALSE	TRUE
评论Id	discussId	int			FALSE	TRUE	FALSE
回复内容	replyConTent	varchar(50)	50		FALSE	FALSE	FALSE
更新时间	updateTime	date			FALSE	FALSE	FALSE
回复数	replyCount	int			FALSE	FALSE	FALSE
    *
    * */
    private int replyId ,discussId , replyCount;
    private String replyConTent;
    private Date updateTime;
    private CommodityComment commodityComment;

    public Reply() {
    }

    public Reply(int replyId, int discussId, int replyCount, String replyConTent, Date updateTime, CommodityComment commodityComment) {
        this.replyId = replyId;
        this.discussId = discussId;
        this.replyCount = replyCount;
        this.replyConTent = replyConTent;
        this.updateTime = updateTime;
        this.commodityComment = commodityComment;
    }

    public CommodityComment getCommodityComment() {
        return commodityComment;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getDiscussId() {
        return discussId;
    }

    public void setDiscussId(int discussId) {
        this.discussId = discussId;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public String getReplyConTent() {
        return replyConTent;
    }

    public void setReplyConTent(String replyConTent) {
        this.replyConTent = replyConTent;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", discussId=" + discussId +
                ", replyCount=" + replyCount +
                ", replyConTent='" + replyConTent + '\'' +
                ", updateTime=" + updateTime +
                ", commodityComment=" + commodityComment +
                '}';
    }
}
