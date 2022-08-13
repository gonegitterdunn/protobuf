package com.example.protobuf;

import com.example.models.Credentials;
import com.example.models.EmailCredentials;
import com.example.models.PhoneOTP;

public class OneOfDemo {

  public static void main(String[] args) {

    EmailCredentials emailCredentials =
        EmailCredentials.newBuilder().setEmail("nod@gmail.com").setPassword("123").build();

    PhoneOTP phoneOTP = PhoneOTP.newBuilder().setNumber(123123123).setCode(123).build();

    Credentials credentials =
        Credentials.newBuilder().setEmailMode(emailCredentials).setPhoneMode(phoneOTP).build();

    login(credentials);
  }

  private static void login(Credentials credentials) {

    switch (credentials.getModeCase()) {
      case EMAIL_MODE:
        System.out.println(credentials.getEmailMode());
        break;
      case PHONE_MODE:
        System.out.println(credentials.getPhoneMode());
        break;
    }
    System.out.println(credentials.getEmailMode());
  }
}
