package payment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Payment service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: payment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "payment.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<payment.Payment.PaymentRequest,
      payment.Payment.PaymentResponse> getMakePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakePayment",
      requestType = payment.Payment.PaymentRequest.class,
      responseType = payment.Payment.PaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payment.Payment.PaymentRequest,
      payment.Payment.PaymentResponse> getMakePaymentMethod() {
    io.grpc.MethodDescriptor<payment.Payment.PaymentRequest, payment.Payment.PaymentResponse> getMakePaymentMethod;
    if ((getMakePaymentMethod = PaymentServiceGrpc.getMakePaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getMakePaymentMethod = PaymentServiceGrpc.getMakePaymentMethod) == null) {
          PaymentServiceGrpc.getMakePaymentMethod = getMakePaymentMethod =
              io.grpc.MethodDescriptor.<payment.Payment.PaymentRequest, payment.Payment.PaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MakePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.Payment.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.Payment.PaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("MakePayment"))
              .build();
        }
      }
    }
    return getMakePaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<payment.Payment.PaymentStatusRequest,
      payment.Payment.PaymentStatusResponse> getGetPaymentStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaymentStatus",
      requestType = payment.Payment.PaymentStatusRequest.class,
      responseType = payment.Payment.PaymentStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payment.Payment.PaymentStatusRequest,
      payment.Payment.PaymentStatusResponse> getGetPaymentStatusMethod() {
    io.grpc.MethodDescriptor<payment.Payment.PaymentStatusRequest, payment.Payment.PaymentStatusResponse> getGetPaymentStatusMethod;
    if ((getGetPaymentStatusMethod = PaymentServiceGrpc.getGetPaymentStatusMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getGetPaymentStatusMethod = PaymentServiceGrpc.getGetPaymentStatusMethod) == null) {
          PaymentServiceGrpc.getGetPaymentStatusMethod = getGetPaymentStatusMethod =
              io.grpc.MethodDescriptor.<payment.Payment.PaymentStatusRequest, payment.Payment.PaymentStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaymentStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.Payment.PaymentStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.Payment.PaymentStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("GetPaymentStatus"))
              .build();
        }
      }
    }
    return getGetPaymentStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Payment service definition
   * </pre>
   */
  public static abstract class PaymentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a payment
     * </pre>
     */
    public void makePayment(payment.Payment.PaymentRequest request,
        io.grpc.stub.StreamObserver<payment.Payment.PaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMakePaymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves payment status
     * </pre>
     */
    public void getPaymentStatus(payment.Payment.PaymentStatusRequest request,
        io.grpc.stub.StreamObserver<payment.Payment.PaymentStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaymentStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMakePaymentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                payment.Payment.PaymentRequest,
                payment.Payment.PaymentResponse>(
                  this, METHODID_MAKE_PAYMENT)))
          .addMethod(
            getGetPaymentStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                payment.Payment.PaymentStatusRequest,
                payment.Payment.PaymentStatusResponse>(
                  this, METHODID_GET_PAYMENT_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * Payment service definition
   * </pre>
   */
  public static final class PaymentServiceStub extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a payment
     * </pre>
     */
    public void makePayment(payment.Payment.PaymentRequest request,
        io.grpc.stub.StreamObserver<payment.Payment.PaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMakePaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves payment status
     * </pre>
     */
    public void getPaymentStatus(payment.Payment.PaymentStatusRequest request,
        io.grpc.stub.StreamObserver<payment.Payment.PaymentStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaymentStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Payment service definition
   * </pre>
   */
  public static final class PaymentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a payment
     * </pre>
     */
    public payment.Payment.PaymentResponse makePayment(payment.Payment.PaymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakePaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves payment status
     * </pre>
     */
    public payment.Payment.PaymentStatusResponse getPaymentStatus(payment.Payment.PaymentStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaymentStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Payment service definition
   * </pre>
   */
  public static final class PaymentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a payment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payment.Payment.PaymentResponse> makePayment(
        payment.Payment.PaymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMakePaymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves payment status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payment.Payment.PaymentStatusResponse> getPaymentStatus(
        payment.Payment.PaymentStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaymentStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MAKE_PAYMENT = 0;
  private static final int METHODID_GET_PAYMENT_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MAKE_PAYMENT:
          serviceImpl.makePayment((payment.Payment.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<payment.Payment.PaymentResponse>) responseObserver);
          break;
        case METHODID_GET_PAYMENT_STATUS:
          serviceImpl.getPaymentStatus((payment.Payment.PaymentStatusRequest) request,
              (io.grpc.stub.StreamObserver<payment.Payment.PaymentStatusResponse>) responseObserver);
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

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return payment.Payment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getMakePaymentMethod())
              .addMethod(getGetPaymentStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
