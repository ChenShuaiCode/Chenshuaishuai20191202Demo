package com.bawei.chenshuaishuai20191202.contract;

import com.bawei.chenshuaishuai20191202.modle.entity.Bean;

public interface INewsContract {
    interface imodle{
        void getdata(String url,ModelCallBack modleCallBack);
        interface ModelCallBack{
            void success(Bean bean);

        }

    }
    interface iview{
        void success(Bean bean);

        void failure(Throwable throwable);

    }

    interface ipresenter{
        void getdata(String url);


    }
}
