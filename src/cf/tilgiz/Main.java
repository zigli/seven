package cf.tilgiz;

public class Main {

    static int sum (int a, int b){
        return a + b;
    }
    static int sum (int a, int b,int c){
        return a + b + c;
    }
    static float sum (float a, float b, float c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(23,12));
        System.out.println(sum(23,12, 15));
        System.out.println(sum(23.4f,12.3f, 33.2f));
    }
}
