package com.example.ch11_5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.ResourceBundle;

public class Draw2D extends View {
    public Draw2D(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);
        canvas.drawPaint(paint);

        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        canvas.drawCircle(80,30,25,paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(20,15,50,100,paint);

      //  Resources res = this.getResources();
       // Bitmap bitmap = BitmapFactory.decodeResource(res,R.drawable.);

       // canvas.drawBitmap(bitmap,50,200,paint);

        paint.setColor(Color.GRAY);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setTextSize(30);
        canvas.drawText("MY APP",50,100,paint);

        paint.setColor(Color.BLACK);
        paint.setTextSize(25);
        String str = "旋轉城市";

        canvas.rotate(-45,200,200);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(str,200,200,paint);


    }
}
