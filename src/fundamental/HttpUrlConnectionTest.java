package fundamental;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnectionTest {
    public static void main(String[] args) throws IOException {
        // 요청 경로
        URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");

        // 연결
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // 헤더, 요청 방식 설정
        connection.setRequestProperty("accept", "application/json");

        // 요청 생성
        InputStream responseStream = connection.getInputStream();

        // Json 변환 (ObjectMapper 의존성 필요)
//        ObjectMapper mapper = new ObjectMapper();
//        APOD apod = mapper.readValue(responseStream, APOD.class);

        // 응답 얻기
//        System.out.println(apod.title);
    }
}
