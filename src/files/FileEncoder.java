package files;

import java.io.*;

public class FileEncoder  {

    public FileEncoder() throws IOException {
        InputStream in = null;
        InputStream key = null;
        OutputStream out = null;
        byte inByte;
        byte keyByte;
        byte outByte;
        try {
            key = new FileInputStream(new File("C:\\Test\\key.log"));
//            in = new FileInputStream(new File("C:\\Test\\Brom_dll.log"));
//            out = new FileOutputStream(new File("C:\\Test\\out_encode.txt"));
            in = new FileInputStream(new File("C:\\Test\\out_encode.txt"));
            out = new FileOutputStream(new File("C:\\Test\\out_decode.txt"));

            byte[] inBuf = new byte[in.available()];
            byte[] keyBuf = new byte[key.available()];
            byte[] outBuf = new byte[in.available()];

            in.read(inBuf, 0, in.available());
            key.read(keyBuf, 0, key.available());
            int keyCicles = 0;
            int k;
            for (int i = 0; i < inBuf.length ; i++) {
                if (keyCicles == 0) {
                    k = i;
                } else {
                    k = i-(keyBuf.length * keyCicles);
                }
                if (k==keyBuf.length-1) {
                    keyCicles++;
                }
                outBuf[i] = (byte)(inBuf[i] ^ keyBuf[k]);
            }

            out.write(outBuf, 0, outBuf.length);
            in.close();
            key.close();
            out.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (out != null) out.close();
            if (in != null) in.close();
            if (key != null) key.close();
        }
    }

    public static void main(String[] args) throws IOException {
        new FileEncoder();
    }
}
