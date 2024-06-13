package ex06array;

public class E02ArrayAndMethod {

    public static void main(String[] args) {

        // 배열을 선언과 동시에 초기화. 초기값의 갯수를 통해 배열의 크기 결정
        // 생성된 배열 인스턴스의 주소값을 int형 배열 변수에 할당

        int[] arr = { 1, 2, 3, 4, 5 };
        // 배열변수만 선언했고 아직은 참조하는 배열이 없음
        int[] ref;
        System.out.println("초기화 직후 출력");
        // 초기값 그대로인 1~5 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 1 2 3 4 5 출력
        }
        System.out.println();
        // 배열명을 출력하면 메모리의 주소값(참조값)이 문자열형태로 출력됨
        // 즉 배열명은 배열에 저장된 값 자체가 아닌 Heap영역에 생성된 메모리의 주소값을 저장하게 된다.
        System.out.println("arr변수 : " + arr);
        // arr은 참조값이고, 7은 기본자료형인 int이므로 값 자체가 전달됨
        ref = addAllArray(arr, 7);

        System.out.println("메소드 호출 후 출력");
        for (int i = 0; i < ref.length; i++) {
            System.out.print(ref[i] + " "); // 8 9 10 11 12 출력
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 8 9 10 11 12 출력
        }

    }

    // 매겨변수로 전달된 배열의 참조값을 ar로 받게 되므로 해당 메서드에서도
    // 동일한 배열을 참조하게 된다. 즉 main메서드에서 생성한 배열과 동일한 배열을 참조하게 된다.
    static int[] addAllArray(int[] ar, int addVal) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] += addVal;
        }
        return ar;
    }

}
