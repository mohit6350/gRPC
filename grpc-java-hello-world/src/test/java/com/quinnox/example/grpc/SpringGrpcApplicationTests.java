package com.quinnox.example.grpc;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import com.codenotfound.grpc.HelloWorldClient;

import com.quinnox.example.grpc.client.AddNumberServiceClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringGrpcApplicationTests {

  @Autowired
  private AddNumberServiceClient numberServiceClient;
  //private HelloWorldClient helloWorldClient;

  @Test
  public void testSayHello() {
    assertThat(numberServiceClient.addNumber(10, 10))
        .isEqualTo(20);
  }
}

