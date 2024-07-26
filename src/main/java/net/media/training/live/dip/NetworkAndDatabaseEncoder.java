package net.media.training.live.dip;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class NetworkAndDatabaseEncoder implements Encoder, Reader, Writer{
    private InputStream in;
    private InputStreamReader reader;
    private StringBuilder inputString1;
    private URL url;
    private String inputString;
    private String encodedString;
    private MyDatabase database;

    public NetworkAndDatabaseEncoder(){
        this.database = new MyDatabase();
    }

    public void read() throws FileNotFoundException {
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
            in = url.openStream();
            int c;
            c = reader.read();
            while (c != -1) {
                this.inputString1.append((char) c);
                c = reader.read();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void write() throws IOException {
        inputString = inputString1.toString();
        encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
    }

    public void encode() {
        database.write(encodedString);
    }
}
