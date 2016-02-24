package com.btellez.reactiveexchange.action;

import com.btellez.reactiveexchange.model.CoinbaseTransaction;
import com.btellez.reactiveexchange.model.ExchangeTransactionStats;

import rx.functions.Action1;

/**
 * Created by tellez on 2/23/16.
 */
public class UpdateTransactionStats implements Action1<CoinbaseTransaction> {

  private final ExchangeTransactionStats stats = new ExchangeTransactionStats();

  public ExchangeTransactionStats getStats() {
    return stats;
  }

  @Override public void call(CoinbaseTransaction transaction) {
    float nextPrice = Float.valueOf(transaction.price);
    int currentTotal = stats.count.get();

    // Update Total
    int newTotal = currentTotal + 1;
    stats.count.set(newTotal);

    // Update Minimum Price
    float currentMin = stats.minimum.get();
    if (currentMin > 0) {
      stats.minimum.set(Math.min(currentMin, nextPrice));
    } else {
      stats.minimum.set(nextPrice);
    }

    // Update Minimum Price
    float currentMax = stats.maximum.get();
    stats.maximum.set(Math.max(currentMax, nextPrice));

    // Update Average
    float average = stats.average.get();
    float newAverage = (average * currentTotal);
    stats.average.set((newAverage + nextPrice) / newTotal);
  }
}