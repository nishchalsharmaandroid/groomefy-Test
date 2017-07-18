package com.nishchalgroomefy.Opengl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Sharma on 7/16/2017.
 */

public class OpenGlActivity extends AppCompatActivity {
    private MyGLSurfaceView glSurfaceView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*Pass Selected Shape Type*/
        Intent intent=getIntent();
        if(intent!=null){
            String shapeType = intent.getExtras().getString("shapeType", "square");
            glSurfaceView = new MyGLSurfaceView(this,shapeType);
        setContentView(glSurfaceView);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        glSurfaceView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        glSurfaceView.onResume();
    }
}