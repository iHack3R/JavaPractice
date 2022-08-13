public class PlayingWithJavaNew {
    int number = 5;
    static int number5 = 10;
    public static void main (String[] args) {
        int number2 = 10;
        PlayingWithJava name = new PlayingWithJava();
        name.method1();
        System.out.println(number2);
        PlayingWithJavaNew name3 = new PlayingWithJavaNew();
        System.out.println(name3.number);
        System.out.println(number5);
        System.out.println(PlayingWithJavaNew.number5);
    }
}