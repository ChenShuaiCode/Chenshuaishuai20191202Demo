package com.bawei.chenshuaishuai20191202.modle.entity;

import java.util.List;

public class Bean {

    /**
     * result : [{"commodityId":116,"commodityName":"【千元爆款智能投影】坚果A6投影仪 支持1080p家用高清 微型智能wifi无线投影仪 家庭影院 便携电视","masterPic":"http://mobile.bwstudent.com/images/small/commodity/sjsm/yyyl/3/1.jpg","price":998,"saleNum":0},{"commodityId":129,"commodityName":"360儿童 电话手表X1 运动快充版 轻薄防水拍照 七重定位 智能手表学生W702","masterPic":"http://mobile.bwstudent.com/images/small/commodity/sjsm/znsb/2/1.jpg","price":419,"saleNum":169},{"commodityId":176,"commodityName":"瑞士军刀大容量背包多功能户外出差旅行包双肩包男15.6英寸笔记本电脑包手提斜挎行李包旅游登山包防泼水 黑色【多功能手提斜跨双肩单肩】","masterPic":"http://mobile.bwstudent.com/images/small/commodity/xbsd/dnb/7/1.jpg","price":119,"saleNum":0},{"commodityId":125,"commodityName":"Sony/索尼 DSC-KW1 靓咔 自拍神器 数码相机 美颜相机","masterPic":"http://mobile.bwstudent.com/images/small/commodity/sjsm/zxj/5/1.jpg","price":799,"saleNum":0},{"commodityId":173,"commodityName":"新番祖 电脑包 13.3/14/15.6英寸苹果笔记本电脑包 女 手提公文包 贝壳 樱花粉-13.3英寸及以下（淑女款）","masterPic":"http://mobile.bwstudent.com/images/small/commodity/xbsd/dnb/4/1.jpg","price":119,"saleNum":0}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commodityId : 116
         * commodityName : 【千元爆款智能投影】坚果A6投影仪 支持1080p家用高清 微型智能wifi无线投影仪 家庭影院 便携电视
         * masterPic : http://mobile.bwstudent.com/images/small/commodity/sjsm/yyyl/3/1.jpg
         * price : 998
         * saleNum : 0
         */

        private int commodityId;
        private String commodityName;
        private String masterPic;
        private int price;
        private int saleNum;

        public int getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(int commodityId) {
            this.commodityId = commodityId;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public String getMasterPic() {
            return masterPic;
        }

        public void setMasterPic(String masterPic) {
            this.masterPic = masterPic;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSaleNum() {
            return saleNum;
        }

        public void setSaleNum(int saleNum) {
            this.saleNum = saleNum;
        }
    }
}
