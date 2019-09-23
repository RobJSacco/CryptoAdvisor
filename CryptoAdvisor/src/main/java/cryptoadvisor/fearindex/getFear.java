package cryptoadvisor.fearindex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class getFear {

  public static void GetFear() throws IOException {
    
    URL url;

    url = new URL("https://api.alternative.me/fng/");

    
    URLConnection con = url.openConnection();
    InputStream is = con.getInputStream();

    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    String line;

    // read each line and write to System.out

    while ((line = br.readLine()) != null) {
      //System.out.println(line);
      if (line.contains("\"value\"")) {
        String result = line.substring(13,15);
        System.out.println(Double.parseDouble(result));
      }
        
    }

  }
}