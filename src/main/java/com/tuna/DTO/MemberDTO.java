package com.tuna.DTO;

public class MemberDTO {
    private long member_id;
    private String member_name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String status;

    public MemberDTO() {
    }

    public MemberDTO(long member_id, String member_name, String email, String password, String phone, String address, String status) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public long getMember_id() {
        return member_id;
    }

    public void setMember_id(long member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}