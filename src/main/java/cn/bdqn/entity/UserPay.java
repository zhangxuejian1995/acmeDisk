package cn.bdqn.entity;

/**
 * Created by samsung on 2018/3/17.
 */
public class UserPay {
    /*
    *   付款Id	id	int			TRUE	FALSE	TRUE
        用户id	userid	int			FALSE	TRUE	FALSE
        银行卡号	bankCard	varchar(50)	50		FALSE	FALSE	FALSE
        备注	giftsNote	varchar(50)	50		FALSE	FALSE	FALSE
        赠言	gifts	varchar(50)	50		FALSE	FALSE	FALSE
        优惠卷	coupon	varchar(50)	50		FALSE	FALSE	FALSE
    *
    * */
    private int id , userid ;
    private String bankCard , giftsNote  , gifts , coupon;
    private TUser tUser;

    public UserPay() {
    }

    public UserPay(int id, int userid, String bankCard, String giftsNote, String gifts, String coupon, TUser tUser) {
        this.id = id;
        this.userid = userid;
        this.bankCard = bankCard;
        this.giftsNote = giftsNote;
        this.gifts = gifts;
        this.coupon = coupon;
        this.tUser = tUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getGiftsNote() {
        return giftsNote;
    }

    public void setGiftsNote(String giftsNote) {
        this.giftsNote = giftsNote;
    }

    public String getGifts() {
        return gifts;
    }

    public void setGifts(String gifts) {
        this.gifts = gifts;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    @Override
    public String toString() {
        return "UserPay{" +
                "id=" + id +
                ", userid=" + userid +
                ", bankCard='" + bankCard + '\'' +
                ", giftsNote='" + giftsNote + '\'' +
                ", gifts='" + gifts + '\'' +
                ", coupon='" + coupon + '\'' +
                ", tUser=" + tUser +
                '}';
    }
}
