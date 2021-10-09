package com.example.hand2hand.utility

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class H2HEditText (context :Context,attrs :AttributeSet): AppCompatEditText(context, attrs){
    init {
        //Call applyFont function for the initialization
        applyFont()
    }
    private fun applyFont(){
        //This is used to get the font from
        val typeface :Typeface=
            Typeface.createFromAsset(context.assets,"Roboto-Regular.ttf")
        setTypeface(typeface)
    }
}