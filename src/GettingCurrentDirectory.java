public class GettingCurrentDirectory {
    public static void main (String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.dir") + "/test1/test2/");
    }
}