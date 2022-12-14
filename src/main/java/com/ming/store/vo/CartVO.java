package com.ming.store.vo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author: zheming
 * @data 2022/6/8 21:20
 */
public class CartVO implements Serializable {
    private Integer cid;
    private Integer uid;
    private Integer pid;
    private Long price;
    private Integer num;
    private String title;
    private Long realPrice;
    private String image;

    public CartVO() {
    }

    public CartVO(Integer cid, Integer uid, Integer pid, Long price, Integer num, String title, Long realPrice, String image) {
        this.cid = cid;
        this.uid = uid;
        this.pid = pid;
        this.price = price;
        this.num = num;
        this.title = title;
        this.realPrice = realPrice;
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartVO)) return false;
        CartVO cartVO = (CartVO) o;
        return Objects.equals(getCid(), cartVO.getCid()) && Objects.equals(getUid(), cartVO.getUid()) && Objects.equals(getPid(), cartVO.getPid()) && Objects.equals(getPrice(), cartVO.getPrice()) && Objects.equals(getNum(), cartVO.getNum()) && Objects.equals(getTitle(), cartVO.getTitle()) && Objects.equals(getRealPrice(), cartVO.getRealPrice()) && Objects.equals(getImage(), cartVO.getImage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCid(), getUid(), getPid(), getPrice(), getNum(), getTitle(), getRealPrice(), getImage());
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Long realPrice) {
        this.realPrice = realPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "CartVO{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", num=" + num +
                ", title='" + title + '\'' +
                ", realPrice=" + realPrice +
                ", image='" + image + '\'' +
                '}';
    }
}
