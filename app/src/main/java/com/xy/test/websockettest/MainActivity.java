package com.xy.test.websockettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JWebSocketClient jWebSocketClient=new JWebSocketClient(URI.create("ws://192.168.1.57:8085/chatWebSocketEndpoint"));
        jWebSocketClient.connect();
    }
}
