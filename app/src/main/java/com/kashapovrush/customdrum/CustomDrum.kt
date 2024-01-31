package com.kashapovrush.customdrum

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.view.View

class CustomDrum(
    context: Context, attributeSet: AttributeSet
) : View(context, attributeSet) {

    private val paint = Paint()

    init {
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 3f
        paint.color = Color.RED
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val res = resources
        drawCustomCircle(canvas, Color.RED, 51.429f, 0f)
        drawCustomCircle(canvas, res.getColor(R.color.orange), 51.429f, 51.429f)
        drawCustomCircle(canvas, Color.YELLOW, 51.429f, 102.857f)
        drawCustomCircle(canvas, Color.GREEN, 51.429f, 154.286f)
        drawCustomCircle(canvas, Color.BLUE, 51.429f, 205.715f)
        drawCustomCircle(canvas, res.getColor(R.color.light_blue), 51.429f, 257.144f)
        drawCustomCircle(canvas, res.getColor(R.color.violet), 51.429f, 308.573f)



    }

    private fun drawCustomCircle(
        canvas: Canvas,
        color: Int,
        finishAngle: Float,
        startAngle: Float
    ) {
        val paint = Paint()
        paint.color = color
        val centerX = width / 2f
        val centerY = height / 2f
        val radius = 300f
        canvas.drawArc(
            centerX - radius,
            centerY - radius,
            centerX + radius,
            centerY + radius,
            startAngle,
            finishAngle,
            true,
            paint
        )
    }
}