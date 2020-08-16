package com.example.finalassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/*TODO
   Loading View with Animation
   Use the image provided and create a custom view with fill animation as shown in the video
   The View must have these functions
   1)setViewSize(width,height)
   2)setFillColor(anycolor)
   3)animateView (startPercentage, endPercentage, durationInSeconds)
   4)setAnFillyPercentage(fillPercentage)


*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}