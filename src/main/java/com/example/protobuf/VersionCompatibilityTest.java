package com.example.protobuf;

import com.example.models.Television;
import com.example.models.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatibilityTest {

  public static void main(String[] args) throws IOException {

    Path pathV1 = Paths.get("tv-v1");
    Path pathV2 = Paths.get("tv-v2");
    Path pathV3 = Paths.get("tv-v3");
    Path pathV4 = Paths.get("tv-v4");

    //    Television television1 = Television.newBuilder().setBrand("sony").setYear(2019).build();
    //    Files.write(pathV1, television1.toByteArray());

    Television television2 =
        Television.newBuilder().setBrand("sony").setModel(2019).setType(Type.HD).build();
    Files.write(pathV2, television2.toByteArray());

    //
    //    byte[] bytes = Files.readAllBytes(pathV1);
    //
    //    System.out.println(Television.parseFrom(bytes));
  }
}
