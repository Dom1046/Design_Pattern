package dpattern.IOstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    //생성자 만들면서 부모의 필드를 가져오네.
    //데코레이터 패턴이랑 같은 -> 부모와 같은 형태의 객체로 만들기 그리고 구성!!
    //부모의 필드 사용해서
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    //읽을 데이터가 없으면 -1을 반환함.
    //0~255의 바이트 데이터를 입력받는데, 0~255의 데이터는 ASCII코드로 변환이 가능함.
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    /**
     최대 len 바이트의 데이터를 입력 스트림에서 바이트 배열로 읽습니다. len 바이트를 최대한 읽으려고 시도하지만, 더 적은 바이트만 읽을 수도 있습니다. 실제로 읽은 바이트 수는 정수 값으로 반환됩니다.
     이 메서드는 입력 데이터가 사용 가능해질 때까지, 파일 끝(EOF)이 감지될 때까지 또는 예외가 발생할 때까지 블록됩니다.
     len이 0이면 아무것도 읽지 않고 0을 반환합니다. 그렇지 않으면 최소한 한 바이트를 읽으려고 시도합니다. 입력 스트림이 파일 끝(EOF)에 도달하여 읽을 바이트가 없는 경우 -1을 반환합니다. 그렇지 않으면 최소한 한 바이트를 읽고 이를 b에 저장합니다.

     첫 번째로 읽은 바이트는 b[off]에 저장되며, 그다음 바이트는 b[off+1]에 저장되는 식으로 진행됩니다. 실제로 읽은 바이트 수를 k라고 하면, 이 바이트들은 b[off]부터 b[off+k-1]까지 저장됩니다. b[off+k]부터 b[off+len-1]까지의 요소들은 영향을 받지 않습니다.
     어떤 경우에도 b[0]부터 b[off-1]까지의 요소와 b[off+len]부터 b[b.length-1]까지의 요소는 영향을 받지 않습니다.

     InputStream 클래스의 read(b, off, len) 메서드는 기본적으로 read() 메서드를 반복 호출하여 구현됩니다. 첫 번째 read() 호출에서 IOException이 발생하면 해당 예외가 그대로 반환됩니다. 이후의 read() 호출에서 IOException이 발생하면 예외가 발생한 시점을 파일 끝(EOF)으로 간주하고, 지금까지 읽은 바이트들을 b에 저장한 후 읽은 바이트 수를 반환합니다.
     기본 구현은 요청된 len 바이트를 모두 읽거나, 파일 끝(EOF)을 만나거나, 예외가 발생할 때까지 블로킹됩니다. 하위 클래스에서는 이 메서드를 보다 효율적으로 구현하는 것이 권장됩니다.

     매개변수:
     b – 데이터를 읽어 저장할 버퍼.
     off – b 배열에서 데이터를 저장할 시작 위치.
     len – 읽을 최대 바이트 수.

     반환값:
     buffer에 읽은 총 바이트 수, 또는 스트림 끝(EOF)으로 인해 더 이상 데이터가 없으면 -1.

     예외:
     IOException – 첫 번째 바이트를 EOF 이외의 이유로 읽을 수 없거나, 입력 스트림이 닫혔거나, 기타 입출력 오류가 발생한 경우.
     NullPointerException – b가 null인 경우.
     IndexOutOfBoundsException – off가 음수이거나, len이 음수이거나, len이 b.length - off보다 큰 경우.

     참고:
     read()
     --핵심 : 입력을 받고 있는 동안은 블락킹 된다는 것이다. -> 어플리케이션이 일을 모두 처리하기 전까지 멈춘다는 뜻!
     */
    public int read(byte[] b, int offset, int len) throws IOException{
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
