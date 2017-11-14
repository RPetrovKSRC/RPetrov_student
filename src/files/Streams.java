package files;

import java.io.*;

public class Streams {
    public Streams() {
    }

    public void copy(String inFilePath, String outFilePath) throws IOException {
        try (InputStream in = new FileInputStream(new File(inFilePath));
             OutputStream out = new FileOutputStream(new File(outFilePath))) {
            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
        }
    }

    public void split(String inFilePath, Integer splitSize) throws IOException {
        OutputStream out = null;
        InputStream in = null;
        String outFilePath;
        String outFileExtension;
        int outFileSize;
        int bufferSize = 1024;

        try {
            byte[] buf = new byte[bufferSize];
            int len;
            in = new FileInputStream(new File(inFilePath));
            outFilePath = inFilePath.substring(0, inFilePath.indexOf("."));
            outFileExtension = inFilePath.substring(inFilePath.indexOf("."));

            for (int i = 1; i < 100; i++) {
                outFileSize = 0;
                out = new FileOutputStream(new File(outFilePath + i + outFileExtension));
                do {
                    len = in.read(buf);
                    if (len < 0) {
                        return;
                    }
                    out.write(buf, 0, len);
                    outFileSize = outFileSize + len;
                    if (outFileSize >= splitSize) {
                        out.close();
                        break;
                    }

                } while (len > 0);
            }

        } catch (IOException e) {
            throw e;
        } finally {
            out.close();
            if (in != null) {
                in.close();
            }
        }

    }

    public void merge(String firstFilePath) throws IOException {
        OutputStream out = null;
        InputStream in = null;
        String outFilePath;
        String outFileExtension;
        int bufferSize = 1024;

        try {
            byte[] buf = new byte[bufferSize];
            int len;
            outFilePath = firstFilePath.substring(0, firstFilePath.indexOf(".") - 1);
            outFileExtension = firstFilePath.substring(firstFilePath.indexOf("."));

            out = new FileOutputStream(new File(outFilePath + "Merge" + outFileExtension));
            for (int i = 1; i < 100; i++) {
                in = new FileInputStream(new File(outFilePath + i + outFileExtension));
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
            }
        } catch (FileNotFoundException e) {
            return;
        } catch (IOException e) {
            throw e;
        } finally {
            out.close();
            if (in != null) {
                in.close();
            }
        }
    }
}
