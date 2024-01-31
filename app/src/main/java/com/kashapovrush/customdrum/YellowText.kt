package com.kashapovrush.customdrum

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class YellowText(
    context: Context, attributeSet: AttributeSet
) : View(context, attributeSet) {

    val paint = Paint()

    init {
        paint.strokeWidth = 5f
        paint.color = Color.YELLOW
        paint.textSize = 100f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawText(
            "YELLOW", 0f, 200f, paint)
    }
}