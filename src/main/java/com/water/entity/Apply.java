package com.water.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Apply {
    private long idApply;
    private Double longitude;
    private Double latitude;
    private String number;
    private String address;
    private Date applyDate;
    private Integer state;
    private String image;
    private String name;
    private String waterAddress;
    private User user;
    private String response;
    private Project project;

    @Id
    @GeneratedValue
    @Column(name = "idApply", nullable = false)
    public long getIdApply() {
        return idApply;
    }

    public void setIdApply(long idApply) {
        this.idApply = idApply;
    }

    @Basic
    @Column(name = "response", nullable = true, length = 255)
    public String getResponse(){return response;}
    public void setResponse(String response){this.response = response;}


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
    @Column(name = "image", nullable = true, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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

    @Basic
    @Column(name = "waterAddress", nullable = true, length = 255)
    public String getWaterAddress() {
        return waterAddress;
    }

    public void setWaterAddress(String waterAddress) {
        this.waterAddress = waterAddress;
    }

    @ManyToOne
    @JoinColumn(name="userID", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    @ManyToOne
//    @JoinColumn(name = "idProject", nullable = false)
//    public Project getProject(){
//        return project;
//    }
//
//    public void setProject(Project project){
//        this.project = project;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apply apply = (Apply) o;

        if (idApply != apply.idApply) return false;
        if (longitude != null ? !longitude.equals(apply.longitude) : apply.longitude != null) return false;
        if (latitude != null ? !latitude.equals(apply.latitude) : apply.latitude != null) return false;
        if (number != null ? !number.equals(apply.number) : apply.number != null) return false;
        if (address != null ? !address.equals(apply.address) : apply.address != null) return false;
        if (applyDate != null ? !applyDate.equals(apply.applyDate) : apply.applyDate != null) return false;
        if (state != null ? !state.equals(apply.state) : apply.state != null) return false;
        if (image != null ? !image.equals(apply.image) : apply.image != null) return false;
        if (name != null ? !name.equals(apply.name) : apply.name != null) return false;
        if (waterAddress != null ? !waterAddress.equals(apply.waterAddress) : apply.waterAddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idApply ^ (idApply >>> 32));
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (applyDate != null ? applyDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (waterAddress != null ? waterAddress.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
//    public User getUserByIdUser() {
//        return userByIdUser;
//    }
//
//    public void setUserByIdUser(User userByIdUser) {
//        this.userByIdUser = userByIdUser;
//    }

}
