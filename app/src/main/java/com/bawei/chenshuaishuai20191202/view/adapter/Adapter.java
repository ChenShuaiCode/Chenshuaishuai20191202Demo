package com.bawei.chenshuaishuai20191202.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.chenshuaishuai20191202.R;
import com.bawei.chenshuaishuai20191202.modle.entity.Bean;
import com.bawei.chenshuaishuai20191202.utils.NetUtils;

import java.util.List;

public class Adapter extends BaseAdapter {
    private List<Bean.ResultBean> list;

    public Adapter(List<Bean.ResultBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Wo wo;
        convertView=View.inflate(parent.getContext(), R.layout.adapter,null);
        wo=new Wo();
        wo.im=convertView.findViewById(R.id.im);
        wo.text_1=convertView.findViewById(R.id.text_1);
        convertView.setTag(wo);
        NetUtils.getInstance().getphoto(list.get(position).getMasterPic(),wo.im);
        wo.text_1.setText(list.get(position).getCommodityName());

        return convertView;
    }
    class Wo{
        TextView text_1;
        ImageView im;
    }
}
