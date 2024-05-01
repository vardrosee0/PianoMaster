package com.example.pianomaster;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import pl.droidsonroids.gif.GifImageView;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int images[] = {

            R.drawable.mickeymouse,
            R.drawable.playingpiano,
            R.drawable.cute_cat,
            R.drawable.cute_cat2

    };

    int images2[] = {

            R.drawable.c_note,
            R.drawable.c_sharp,
            R.drawable.d_note,
            R.drawable.d_sharp,
            R.drawable.e_note,
            R.drawable.f_note,
            R.drawable.f_sharp,
            R.drawable.g_note,
            R.drawable.g_sharp,
            R.drawable.a_note,
            R.drawable.b_flat,
            R.drawable.b_note,

    };

    int headings[] = {

            R.string.heading_one,
            R.string.heading_two,
            R.string.heading_three,
            R.string.heading_fourth
    };

    int description[] = {

            R.string.desc_one,
            R.string.desc_two,
            R.string.desc_three,
            R.string.desc_fourth
    };

    public ViewPagerAdapter(Context context){

        this.context = context;

    }

    @Override
    public int getCount() {
        if(BeginnerActivity.for_notes == 1) {
            return  images2.length;
        }
        return  headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_layout,container,false);

        GifImageView slidetitleimage =  view.findViewById(R.id.titleImage);
        TextView slideHeading = (TextView) view.findViewById(R.id.texttitle);
        TextView slideDesciption = (TextView) view.findViewById(R.id.textdeccription);

        if (BeginnerActivity.for_notes == 1) {
            slidetitleimage.setImageResource(images2[position]);
        } else {
            slidetitleimage.setImageResource(images[position]);
            slideHeading.setText(headings[position]);
            slideDesciption.setText(description[position]);
        }



        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);

    }
}