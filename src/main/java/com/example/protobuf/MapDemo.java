package com.example.protobuf;

import com.example.models.BodyStyle;
import com.example.models.Car;
import com.example.models.Dealer;

public class MapDemo {

  public static void main(String[] args) {
    Car civic =
        Car.newBuilder()
            .setMake("honda")
            .setModel("civic")
            .setBodyStyle(BodyStyle.COUPE)
            .setYear(2020)
            .build();

    Car accord = Car.newBuilder().setMake("honda").setModel("accord").setYear(2021).build();

    Dealer dealer = Dealer.newBuilder().putModel(2020, civic).putModel(2021, accord).build();

    System.out.println(dealer.getModelOrThrow(2020).getBodyStyle());
  }
}
