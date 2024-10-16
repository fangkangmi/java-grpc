.PHONY: clean compile

clean:
	mvn clean install

compile:
	mvn exec:java -Dexec.mainClass=com.payment.PaymentService

test:
	grpcurl -plaintext -d \
	'{ "userId": "user123", "amount": 100.0, "currency": "USD", \
	"paymentMethod": "credit_card", "description": \
	"Payment for order #1234", "recipientId": "recipient123" \
	}' \
	localhost:50051 payment.PaymentService/MakePayment

gradlew_build:
	./gradlew build

	
docker_build_grpc:
	docker build -t gcr.io/$(PROJECT_ID)/grpc-java-service:v1 -f Dockerfile .

docker_push_grpc:
	docker push gcr.io/$(PROJECT_ID)/grpc-java-service:v1

connect_to_vm:
	gcloud compute ssh java-grpc-service --zone=europe-west6-a