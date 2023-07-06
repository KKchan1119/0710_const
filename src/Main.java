import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Stack<String> front = new Stack<>();
        Stack<String> NOW = new Stack<>();
        Stack<String> back = new Stack<>();
        Scanner in = new Scanner(System.in);
        String cmd;
        NOW.push("http://www.acm.org/");
        while(true) {
            cmd = in.nextLine();

            if(cmd.contains("VISIT ")) {
                cmd = cmd.replaceAll("VISIT ", "");

                back.push(NOW.peek());
                NOW.pop();
                NOW.push(cmd);
                System.out.println(NOW.peek());
                front.clear();
                continue;
            }

            if(cmd.equals("BACK")) {
                if(back.empty()) {
                    System.out.println("Ignored");
                    continue;
                }
                front.push(NOW.peek());
                NOW.pop();
                NOW.push(back.peek());
                System.out.println(back.peek());
                back.pop();
            }

            if(cmd.equals("FORWARD")) {
                if(front.empty()) {
                    System.out.println("Ignored");
                    continue;
                }
                back.push(NOW.peek());
                NOW.pop();
                NOW.push(front.peek());
                System.out.println(NOW.peek());
                front.pop();
            }

            if(cmd.equals("QUIT")){break;}
        }

    }

}