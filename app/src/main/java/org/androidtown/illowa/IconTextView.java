package org.androidtown.illowa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/*
 * Created by Lee on 2015-07-30.
 */
public class IconTextView extends LinearLayout {
    private ImageView mIcon;
    private TextView mText01;
    private TextView mText02;
    private TextView mText03;

    public IconTextView(Context context, IconTextItem aItem) {
        super(context);

        // Layout Inflation
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.listitem, this, true);

        // Set Icon
        mIcon = (ImageView) findViewById(R.id.iconItem);
        mIcon.setImageDrawable(aItem.getIcon());

        // Set Text 01
        mText01 = (TextView) findViewById(R.id.dataItem01);
        mText01.setText(aItem.getData(0));

        // Set Text 02
        mText02 = (TextView) findViewById(R.id.dataItem02);
        mText02.setText(aItem.getData(1));

        // Set Text 03
        mText03 = (TextView) findViewById(R.id.dataItem03);
        mText03.setText(aItem.getData(2));

    }

    public void setText(int index, String data) {
        if (index == 0) {
            mText01.setText(data);
        } else if (index == 1) {
            mText02.setText(data);
        } else if (index == 2) {
            mText03.setText(data);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setIcon(Drawable icon) {
        mIcon.setImageDrawable(icon);
    }


}
