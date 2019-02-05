package com.zensol.techs.sliders;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appyvet.materialrangebar.RangeBar;

public class MainActivity extends AppCompatActivity {

    // TODO: 2/5/2019 Var sec.....
    AppCompatSeekBar appCompatSeekBar;
    TextView appCompatSeekBarValue;

    RangeBar rangeBar1;
    TextView rangeBar1Value;

    RangeBar rangeBar2;
    TextView rangeBar2leftValue;
    TextView rangeBar2rightValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 2/5/2019 Declaration Sec...
        appCompatSeekBar = (AppCompatSeekBar) findViewById(R.id.AppCompatSeekBar_id);
        appCompatSeekBarValue = (TextView) findViewById(R.id.AppCompatSeekBar_value);

        rangeBar1 = (RangeBar) findViewById(R.id.RangeBar1_id);
        rangeBar1Value = (TextView) findViewById(R.id.RangeBar1_value);

        rangeBar2 = (RangeBar) findViewById(R.id.RangeBar2_id);
        rangeBar2leftValue = (TextView) findViewById(R.id.RangeBar2_leftvalue);
        rangeBar2rightValue = (TextView) findViewById(R.id.RangeBar2_rightvalue);

        //AppCompatSeekBar Default Value...
        appCompatSeekBar.setProgress(0);

        //AppCompatSeekBat Step Value...
        appCompatSeekBar.setKeyProgressIncrement(1);

        appCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String value = String.valueOf(progress);
                appCompatSeekBarValue.setText(value);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
 
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // rangebar..................
        // index start from 1
        rangeBar1.setSeekPinByIndex(0);
        // color
        rangeBar1.setPinTextColor(Color.WHITE);
        // slider color...
        rangeBar1.setSelectorColor(getResources().getColor(R.color.colorAccent));
        // tick color
        rangeBar1.setTickColor(getResources().getColor(R.color.colorAccent));

        //rangeBar1.setConnectingLineColors(getResources().getColor(R.color.colorAccent));
        rangeBar1.setBarColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setPinColor(getResources().getColor(R.color.colorAccent));

        rangeBar1.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                rangeBar1Value.setText(rightPinValue);
            }
        });


        // Range bar 3
        rangeBar2.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                rangeBar2leftValue.setText(leftPinValue);
                rangeBar2rightValue.setText(rightPinValue);
            }
        });
    }
}
