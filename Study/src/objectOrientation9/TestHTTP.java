package objectOrientation9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;

public class TestHTTP {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://imgon.spimg.ch/v1/8161/282.jpg?h=qnZJl6bfmWPL1RvCLQy09g&t=1080001513007731");
			HttpURLConnection connection;
			connection = (HttpURLConnection)url.openConnection();
			connection.setReadTimeout(1000);
			connection.setConnectTimeout(5000);
			connection.setRequestMethod("GET");
			connection.setRequestProperty("http.agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.167 Safari/537.36 表示サイズ： 1920 x 987pix");
			connection.connect();

			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK ) {
				try(InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream()); OutputStream outputStream = new FileOutputStream("manga.jpg")){
					int c;
					while ((c = inputStreamReader.read()) != -1) {
						outputStream.write(c);
					}
				}
			} else System.out.println(connection.getResponseCode());
		} catch (SocketTimeoutException e) {
			e.printStackTrace();
			System.out.println("コネクションアウトおよび、読み取りタイムアウトです");
		} catch (MalformedURLException e) {
			System.out.println("URLが不正です");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("入出力エラーです");
			e.printStackTrace();
		}

	}

}
