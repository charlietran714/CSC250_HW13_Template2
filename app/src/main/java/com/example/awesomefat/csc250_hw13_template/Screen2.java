package com.example.awesomefat.csc250_hw13_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_screen2);
        //String theName = this.getIntent().getStringExtra("myName");
        int[] ar = this.getIntent().getIntArrayExtra("myAR");
        this.sort(ar);

        ViewGroup theVLL = (ViewGroup)this.findViewById(R.id.theVerticalLinearLayout);

        for(int i = 0; i < ar.length; i++)
        {
            TextView tv = new TextView(this);
            tv.setText("" + ar[i]);
            theVLL.addView(tv);
        }
    }
    private void sort(int[] ar)
    {
        for(int i = 0; i < ar.length; i++)
        {
            for(int j = 0; j < ar.length; j++)
            {
                if(ar[i] < ar[j])
                {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }

}
