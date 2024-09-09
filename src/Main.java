//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        firstLoop(10);
        secondLoop(10);
        thirdLoop(10);
        }
    public static int firstLoop(int a){
        int i;
        for(i = 10;i >= 0; i--){
            System.out.println(i);

        }
        return i;
    }

    public static int secondLoop(int b){

        while(b >= 0){
            System.out.println(b);
            b--;
        }
        return b;

    }

    public static int thirdLoop(int c){
        do{
            System.out.println(c);
            c--;
        }
        while(c >= 0);
        return c;
    }
}
