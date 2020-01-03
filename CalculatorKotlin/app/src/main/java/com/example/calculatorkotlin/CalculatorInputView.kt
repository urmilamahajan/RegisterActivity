package com.example.calculatorkotlin

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.view_calculator_input.view.*

class CalculatorInputView(context: Context, attributeSet: AttributeSet?) :
    RelativeLayout(context, attributeSet) {

    init {
        //Inflate layout
        LayoutInflater.from(context).inflate(R.layout.view_calculator_input, this, true)

        //Read attribute set
        attributeSet?.run {
            val typedArray: TypedArray =
                context.obtainStyledAttributes(attributeSet, R.styleable.CalculatorInputView)

            val textResource: String? =
                typedArray.getString(R.styleable.CalculatorInputView_itemText)
            val iconResource =
                typedArray.getResourceId(R.styleable.CalculatorInputView_itemIcon, -1)


            //same as if else statement
            when {
                iconResource != -1 -> {
                    input_element_text.visibility = View.GONE
                    input_element_image.apply {
                        visibility = View.VISIBLE
                        setImageResource(iconResource)
                    }

                }
                !textResource.isNullOrEmpty() -> {
                    input_element_image.visibility = View.GONE
                    input_element_text.apply {
                        visibility = View.VISIBLE
                        text = textResource
                    }

                }
                else -> {
                    input_element_image.visibility = View.GONE
                    input_element_text.visibility = View.GONE
                }
            }

            typedArray.recycle()
        }


    }

    override fun setOnClickListener(l: OnClickListener?) {
        input_element_click.setOnClickListener(l)
    }

}
