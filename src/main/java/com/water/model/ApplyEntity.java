package com.water.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Arrays;

/**
 * Created by 朱晨乾 on 2017/7/18.
 */
@Entity
@Table(name = "apply", schema = "water", catalog = "")
public class ApplyEntity {
    private long idApply;
    private Double longitude;
    private Double latitude;
    private String number;
    private String address;
    private Integer postcode;
    private Date applyDate;
    private Integer state;
    private byte[] image;
    private String name;

    @Id
    @Column(name = "idApply", nullable = false)
    public long getIdApply() {
        return idApply;
    }

    public void setIdApply(long idApply) {
        this.idApply = idApply;
    }

    @Basic
    @Column(name = "longitude", nullable = true, precision = 0)
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude", nullable = true, precision = 0)
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "number", nullable = true, length = 45)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "postcode", nullable = true)
    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column(name = "applyDate", nullable = true)
    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "image", nullable = true)
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
