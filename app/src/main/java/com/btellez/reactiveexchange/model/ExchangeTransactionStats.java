package com.btellez.reactiveexchange.model;

import android.databinding.ObservableFloat;
import android.databinding.ObservableInt;

public class ExchangeTransactionStats {
    public final ObservableFloat maximum = new ObservableFloat();
    public final ObservableFloat minimum = new ObservableFloat();
    public final ObservableFloat average = new ObservableFloat();
    public final ObservableInt count = new ObservableInt();
}
