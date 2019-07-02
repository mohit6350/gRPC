package com.quinnox.example.grpc.client;

import org.lognet.springboot.grpc.GRpcService;

import com.codenotfound.grpc.helloworld.AddNumberServiceGrpc.AddNumberServiceImplBase;
import com.codenotfound.grpc.helloworld.Request;
import com.codenotfound.grpc.helloworld.Response;

import io.grpc.stub.StreamObserver;

@GRpcService
public class AddNumberServiceImpl extends AddNumberServiceImplBase{

	@Override
	public void addNumber(Request request, StreamObserver<Response> responseObserver) {
		long a = request.getA();
		long b = request.getB();
		long answer = a+b;
		Response response = Response.newBuilder().setResult(answer).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	
}
