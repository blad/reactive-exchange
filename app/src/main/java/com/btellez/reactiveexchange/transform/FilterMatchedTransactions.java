package com.btellez.reactiveexchange.transform;

import rx.functions.Func1;

public class FilterMatchedTransactions implements Func1<String, Boolean> {
  @Override public Boolean call(String transactionString) {
    return transactionString.contains("match");
  }
}
