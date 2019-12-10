package day26;

import java.io.IOException;
import java.io.InputStream;

public class MyByteArrayInputStream extends InputStream {
    protected  byte data[];
    protected  int prt=0;

    // 标识从什么位置开始读
    protected int mark=0;



    public MyByteArrayInputStream(byte[] data) {
        this.data = data;
    }

    @Override
    public int read() throws IOException {
        return (prt<data.length)? (data[prt++]):-1;
    }

    @Override
    public int available() throws IOException {
        return data.length-prt;
    }

    @Override
    public void close() throws IOException {
        prt=data.length;
    }

    @Override
    public synchronized void mark(int readlimit) {
        this.mark=readlimit;
    }

    @Override
    public synchronized void reset() throws IOException {
        if(mark < 0 || mark > data.length ){
            throw new IOException("the position is not valid");
        }
    }

    @Override
    public boolean markSupported() {
        return true;
    }


    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[16];
        for (int i = 0; i <bytes.length ; i++) {
            bytes[i]=(byte) i;
        }

        MyByteArrayInputStream myByteArrayInputStream = new MyByteArrayInputStream(bytes);
        while (true){
            int c=myByteArrayInputStream.read();
            if (c < 0) {
                break;
            }
            System.out.println(c+" ");
        }
        System.out.println();
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        if (this.prt >= data.length || len < 0) {
            return -1;
        }
        if ((this.prt + len) > data.length) {
            len=data.length-this.prt;
        }
        if (len == 0) {
            return 0;
        }
        System.arraycopy(data,prt,b,off,len);
        prt+=len;

        return len;
    }
}
