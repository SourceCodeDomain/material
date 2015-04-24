package com.sourcecodedomain.material.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sourcecodedomain.material.R;
import com.sourcecodedomain.material.model.DrawerItem;

import java.util.ArrayList;

/**
 * Created by Android on 15/04/2015.
 */
public class DrawerMenuAdapter extends BaseAdapter {

    private ArrayList<DrawerItem> mItens;
    private Activity mActivity;

    public DrawerMenuAdapter(ArrayList<DrawerItem> mItens, Activity mActivity) {
        this.mItens = mItens;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return mItens.size();
    }

    @Override
    public Object getItem(int position) {
        return mItens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = mActivity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.drawer_menu_item, parent, false);

            viewHolder = new ViewHolder(convertView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        DrawerItem drawerItem = (DrawerItem) this.getItem(position);

        viewHolder.imageViewDrawerIcon.setImageResource(drawerItem.getIcon());
        viewHolder.textViewDrawerTitle.setText(drawerItem.getTitle());

        return convertView;
    }

    private class ViewHolder {

        public ImageView imageViewDrawerIcon;
        public TextView textViewDrawerTitle;

        public ViewHolder(View view) {
            imageViewDrawerIcon = (ImageView) view.findViewById(R.id.image_view_drawer_icon);
            textViewDrawerTitle = (TextView) view.findViewById(R.id.text_view_drawer_title);
        }
    }
}
