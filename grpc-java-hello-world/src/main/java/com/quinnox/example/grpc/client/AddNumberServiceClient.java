package com.quinnox.example.grpc.client;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.codenotfound.grpc.helloworld.AddNumberServiceGrpc;
import com.codenotfound.grpc.helloworld.Request;
import com.codenotfound.grpc.helloworld.Response;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class AddNumberServiceClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(AddNumberServiceClient.class);

	private AddNumberServiceGrpc.AddNumberServiceBlockingStub addNumberServiceBlockingStub;

	@PostConstruct
	private void init() {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

		addNumberServiceBlockingStub = AddNumberServiceGrpc.newBlockingStub(managedChannel);
	}
	
	public long addNumber(long a , long b) {
		Request request = Request.newBuilder().setA(a).setB(b).build();
		LOGGER.info("client sending a:b = "+a+" : "+b);
		Response resp = addNumberServiceBlockingStub.addNumber(request);
		LOGGER.info("client received : "+ resp);
		
		return resp.getResult();
	}
}
