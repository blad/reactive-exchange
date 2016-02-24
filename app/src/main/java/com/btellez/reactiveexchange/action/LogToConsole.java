package com.btellez.reactiveexchange.action;

import android.util.Log;

import com.btellez.reactiveexchange.model.CoinbaseTransaction;

import rx.functions.Action1;

public class LogToConsole implements Action1<CoinbaseTransaction> {
  @Override public void call(CoinbaseTransaction transaction) {
    Log.d("Coinbase Transation", transaction.toString());
  }
}
