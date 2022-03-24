package com.example.nftpioneers;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * MainActivity.java & activity_main.xml = Welcome Screen page
 * MainActivity2.java & activity_main2.xml = Main Menu page
 * MainActivity3.java & activity_main3.xml = Discover NFT's page
 * MainActivity4.java & activity_main4.xml = View Current NFT Holdings page
 * MainActivity5.java & activity_main5.xml = View Instructions pag
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.test1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity2();
            }
        });
    }
    public void MainActivity2(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}