package com.ximalia;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Hello_GET_Test {
  @Test
  void Hello_GET(){
    RestAssured.get(path, pathParams)
  }
  
}
