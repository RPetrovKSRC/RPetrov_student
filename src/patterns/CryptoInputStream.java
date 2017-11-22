package patterns;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class CryptoInputStream extends FilterInputStream{
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected CryptoInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b) throws IOException {
        return super.read(b);
    }

    //    ObjectInputStream objIn = new ObjectInputStream(new CryptoInputStream(byte[] password,(socket.getInputStream())))
}
