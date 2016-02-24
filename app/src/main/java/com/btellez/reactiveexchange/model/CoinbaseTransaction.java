package com.btellez.reactiveexchange.model;

// Based on the JSON from Coinbase Exchange API
public class CoinbaseTransaction {
  public String type;
  public String time;
  public String product_id;
  public int sequence;
  public String order_id;
  public String size;
  public String price;
  public String side;
  public String order_type;


  @Override public String toString() {
    return "[" + type + " " + side + " " +  price + "]";
  }
}