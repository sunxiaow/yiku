package com.example.asus.pin;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

public class Fragment_home extends Fragment {
    private RollPagerView rollPagerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_home,null);
        rollPagerView=view.findViewById(R.id.roll_view_pager);
        rollPagerView.setPlayDelay(1000);
        rollPagerView.setAnimationDurtion(500);
        rollPagerView.setAdapter(new TestNormalAdapter());
        rollPagerView.setHintView(new ColorPointHintView(getContext(),Color.YELLOW,Color.WHITE));
        return view;
        }
    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
            R.mipmap.nb_coupon,
            R.mipmap.nb_discount_coupon,
            R.mipmap.nb_discount_redbag,
            R.mipmap.nb_coupon,
            R.mipmap.nb_discount_coupon,
            R.mipmap.nb_discount_redbag,
            };
        public View getView(ViewGroup container, int position){
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
            }
        @Override
        public int getCount(){
            return imgs.length;
            }
        }
}
