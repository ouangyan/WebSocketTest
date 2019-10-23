package com.xy.test.websockettest;

import android.util.Log;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

/**
 * Created by Ouyang on 2019/10/23.
 */

public class JWebSocketClient extends WebSocketClient {
    public JWebSocketClient(URI serverUrl){
        super(serverUrl,new Draft_6455());
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        Log.i("onOpen","调用了JWebSocketClient的onOpen");
    }

    @Override
    public void onMessage(String message) {
        Log.i("onMessage","调用了JWebSocketClient的onMessage");
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        Log.i("onClose","调用了JWebSocketClient的onClose");
    }

    @Override
    public void onError(Exception ex) {
        Log.i("onError","调用了JWebSocketClient的onError");
    }
}
