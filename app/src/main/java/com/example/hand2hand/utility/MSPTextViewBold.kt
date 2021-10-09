package com.example.hand2hand.utility

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MSPTextViewBold(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs){
    init {
        //Calling a function to apply the font
        applyFont()
    }
    private fun applyFont(){
        //This is a function to apply the font to the component
        val typeface :Typeface =
            Typeface.createFromAsset(context.assets,"Roboto-Black.ttf")
        setTypeface(typeface)
    }
}