package cn.bdqn.entity;

/**
 * Created by samsung on 2018/3/17.
 */
/*收货地址*/
public class Address {
    /*

    * Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
收货地址ID	addressId	int			TRUE	FALSE	TRUE
用户id	id	int			FALSE	TRUE	FALSE
姓名	name	varchar(50)	50		FALSE	FALSE	FALSE
地址标签	address	varchar(100)	100		FALSE	FALSE	FALSE
手机号码	phoneNum	varchar(50)	50		FALSE	FALSE	FALSE
    * */
    private int addressId ,userId ;
    private String name ,address,phoneNum;
    private TUser user;

    public Address() {
    }

    public Address(int addressId, int userId, String name, String address, String phoneNum, TUser user) {
        this.addressId = addressId;
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.user = user;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public TUser getUser() {
        return user;
    }

    public void setUser(TUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", user=" + user +
                '}';
    }
}
