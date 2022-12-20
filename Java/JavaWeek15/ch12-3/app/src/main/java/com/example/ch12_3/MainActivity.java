package com.example.ch12_3;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private TextView output;
    private ImageView compass;
    private float currentDegree =0f;
    private SensorManager sm;
    private Sensor ms,as;
    float[] gravity,geomagnetic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compass=(ImageView) findViewById(R.id.imageView);
        output = (TextView) findViewById(R.id.Output);

        sm =(SensorManager) getSystemService(SENSOR_SERVICE);
        ms = sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        as = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        sm.registerListener(this,ms,SensorManager.SENSOR_DELAY_NORMAL);
        sm.registerListener(this,as,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected  void onPause()
    {
        super.onPause();
        sm.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
    Sensor mySensor = sensorEvent.sensor;
    if(mySensor.getType()==Sensor.TYPE_ACCELEROMETER)
        gravity = sensorEvent.values;
    if(mySensor.getType()==Sensor.TYPE_MAGNETIC_FIELD)
        geomagnetic = sensorEvent.values;

    if(gravity!=null && geomagnetic!=null)
    {
        float r[] = new float[9];

        boolean success = SensorManager.getRotationMatrix(r,null,gravity,geomagnetic);
        if(success)
        {
            float values[] = new float[3];
            SensorManager.getOrientation(r,values);
            float degree = Math.round(Math.toDegrees(values[0])+360)%360;
            output.setText("目前方位"+Float.toString(degree)+"度");

            RotateAnimation ra = new RotateAnimation(
                    currentDegree,-degree,
                    Animation.RELATIVE_TO_SELF,0.5f,
                    Animation.RELATIVE_TO_SELF,0.5f);
            ra.setDuration(120);
            ra.setFillAfter(true);
            compass.startAnimation(ra);
            currentDegree = -degree;
        }
    }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}