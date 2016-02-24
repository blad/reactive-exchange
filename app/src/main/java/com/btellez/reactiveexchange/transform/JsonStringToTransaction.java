package com.btellez.reactiveexchange.transform;

import com.btellez.reactiveexchange.model.CoinbaseTransaction;
import com.google.gson.Gson;

import rx.functions.Func1;

public class JsonStringToTransaction implements Func1<String, CoinbaseTransaction> {
  protected final Gson jsonParser = new Gson();
  @Override public CoinbaseTransaction call(String jsonString) {
    return jsonParser.fromJson(jsonString, CoinbaseTransaction.class);
  }
}
