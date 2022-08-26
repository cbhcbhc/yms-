package com.sys.yms.entity;

import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author makejava
 * @since 2022-07-14 14:28:05
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 468029705243966086L;
    /**
     * 实体类属性，用于1：1 的关系
     */
    private Type type;
    /**
     * 自增id
     */
    private Integer id;
    /**
     * 产品名称
     */
    private String pname;
    /**
     * 关联类型表id
     */
    private Integer typeid;
    /**
     * 产品原价
     */
    private Double tprice;
    /**
     * 产品介绍
     */
    private String tintroduce;
    /**
     * 图片路径
     */
    private String pimageurl;
    /**
     * 1:可做热饮    0：不可做热饮
     */
    private Integer photstate;
    /**
     * 折扣：0-1之间的小数
     */
    private Double pdiscount;
    /**
     * 1:可用    0：禁用
     */
    private Integer pstate;

    public Product() {
    }

    public Product(Type type, Integer id, String pname, Integer typeid, Double tprice, String tintroduce, String pimageurl, Integer photstate, Double pdiscount, Integer pstate) {
        this.type = type;
        this.id = id;
        this.pname = pname;
        this.typeid = typeid;
        this.tprice = tprice;
        this.tintroduce = tintroduce;
        this.pimageurl = pimageurl;
        this.photstate = photstate;
        this.pdiscount = pdiscount;
        this.pstate = pstate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", id=" + id +
                ", pname='" + pname + '\'' +
                ", typeid=" + typeid +
                ", tprice=" + tprice +
                ", tintroduce='" + tintroduce + '\'' +
                ", pimageurl='" + pimageurl + '\'' +
                ", photstate=" + photstate +
                ", pdiscount=" + pdiscount +
                ", pstate=" + pstate +
                '}';
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Double getTprice() {
        return tprice;
    }

    public void setTprice(Double tprice) {
        this.tprice = tprice;
    }

    public String getTintroduce() {
        return tintroduce;
    }

    public void setTintroduce(String tintroduce) {
        this.tintroduce = tintroduce;
    }

    public String getPimageurl() {
        return pimageurl;
    }

    public void setPimageurl(String pimageurl) {
        this.pimageurl = pimageurl;
    }

    public Integer getPhotstate() {
        return photstate;
    }

    public void setPhotstate(Integer photstate) {
        this.photstate = photstate;
    }

    public Double getPdiscount() {
        return pdiscount;
    }

    public void setPdiscount(Double pdiscount) {
        this.pdiscount = pdiscount;
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }


}

