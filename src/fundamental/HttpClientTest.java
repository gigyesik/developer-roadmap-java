package fundamental;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class HttpClientTest {
    public static void main(String[] args) {
        // 클라이언트 객체 생성
        var client = HttpClient.newHttpClient();

        // 요청 생성
        var request = HttpRequest.newBuilder(
                        URI.create("http://localhost:8080"))
                .header("accept", "application/json")
                .build();

        // 요청 전송 (JsonBodyHandler 의존성 필요)
//        var response = client.send(request, new JsonBodyHandler<>(APOD.class));

        // 응답 확인
//        System.out.println(response.body().get().title);
    }
}
