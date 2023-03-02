package com.rorpheeyah.edittextutils.otp

import android.content.Context
import android.graphics.Color
import android.text.InputType
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class OTPChildEditText: AppCompatEditText {

    constructor(context: Context): super(context){
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs){
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr){
        init(context)
    }

    private fun init(context: Context) {
        isCursorVisible = false
        setTextColor(Color.TRANSPARENT)
        setBackgroundColor(Color.TRANSPARENT)
        inputType = InputType.TYPE_CLASS_NUMBER
        setSelectAllOnFocus(false)
        setTextIsSelectable(false)
    }

    public override fun onSelectionChanged(selStart: Int, selEnd: Int) {
        val text = text
        text?.let {
            if(selStart != text.length || selEnd != text.length){
                setSelection(text.length, text.length)
                return
            }
        }
        super.onSelectionChanged(selStart, selEnd)
    }
}
