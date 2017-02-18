package com.example.xxx.gank.bean;

import java.util.List;

/**
 * Created by space on 2017/2/15.
 */

public class FundBean {


    /**
     * rtncode : 0
     * rtnmsg : 成功
     */

    private int rtncode;
    private String rtnmsg;
    /**
     * fundcode : 000001
     * fundname : 华夏成长
     * pyjc : hxcz
     * tzlx : 混合型
     * clrq : 2001-12-18
     * tzfg : 大盘型
     * stype :
     * jjgsid : 21
     * orgname : 华夏基金
     */

    private List<DataBean> data;

    public int getRtncode() {
        return rtncode;
    }

    public void setRtncode(int rtncode) {
        this.rtncode = rtncode;
    }

    public String getRtnmsg() {
        return rtnmsg;
    }

    public void setRtnmsg(String rtnmsg) {
        this.rtnmsg = rtnmsg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String fundcode;
        private String fundname;
        private String pyjc;
        private String tzlx;
        private String clrq;
        private String tzfg;
        private String stype;
        private String jjgsid;
        private String orgname;

        public String getFundcode() {
            return fundcode;
        }

        public void setFundcode(String fundcode) {
            this.fundcode = fundcode;
        }

        public String getFundname() {
            return fundname;
        }

        public void setFundname(String fundname) {
            this.fundname = fundname;
        }

        public String getPyjc() {
            return pyjc;
        }

        public void setPyjc(String pyjc) {
            this.pyjc = pyjc;
        }

        public String getTzlx() {
            return tzlx;
        }

        public void setTzlx(String tzlx) {
            this.tzlx = tzlx;
        }

        public String getClrq() {
            return clrq;
        }

        public void setClrq(String clrq) {
            this.clrq = clrq;
        }

        public String getTzfg() {
            return tzfg;
        }

        public void setTzfg(String tzfg) {
            this.tzfg = tzfg;
        }

        public String getStype() {
            return stype;
        }

        public void setStype(String stype) {
            this.stype = stype;
        }

        public String getJjgsid() {
            return jjgsid;
        }

        public void setJjgsid(String jjgsid) {
            this.jjgsid = jjgsid;
        }

        public String getOrgname() {
            return orgname;
        }

        public void setOrgname(String orgname) {
            this.orgname = orgname;
        }
    }
}
