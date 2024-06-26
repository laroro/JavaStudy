package ex20io;

import java.io.*;

/*
직렬화
: Circle 클래스를 입출력의 대상으로 파일로 저장하기 위해 Serializable 
인터페이스를 구현하여 정의한다. 인스턴스가 파일의 형태로 저장되는 것을
"직렬화"라고 한다. 만약 상속이 되는 경우라면 부모쪽만 implements하면 된다.
 */
class Circle implements Serializable {
    // 원의 좌표와 반지름을 표현한 멤버변수
    int xPos, yPos;
    double radian;

    // 생성자
    public Circle(int x, int y, double r) {
        xPos = x;
        yPos = y;
        radian = r;
    }

    // 원의 정보를 출력하기 위한 멤버메소드
    public void showCircleInfo() {
        System.out.printf("좌표[%d, %d]", xPos, yPos);
        System.out.println("반지름:" + radian);
    }
}

public class E11ObjectSerializable {

    public static void main(String[] args) {

        try {
            // 인스턴스를 파일로 저장하기 위해 출력스트림을 생성한다.
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("src/ex20io/Circle.obj"));

            // Circle 인스턴스를 생성한 후 파일에 저장한다.
            out.writeObject(new Circle(1, 1, 2.4));
            out.writeObject(new Circle(2, 2, 4.8));
            /*
             * Java에서 제공하는 기본클래스는 별도의 처리없이 직렬화 할 수 있다.
             */
            out.writeObject(new String("String타입의 오브젝트"));
            // 출력스트림 자원해제
            out.close();

            // 여기까지 실행하면 obj 파일이 생성됨 //

            /*
             * 인스턴스의 복원(역직렬화)을 위한 스트림을 생성하고 readObject()를 통해
             * 복원한다.
             */
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("src/ex20io/Circle.obj"));

            /*
             * 저장시 object 기반으로 저장되므로 복원시에는 원래의 자료형으로
             * 형변환(다운캐스팅) 해야한다
             */
            Circle c1 = (Circle) in.readObject();
            Circle c2 = (Circle) in.readObject();
            String message = (String) in.readObject();
            // 입력스트림 자원해제
            in.close();

            /*
             * 개발자가 직접 정의한 클래스는 멤버메서드를 통해 정보를 출력할 수
             * 있다. 혹은 toString()을 별도로 오버라이딩 해야한다.
             */
            c1.showCircleInfo();
            c2.showCircleInfo();
            /*
             * 기본크랠스는 이미 toString()이 오버라이딩 되어 있으므로
             * 즉시 출력할 수 있다.
             */
            System.out.println("String오브젝트: " + message);
        }

        catch (ClassNotFoundException e) {
            System.out.println("[예외]클래스 없음");
        }

        catch (FileNotFoundException e) {
            System.out.println("[예외]파일 없음");
        }

        catch (IOException e) {
            System.out.println("[Exception]뭔가 없음");
        }
    }

}
