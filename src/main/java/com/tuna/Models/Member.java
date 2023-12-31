package com.tuna.Models;

import javax.persistence.*;

@Entity(name="Member")
@Table(name="KH", schema = "cuahang")
public class Member {
    @Id
    @Column(name="MA_KH", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long member_id;
    @Column(name="TEN_KH", length = 255)
    private String member_name;
    @Column(name="EMAIL", length = 255)
    private String email;
    @Column(name="MATKHAU", length = 255)
    private String password;
    @Column(name="DIENTHOAI", length = 255)
    private String phone;
    @Column(name="DIACHI", length = 255)
    private String address;
    @Column(name="TRANGTHAI", length = 255)
    private String status;
    public Member() {
    }

    public Member(long member_id, String member_name, String email, String password, String phone, String address, String status) {
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
