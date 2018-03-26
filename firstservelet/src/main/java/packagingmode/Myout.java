package packagingmode;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

//这是字节流的写功能，，，因为printwriter里面可以进行流套接，所以不用另外写一个自己写
class Myout extends ServletOutputStream {
    ByteArrayOutputStream bout;
    public Myout(ByteArrayOutputStream bout) {
        this.bout=bout;
    }

    @Override
    public void write(int b) throws IOException {
        bout.write(b);//需要写到内存流里面去
    }

    @Override
    public boolean isReady() {
        return false;
    }

    @Override
    public void setWriteListener(WriteListener writeListener) {

    }
}
