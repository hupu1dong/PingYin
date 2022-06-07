package org.zgy.util.entity;

import java.util.Date;
import java.util.Objects;

/**
 * @title: InfOrganization
 * @Author ZhangGuanYi
 * @Date: 2022/6/7 15:44
 * @Version 1.0
 */

public class InfOrganization {
    private Integer id;
    private String name;
    private String namePinyin;
    private Date createTime;

    public InfOrganization(Integer id, String name, String namePinyin, Date createTime) {
        this.id = id;
        this.name = name;
        this.namePinyin = namePinyin;
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfOrganization)) return false;
        InfOrganization that = (InfOrganization) o;
        return getId().equals(that.getId()) && getName().equals(that.getName()) && getNamePinyin().equals(that.getNamePinyin()) && getCreateTime().equals(that.getCreateTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNamePinyin(), getCreateTime());
    }

    @Override
    public String toString() {
        return "InfOrganization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", namePinyin='" + namePinyin + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
