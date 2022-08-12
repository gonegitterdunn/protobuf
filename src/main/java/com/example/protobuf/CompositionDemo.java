package com.example.protobuf;

import com.example.models.Address;
import com.example.models.Car;
import com.example.models.Person;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {
  public static void main(String[] args) {
    Address address =
        Address.newBuilder().setPostbox(123).setStreet("main street").setCity("Atlanta").build();

    List<Car> cars = new ArrayList<>();
    Car civic = Car.newBuilder().setMake("honda").setModel("civic").setYear(2020).build();
    Car accord = Car.newBuilder().setMake("honda").setModel("accord").setYear(2021).build();
    cars.add(civic);
    cars.add(accord);

    Person person = Person.newBuilder().setName("sam").setAge(25).addAllCar(cars).build();

    System.out.println(person);
  }
}
