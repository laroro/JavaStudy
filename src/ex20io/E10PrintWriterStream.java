package ex20io;

import java.io.*;

public class E10PrintWriterStream {

  public static void main(String[] args) throws IOException {
    // 입력스트림없이 출력스트림만 있는 클래스
    PrintWriter out = new PrintWriter(
        new FileWriter("src/ex20io/print.txt"));

    // 앞에서 txt파일쪽으로 생성한 스트림을 토앻 내용을 입력한다.
    out.printf("제 나이는 %d살 입니다.", 9);
    out.println("");

    out.println("저는 기타 치는 걸 좋아해요");
    out.print("노래부를 때 행복한 거 같아요");

    out.close();
    System.out.println("printf.txt가 생성되었습니다");
  }

}
