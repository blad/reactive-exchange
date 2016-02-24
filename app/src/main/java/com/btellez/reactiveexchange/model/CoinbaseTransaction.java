package com.btellez.reactiveexchange.model;

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
    return "[" + type + " " + order_type + " " +  price + "]";
  }
}