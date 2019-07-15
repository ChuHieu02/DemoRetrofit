package com.example.demoretrofit;

public class Member {
    private String Account;
    private String CustomerCode;
    private Gymmember GymMember;

    public Member(String account, String customerCode, Gymmember gymMember) {
        Account = account;
        CustomerCode = customerCode;
        GymMember = gymMember;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public Gymmember getGymMember() {
        return GymMember;
    }

    public void setGymMember(Gymmember gymMember) {
        GymMember = gymMember;
    }
}
