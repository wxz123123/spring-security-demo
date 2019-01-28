package com.example.demo.pojo;

import java.io.Serializable;

public class RolePermission implements Serializable {
    private Integer rolepermissionid;

    private Integer roleid;

    private Integer psermissionid;

    private static final long serialVersionUID = 1L;

    public Integer getRolepermissionid() {
        return rolepermissionid;
    }

    public void setRolepermissionid(Integer rolepermissionid) {
        this.rolepermissionid = rolepermissionid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPsermissionid() {
        return psermissionid;
    }

    public void setPsermissionid(Integer psermissionid) {
        this.psermissionid = psermissionid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolepermissionid=").append(rolepermissionid);
        sb.append(", roleid=").append(roleid);
        sb.append(", psermissionid=").append(psermissionid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}