package com.itmo.iostreams.serial.print;

import java.io.*;

public class Command implements Externalizable {
    private String cmd;

    public Command(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(cmd);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
