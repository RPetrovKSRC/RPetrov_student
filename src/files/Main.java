package files;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Streams streams = new Streams();
        streams.copy("C:/Test/Brom_dll.log", "c:/Test/Out.txt");
        streams.split( "c:/Test/Out.txt", 12000);
        streams.merge("c:/Test/Out1.txt");
    }
}
