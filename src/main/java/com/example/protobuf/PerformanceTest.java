package com.example.protobuf;

import com.example.json.JPerson;
import com.example.models.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.IOException;

public class PerformanceTest {

  public static void main(String[] args) {
    // json
    JPerson person = new JPerson();
    person.setName("sam");
    person.setAge(10);
    ObjectMapper objectMapper = new ObjectMapper();

    // deserializing
    Runnable json =
        () -> {
          try {
            byte[] bytes = objectMapper.writeValueAsBytes(person);
            JPerson jPerson1 = objectMapper.readValue(bytes, JPerson.class);
          } catch (IOException e) {
            e.printStackTrace();
          }
        };

    // protobuf
    Person sam = Person.newBuilder().setName("Sam").setAge(10).build();
    // deserializing
    Runnable proto =
        () -> {
          try {
            byte[] bytes = sam.toByteArray();
            Person sam1 = Person.parseFrom(bytes);
          } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
          }
        };

    for (int i = 0; i < 5; i++) {
      runPerformanceTest(json, "JSON");
      runPerformanceTest(proto, "proto");
    }
  }

  private static void runPerformanceTest(Runnable runnable, String method) {
    long time1 = System.currentTimeMillis();
    for (int i = 0; i < 5_000_000; i++) {
      runnable.run();
    }
    long time2 = System.currentTimeMillis();

    System.out.println(method + " : " + (time2 - time1) + " ms");
  }
}
