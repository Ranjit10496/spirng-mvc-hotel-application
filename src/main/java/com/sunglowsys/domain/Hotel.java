package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long hotelId;

    @Column(name = "code", unique = true,nullable = false)
    private String code;

    @Column(name = "hotel_type")
    private String hotelType;

    @Column(name = "email_id", unique = true)
    private String email;

    @Column(name = "mobile_number", unique = true)

    private String mobile;

    public Hotel() {
    }

    public Hotel(String code, String hotelType, String email, String mobile) {
        this.code = code;
        this.hotelType = hotelType;
        this.email = email;
        this.mobile = mobile;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(hotelId, hotel.hotelId) && Objects.equals(code, hotel.code) && Objects.equals(hotelType, hotel.hotelType) && Objects.equals(email, hotel.email) && Objects.equals(mobile, hotel.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelId, code, hotelType, email, mobile);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", code='" + code + '\'' +
                ", hotelType='" + hotelType + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}