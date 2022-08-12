// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.example.models;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   */
  int getAge();

  /**
   * <code>.Address address = 3;</code>
   */
  boolean hasAddress();
  /**
   * <code>.Address address = 3;</code>
   */
  com.example.models.Address getAddress();
  /**
   * <code>.Address address = 3;</code>
   */
  com.example.models.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>repeated .Car car = 4;</code>
   */
  java.util.List<com.example.models.Car> 
      getCarList();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  com.example.models.Car getCar(int index);
  /**
   * <code>repeated .Car car = 4;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  java.util.List<? extends com.example.models.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  com.example.models.CarOrBuilder getCarOrBuilder(
      int index);
}
