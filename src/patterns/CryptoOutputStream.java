package patterns;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class CryptoOutputStream extends FilterOutputStream {
    public CryptoOutputStream(OutputStream out) {
        super(out);
    }
}
