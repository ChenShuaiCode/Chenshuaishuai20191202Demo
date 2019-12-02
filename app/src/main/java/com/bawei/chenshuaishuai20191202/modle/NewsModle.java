package com.bawei.chenshuaishuai20191202.modle;

import com.bawei.chenshuaishuai20191202.contract.INewsContract;
import com.bawei.chenshuaishuai20191202.modle.entity.Bean;
import com.bawei.chenshuaishuai20191202.utils.NetUtils;
import com.google.gson.Gson;

import java.util.List;

public class NewsModle implements INewsContract.imodle {
    @Override
    public void getdata(String url, final ModelCallBack modleCallBack) {
        NetUtils.getInstance().getjson(url, new NetUtils.MyCallBack() {
            @Override
            public void getjson(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                modleCallBack.success(bean);

            }
        });

    }
}
