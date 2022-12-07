
public class Main {

    public static void main(String[] args) {
        int a = 1234;
        String jaja=IntString(a);
        System.out.println(jaja);
    }

    public static String IntString(int a) {
        if (a > 0) {
            int b = a % 10;
            int c = a/10;
            switch (b) {
                case 1 -> {
                    return "1"+IntString(c);
                }
                 case 2 -> {
                     return "2"+IntString(c);
                }
                     case 3 -> {
                         return "3"+IntString(c);
                }
                     case 4 -> {
                         return "4"+IntString(c);
                }
                     case 5 -> {
                         return "5"+IntString(c);
                }
                     case 6 -> {
                         return "6"+IntString(c);
                }
                     case 7 -> {
                         return "7"+IntString(c);
                }
                     case 8 -> {
                         return "8"+IntString(c);
                }
                     case 9 -> {
                         return "9"+IntString(c);
                }
                     case 0 -> {
                         return "0"+IntString(c);
                }
                default -> throw new AssertionError();
            }
        }
        return" ";
    }

}
