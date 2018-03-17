package cn.bdqn.entity;

/**
 * Created by samsung on 2018/3/17.
 */
/*发票表*/
public class Bill {
    /*
    *
    * Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
        发票Id	发票Id	<Undefined>			TRUE	FALSE	TRUE
        订单表id	orderId	int			FALSE	TRUE	FALSE
        发票类型	dillType	int			FALSE	FALSE	FALSE
        发票抬头	dillTitle	int			FALSE	FALSE	FALSE
        发票抬头信息	dillTitleDetail	varchar(50)	50		FALSE	FALSE	TRUE
        发票内容	dillContent	varchar(50)	50		FALSE	FALSE	FALSE
    *
    *
    * */
    private int  billId , orderId ,dillType,dillTitle;
    private String dillTitleDetail ,dillContent;
    private UserOrder userOrder;

    public Bill() {
    }

    public Bill(int billId, int orderId, int dillType, int dillTitle, String dillTitleDetail, String dillContent, UserOrder userOrder) {
        this.billId = billId;
        this.orderId = orderId;
        this.dillType = dillType;
        this.dillTitle = dillTitle;
        this.dillTitleDetail = dillTitleDetail;
        this.dillContent = dillContent;
        this.userOrder = userOrder;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getDillType() {
        return dillType;
    }

    public void setDillType(int dillType) {
        this.dillType = dillType;
    }

    public int getDillTitle() {
        return dillTitle;
    }

    public void setDillTitle(int dillTitle) {
        this.dillTitle = dillTitle;
    }

    public String getDillTitleDetail() {
        return dillTitleDetail;
    }

    public void setDillTitleDetail(String dillTitleDetail) {
        this.dillTitleDetail = dillTitleDetail;
    }

    public String getDillContent() {
        return dillContent;
    }

    public void setDillContent(String dillContent) {
        this.dillContent = dillContent;
    }

    public UserOrder getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(UserOrder userOrder) {
        this.userOrder = userOrder;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", orderId=" + orderId +
                ", dillType=" + dillType +
                ", dillTitle=" + dillTitle +
                ", dillTitleDetail='" + dillTitleDetail + '\'' +
                ", dillContent='" + dillContent + '\'' +
                ", userOrder=" + userOrder +
                '}';
    }
}
