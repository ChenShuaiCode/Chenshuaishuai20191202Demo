package com.bawei.chenshuaishuai20191202.presenter;

import com.bawei.chenshuaishuai20191202.contract.INewsContract;
import com.bawei.chenshuaishuai20191202.modle.NewsModle;
import com.bawei.chenshuaishuai20191202.modle.entity.Bean;

public class NewsPresenter implements INewsContract.ipresenter {
    private NewsModle newsModle;
    private INewsContract.iview iview;

    public NewsPresenter(INewsContract.iview iview) {
        this.iview = iview;
    }

    @Override
    public void getdata(String url) {
        newsModle=new NewsModle();
        newsModle.getdata(url, new INewsContract.imodle.ModelCallBack() {
            @Override
            public void success(Bean bean) {
                iview.success(bean);
            }
        });


    }
}
