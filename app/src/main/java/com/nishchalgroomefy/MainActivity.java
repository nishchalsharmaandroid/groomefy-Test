package com.nishchalgroomefy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nishchalgroomefy.Opengl.OpenGlActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_layout);
        setUpUi();

    }

    private void setUpUi() {
        Button drawCircle = (Button) findViewById(R.id.draw_circle);
        Button drawRectangle = (Button) findViewById(R.id.draw_rectangle);
        Button drawSquare = (Button) findViewById(R.id.draw_square);

        //register click events on button
        drawCircle.setOnClickListener(this);
        drawRectangle.setOnClickListener(this);
        drawSquare.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.draw_circle:
                 intent=new Intent(this, OpenGlActivity.class);
                intent.putExtra("shapeType","circle");
                startActivity(intent);
                break;

            case R.id.draw_rectangle:
                intent=new Intent(this, OpenGlActivity.class);
                intent.putExtra("shapeType","rectangle");
                startActivity(intent);
                break;

            case R.id.draw_square:
                intent=new Intent(this, OpenGlActivity.class);
                intent.putExtra("shapeType","square");
                startActivity(intent);
                break;


        }
    }
}
