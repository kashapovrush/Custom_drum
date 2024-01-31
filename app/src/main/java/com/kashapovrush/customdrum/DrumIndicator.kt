package com.kashapovrush.customdrum

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class DrumIndicator(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    private val paint = Paint()

    init {
        paint.strokeWidth = 10f
        paint.color = Color.BLACK
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawLine(
            0f, (height / 2).toFloat(), width.toFloat(), (height / 2).toFloat(), paint
        )
    }
}