package com.example.finalassignment

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


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

    lateinit var avdc: AnimatedVectorDrawableCompat
    lateinit var avd: AnimatedVectorDrawable
    lateinit var animationView : AnimationView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        animationView = AnimationView(this)




    }






    fun animate(view: View) {


        var imageView:ImageView = imageView1
        var drawable: Drawable = imageView.drawable
//        animationView.setViewSize(300,300)




        if(drawable is AnimatedVectorDrawableCompat){
            this.avdc = (drawable)
            avdc.start()
        }
        else if (drawable is AnimatedVectorDrawable){
            this.avd = (drawable)
            avd.start()
        }





    }






}