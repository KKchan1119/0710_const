import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("학생수 : ");
        int arrlen = in.nextInt();
        int count = 0;
        boolean act = true;
        String cmd;
        String[] studentName = new String[arrlen];
//        int[] studentNumber = new int[arrlen];
//        int[] score = new int[arrlen];
        for(int i = 0; i <= arrlen; i++) {
            cmd = in.next();
            switch (cmd) {
                case "i":
                    System.out.print("학생을 등록합니다.: ");
                    studentName[arrlen] = in.nextLine();
                    break;

            }
        }
        for(int i =0; i < studentName.length; i++) {
            System.out.print(studentName[i]);
        }




    }
}

