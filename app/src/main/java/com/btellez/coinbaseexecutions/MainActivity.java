package com.btellez.coinbaseexecutions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.koushikdutta.async.http.AsyncHttpClient;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {
    public static final String CoinBaseSocketUrl = "wss://ws-feed.exchange.coinbase.com";
    public static final String CoinbaseProtocol = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoinbaseWebsocket ws = new CoinbaseWebsocket();

        Observable
        .create(ws)
        .sample(1, TimeUnit.SECONDS)
        .subscribe(new PrintToConsole());

        // Start Producing Items:
        initWebsocket(ws);
    }


    private void initWebsocket(AsyncHttpClient.WebSocketConnectCallback websocket) {
        AsyncHttpClient
        .getDefaultInstance()
        .websocket(CoinBaseSocketUrl, CoinbaseProtocol, websocket);
    }


    protected static class PrintToConsole implements Action1<String> {
        @Override public void call(String payload) {
            Log.d("Coinbase Transation", payload);
        }
    }
}
