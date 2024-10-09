package com.payment;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import io.grpc.stub.StreamObserver;
import payment.Payment.PaymentRequest;
import payment.Payment.PaymentResponse;
import payment.Payment.PaymentStatusRequest;
import payment.Payment.PaymentStatusResponse;
import payment.PaymentServiceGrpc;

import java.io.IOException;

public class PaymentService extends PaymentServiceGrpc.PaymentServiceImplBase {

    @Override
    public void makePayment(PaymentRequest request, StreamObserver<PaymentResponse> responseObserver) {
        // Implement your payment logic here
        PaymentResponse response = PaymentResponse.newBuilder()
                .setSuccess(true)
                .setTransactionId("123456")
                .setMessage("Payment successful")
                .setTimestamp("2023-10-01T12:00:00Z")
                .setFee(1.00)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getPaymentStatus(PaymentStatusRequest request, StreamObserver<PaymentStatusResponse> responseObserver) {
        // Implement your status retrieval logic here
        PaymentStatusResponse response = PaymentStatusResponse.newBuilder()
                .setTransactionId(request.getTransactionId())
                .setStatus("completed")
                .setMessage("Payment completed successfully")
                .setTimestamp("2023-10-01T12:00:00Z")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new PaymentService())
                .addService(ProtoReflectionService.newInstance()) // Enable reflection
                .build()
                .start();
        System.out.println("Server started, listening on " + server.getPort());
        server.awaitTermination();
    }
}