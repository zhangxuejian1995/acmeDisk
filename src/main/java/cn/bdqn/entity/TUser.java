package cn.bdqn.entity;

/**
 * Created by samsung on 2018/3/17.
 */
public class TUser {
    /*
    *
            *
        用户id	userid	int			TRUE	FALSE	TRUE
        用户名	userName	varchar(50)	50		FALSE	FALSE	TRUE
        用户昵称	userNick	varchar(50)	50		FALSE	FALSE	FALSE
        真实姓名	realName	varchar(50)	50		FALSE	FALSE	FALSE
        身份证	cordID	varchar(50)	50		FALSE	FALSE	FALSE
        密码 	password	varchar(50)	50		FALSE	FALSE	FALSE
        邮箱 	email	varchar(50)	50		FALSE	FALSE	FALSE
        手机号	phone	varchar(50)	50		FALSE	FALSE	FALSE
        登陆时间	loginTime	date			FALSE	FALSE	FALSE
        性别	 gender	varchar(50)	50		FALSE	FALSE	FALSE
        年龄 	age	varchar(50)	50		FALSE	FALSE	FALSE
        积分	 integral	int			FALSE	FALSE	FALSE
    *
    * */
    private int userId ,integral;
    private String userName , userNick , realName , cordID , password , email , phone , loginTime , gender ,age;

    public TUser() {
    }
    /*用户登录专用*/
    public TUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCordID() {
        return cordID;
    }

    public void setCordID(String cordID) {
        this.cordID = cordID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "userId=" + userId +
                ", integral=" + integral +
                ", userName='" + userName + '\'' +
                ", userNick='" + userNick + '\'' +
                ", realName='" + realName + '\'' +
                ", cordID='" + cordID + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
