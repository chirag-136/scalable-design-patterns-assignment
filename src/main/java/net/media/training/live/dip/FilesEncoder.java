package net.media.training.live.dip;

import java.io.*;
import java.util.Base64;

public class FilesEncoder implements Encoder, Reader, Writer{
    private BufferedReader reader;
    private BufferedWriter writer;

    private String encodedLine;

    public void read() throws FileNotFoundException {
        reader = new BufferedReader(new FileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt"));
    }

    public void write() throws IOException {
        writer = new BufferedWriter(new FileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt"));
    }

    public void encode() {
        try {
            this.read();
            this.write();
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.write(encodedLine);
            }
            writer.flush();
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
