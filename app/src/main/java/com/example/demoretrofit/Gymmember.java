package com.example.demoretrofit;

public class Gymmember {
    private String BeginDate;
    private String Birthday;
    private String BranchCode;
    private String CellPhone;
    private String Description;
    private String Email;
    private String EnrollNumber;
    private Boolean Gender;
    private String MainAddress;
    private String MemberCode;
    private String MemberName;
    private String OrderStatus;
    private String PriceName;
    private String imgData;
    private String imgName;
    private String imgUrl;

    public Gymmember(String beginDate, String birthday, String branchCode, String cellPhone, String description, String email, String enrollNumber, Boolean gender, String mainAddress, String memberCode, String memberName, String orderStatus, String priceName, String imgData, String imgName, String imgUrl) {
        BeginDate = beginDate;
        Birthday = birthday;
        BranchCode = branchCode;
        CellPhone = cellPhone;
        Description = description;
        Email = email;
        EnrollNumber = enrollNumber;
        Gender = gender;
        MainAddress = mainAddress;
        MemberCode = memberCode;
        MemberName = memberName;
        OrderStatus = orderStatus;
        PriceName = priceName;
        this.imgData = imgData;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }

    public String getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(String beginDate) {
        BeginDate = beginDate;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(String branchCode) {
        BranchCode = branchCode;
    }

    public String getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(String cellPhone) {
        CellPhone = cellPhone;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEnrollNumber() {
        return EnrollNumber;
    }

    public void setEnrollNumber(String enrollNumber) {
        EnrollNumber = enrollNumber;
    }

    public Boolean getGender() {
        return Gender;
    }

    public void setGender(Boolean gender) {
        Gender = gender;
    }

    public String getMainAddress() {
        return MainAddress;
    }

    public void setMainAddress(String mainAddress) {
        MainAddress = mainAddress;
    }

    public String getMemberCode() {
        return MemberCode;
    }

    public void setMemberCode(String memberCode) {
        MemberCode = memberCode;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public String getPriceName() {
        return PriceName;
    }

    public void setPriceName(String priceName) {
        PriceName = priceName;
    }

    public String getImgData() {
        return imgData;
    }

    public void setImgData(String imgData) {
        this.imgData = imgData;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
