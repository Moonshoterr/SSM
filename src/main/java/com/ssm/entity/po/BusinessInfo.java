package com.ssm.entity.po;

public class BusinessInfo {
    private Integer id;

    private String date;

    private String customerName;

    private String preLeft;

    private String preRight;

    private String postLeft;

    private String postRight;

    private String qiuLeft;

    private String zhuLeft;

    private String zhouLeft;

    private String qiuRight;

    private String zhuRight;

    private String zhouRight;

    private String tongJu;

    private String frameName;

    private String framePrice;

    private String glassName;

    private String glassPrice;

    private String totalPrice;

    private String telNum;

    private String comment;

    private Integer managerId;

    public BusinessInfo(Integer id, String date, String customerName, String preLeft, String preRight, String postLeft, String postRight, String qiuLeft, String zhuLeft, String zhouLeft, String qiuRight, String zhuRight, String zhouRight, String tongJu, String frameName, String framePrice, String glassName, String glassPrice, String totalPrice, String telNum, String comment, Integer managerId) {
        this.id = id;
        this.date = date;
        this.customerName = customerName;
        this.preLeft = preLeft;
        this.preRight = preRight;
        this.postLeft = postLeft;
        this.postRight = postRight;
        this.qiuLeft = qiuLeft;
        this.zhuLeft = zhuLeft;
        this.zhouLeft = zhouLeft;
        this.qiuRight = qiuRight;
        this.zhuRight = zhuRight;
        this.zhouRight = zhouRight;
        this.tongJu = tongJu;
        this.frameName = frameName;
        this.framePrice = framePrice;
        this.glassName = glassName;
        this.glassPrice = glassPrice;
        this.totalPrice = totalPrice;
        this.telNum = telNum;
        this.comment = comment;
        this.managerId = managerId;
    }

    public BusinessInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getPreLeft() {
        return preLeft;
    }

    public void setPreLeft(String preLeft) {
        this.preLeft = preLeft == null ? null : preLeft.trim();
    }

    public String getPreRight() {
        return preRight;
    }

    public void setPreRight(String preRight) {
        this.preRight = preRight == null ? null : preRight.trim();
    }

    public String getPostLeft() {
        return postLeft;
    }

    public void setPostLeft(String postLeft) {
        this.postLeft = postLeft == null ? null : postLeft.trim();
    }

    public String getPostRight() {
        return postRight;
    }

    public void setPostRight(String postRight) {
        this.postRight = postRight == null ? null : postRight.trim();
    }

    public String getQiuLeft() {
        return qiuLeft;
    }

    public void setQiuLeft(String qiuLeft) {
        this.qiuLeft = qiuLeft == null ? null : qiuLeft.trim();
    }

    public String getZhuLeft() {
        return zhuLeft;
    }

    public void setZhuLeft(String zhuLeft) {
        this.zhuLeft = zhuLeft == null ? null : zhuLeft.trim();
    }

    public String getZhouLeft() {
        return zhouLeft;
    }

    public void setZhouLeft(String zhouLeft) {
        this.zhouLeft = zhouLeft == null ? null : zhouLeft.trim();
    }

    public String getQiuRight() {
        return qiuRight;
    }

    public void setQiuRight(String qiuRight) {
        this.qiuRight = qiuRight == null ? null : qiuRight.trim();
    }

    public String getZhuRight() {
        return zhuRight;
    }

    public void setZhuRight(String zhuRight) {
        this.zhuRight = zhuRight == null ? null : zhuRight.trim();
    }

    public String getZhouRight() {
        return zhouRight;
    }

    public void setZhouRight(String zhouRight) {
        this.zhouRight = zhouRight == null ? null : zhouRight.trim();
    }

    public String getTongJu() {
        return tongJu;
    }

    public void setTongJu(String tongJu) {
        this.tongJu = tongJu == null ? null : tongJu.trim();
    }

    public String getFrameName() {
        return frameName;
    }

    public void setFrameName(String frameName) {
        this.frameName = frameName == null ? null : frameName.trim();
    }

    public String getFramePrice() {
        return framePrice;
    }

    public void setFramePrice(String framePrice) {
        this.framePrice = framePrice == null ? null : framePrice.trim();
    }

    public String getGlassName() {
        return glassName;
    }

    public void setGlassName(String glassName) {
        this.glassName = glassName == null ? null : glassName.trim();
    }

    public String getGlassPrice() {
        return glassPrice;
    }

    public void setGlassPrice(String glassPrice) {
        this.glassPrice = glassPrice == null ? null : glassPrice.trim();
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum == null ? null : telNum.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}