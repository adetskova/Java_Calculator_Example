public class Calc{

        static int a;
        static int b;
        static int result;

        static char sum = '+';
        static char minus = '-';
        static char multiple = '*';
        static char dev = '/';

        public static void main(String[] args) {
            doCalc(a, b, sum);
            System.out.println("1" + "2" + "=" + "3");
            doCalc(a, b, minus);
            System.out.println("2" + "1" + "=" + "1");
            doCalc(a, b, multiple);
            System.out.println("2" + "2" + "=" + "4");
            doCalc(a, b, dev);
            System.out.println("2" + "2" + "=" + "0");
        }

        public static void doCalc ( int a, int b, char sum){
            switch (result) {
                case '-' -> System.out.println(a - b + "=" + result);
                case '+' -> System.out.println(a + b + "=" + result);
                case '*' -> System.out.println(a * b + "=" + result);
                case '/' -> System.out.println(a / b + "=" + result);
                default -> System.out.println("syntax error");
            }

        }

    }
