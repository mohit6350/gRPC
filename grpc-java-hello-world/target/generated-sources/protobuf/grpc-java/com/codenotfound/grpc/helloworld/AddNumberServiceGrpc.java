package com.codenotfound.grpc.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: HelloWorld.proto")
public final class AddNumberServiceGrpc {

  private AddNumberServiceGrpc() {}

  public static final String SERVICE_NAME = "com.codenotfound.grpc.helloworld.AddNumberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.Request,
      com.codenotfound.grpc.helloworld.Response> getAddNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addNumber",
      requestType = com.codenotfound.grpc.helloworld.Request.class,
      responseType = com.codenotfound.grpc.helloworld.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.Request,
      com.codenotfound.grpc.helloworld.Response> getAddNumberMethod() {
    io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.Request, com.codenotfound.grpc.helloworld.Response> getAddNumberMethod;
    if ((getAddNumberMethod = AddNumberServiceGrpc.getAddNumberMethod) == null) {
      synchronized (AddNumberServiceGrpc.class) {
        if ((getAddNumberMethod = AddNumberServiceGrpc.getAddNumberMethod) == null) {
          AddNumberServiceGrpc.getAddNumberMethod = getAddNumberMethod = 
              io.grpc.MethodDescriptor.<com.codenotfound.grpc.helloworld.Request, com.codenotfound.grpc.helloworld.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.codenotfound.grpc.helloworld.AddNumberService", "addNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new AddNumberServiceMethodDescriptorSupplier("addNumber"))
                  .build();
          }
        }
     }
     return getAddNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddNumberServiceStub newStub(io.grpc.Channel channel) {
    return new AddNumberServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddNumberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AddNumberServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddNumberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AddNumberServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AddNumberServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addNumber(com.codenotfound.grpc.helloworld.Request request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.codenotfound.grpc.helloworld.Request,
                com.codenotfound.grpc.helloworld.Response>(
                  this, METHODID_ADD_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class AddNumberServiceStub extends io.grpc.stub.AbstractStub<AddNumberServiceStub> {
    private AddNumberServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddNumberServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddNumberServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddNumberServiceStub(channel, callOptions);
    }

    /**
     */
    public void addNumber(com.codenotfound.grpc.helloworld.Request request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddNumberServiceBlockingStub extends io.grpc.stub.AbstractStub<AddNumberServiceBlockingStub> {
    private AddNumberServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddNumberServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddNumberServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddNumberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.codenotfound.grpc.helloworld.Response addNumber(com.codenotfound.grpc.helloworld.Request request) {
      return blockingUnaryCall(
          getChannel(), getAddNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddNumberServiceFutureStub extends io.grpc.stub.AbstractStub<AddNumberServiceFutureStub> {
    private AddNumberServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddNumberServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddNumberServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddNumberServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.codenotfound.grpc.helloworld.Response> addNumber(
        com.codenotfound.grpc.helloworld.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getAddNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_NUMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddNumberServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddNumberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_NUMBER:
          serviceImpl.addNumber((com.codenotfound.grpc.helloworld.Request) request,
              (io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AddNumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddNumberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.codenotfound.grpc.helloworld.HelloWorld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddNumberService");
    }
  }

  private static final class AddNumberServiceFileDescriptorSupplier
      extends AddNumberServiceBaseDescriptorSupplier {
    AddNumberServiceFileDescriptorSupplier() {}
  }

  private static final class AddNumberServiceMethodDescriptorSupplier
      extends AddNumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddNumberServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AddNumberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddNumberServiceFileDescriptorSupplier())
              .addMethod(getAddNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
