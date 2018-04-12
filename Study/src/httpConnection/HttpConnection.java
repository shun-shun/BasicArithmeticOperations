package httpConnection;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class HttpConnection {

	public static void main(String[] args) {
		HttpConnection connection = new HttpConnection();
		try {
			String output = connection.getHttpUrlConnection();
			System.out.println(output);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String getHttpUrlConnection() throws IOException {
		String xml = null;
		HttpURLConnection conn = null;
		try {
			URL url = new URL("http://kakunin.net/");
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.11.3", 12345));
			conn = (HttpURLConnection) url.openConnection(proxy);
			conn.setDoInput(true);
			conn.connect();

			if (conn.getResponseCode() == 200) {
				InputStream is = conn.getInputStream();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] bytes = new byte[256];
				int len = 0;
				while ((len = is.read(bytes, 0, 256)) != -1) {
					baos.write(bytes, 0, len);
				}
				xml = new String(baos.toByteArray(), "UTF-8");
			}
		} finally {
			if (conn != null)
				conn.disconnect();
		}
		return xml;
	}
}
