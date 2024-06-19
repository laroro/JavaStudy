package quiz;

public class QuUpgradeGuGu {

    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            for (int su = 1; su <= 9; su++) {
                int result = (int) Math.pow(dan, su);
                for (int i = 1; i <= su; i++) {
                    if (i == su) {
                        if (su == 1) {
                            System.out.print(dan + " X " + i + " = " + dan);
                        } else {
                            System.out.print(dan + " = " + result);
                        }
                    } else {
                        System.out.print(dan + " X ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("====================================");
            System.out.println();
        }
    }

}