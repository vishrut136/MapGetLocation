package com.example.vatsc.hide_n_seek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.hello);
    }
    public void Show(View view)
    {
        textView.setVisibility(view.VISIBLE);
    }
    public void Hide(View view)
    {
        textView.setVisibility(view.INVISIBLE);
    }
}
