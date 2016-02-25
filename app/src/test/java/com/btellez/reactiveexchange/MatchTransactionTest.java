package com.btellez.reactiveexchange;

import com.btellez.reactiveexchange.transform.FilterMatchedTransactions;

import org.junit.Assert;
import org.junit.Test;

public class MatchTransactionTest {

  @Test
  public void testMatchedTransactionInvalidInputs() {
    FilterMatchedTransactions filter = new FilterMatchedTransactions();
    Assert.assertFalse(filter.call("invlid-transaction-string"));
    Assert.assertFalse(filter.call("{}"));
    Assert.assertFalse(filter.call(""));
    Assert.assertFalse(filter.call("{ \"type\": \"subscribe\", \"product_id\": \"BTC-USD\" }"));
  }


  @Test
  public void testValidInputsNotCompleted() {
    FilterMatchedTransactions filter = new FilterMatchedTransactions();
    Assert.assertFalse(filter.call("{ \"type\": \"subscribe\", \"product_id\": \"BTC-USD\" }"));
  }

}