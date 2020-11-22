package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    // Declared variables:
    TextView mStoryText;
    Button mTopButton;
    Button mBottomButton;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //Link layout views to variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);

        //Top Button Click:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3){
                    mStoryText.setText(R.string.T6_End);
                    mTopButton.setText(R.string.play_again);
                    mBottomButton.setText(R.string.exit);
                    mStoryIndex = 0;
                } else {
                    mStoryText.setText(R.string.T1_Story);
                    mTopButton.setText(R.string.T1_Ans1);
                    mBottomButton.setText(R.string.T1_Ans2);
                    mStoryIndex = 1;
                }
            }
        });

        //Bottom Button Click:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStoryText.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStoryText.setText(R.string.T4_End);
                    mTopButton.setText(R.string.play_again);
                    mBottomButton.setText(R.string.exit);
                    mStoryIndex = 0;
                } else if (mStoryIndex ==3){
                    mStoryText.setText(R.string.T5_End);;
                    mTopButton.setText(R.string.play_again);
                    mBottomButton.setText(R.string.exit);
                    mStoryIndex = 0;
                } else {
                    finish();
                }
            }
        });
    }

}
