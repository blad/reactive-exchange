package com.btellez.reactiveexchange;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.btellez.reactiveexchange.action.LogToConsole;
import com.btellez.reactiveexchange.action.UpdateTransactionStats;
import com.btellez.reactiveexchange.databinding.ActivityMainBinding;
import com.btellez.reactiveexchange.model.CoinbaseTransaction;
import com.btellez.reactiveexchange.model.ExchangeTransactionStats;
import com.btellez.reactiveexchange.transform.FilterMatchedTransactions;
import com.btellez.reactiveexchange.transform.JsonStringToTransaction;
import com.koushikdutta.async.http.AsyncHttpClient;

import rx.Observable;

public class MainActivity extends AppCompatActivity {
  public static final String CoinBaseSocketUrl = "wss://ws-feed.exchange.coinbase.com";
  public static final String CoinbaseProtocol = "";


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ExchangeTransactionStats statsModel = new ExchangeTransactionStats();

    CoinbaseWebsocket ws = new CoinbaseWebsocket();

    // TODO: Create Observable from Websocket
    // TODO: Create Observable of CoinbaseTransaction objects

    // Subscribe to Events
    // TODO: Subscribe to Events

    initWebsocket(ws); // Start Producing Items:
    initView(statsModel); // Init the View
  }


  private void initView(ExchangeTransactionStats statsSource) {
    // TODO: User DataBindingUtil to setContentView
    // TODO: setExchangeStats source model
  }


  private void initWebsocket(AsyncHttpClient.WebSocketConnectCallback websocket) {
    AsyncHttpClient
      .getDefaultInstance()
      .websocket(CoinBaseSocketUrl, CoinbaseProtocol, websocket);
  }
}
