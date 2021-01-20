
public class expection {
    public static void expetc_act(int col) {
        if ((col > 1) || (col == 0)) {
            System.out.println("Знак выражения не найден либо их более одного. Ошибка ввода!");
            System.exit(0);
        }
    }

    public static byte checking_values(String a, String b){
        byte type_a = 0;
        if ((a.charAt(0)>='0')&&(a.charAt(0)<='9')){
            type_a = 1;
            if (a.length()>1) {
                if (a.charAt(1)!='0') {
                    System.out.println("Некорректные вводные данные!");
                    System.exit(0);
                }
            }
        }
        if (type_a == 0){
            for (int i=0; i<a.length();i++){
                if ((a.charAt(i)!=('X'))&&(a.charAt(i)!=('V'))&&(a.charAt(i)!=('I'))){
                    System.out.println("Некорректные вводные данные!");
                    System.exit(0);
                }
            }
        }

        byte type_b = 0;
        if ((b.charAt(0)>='0')&&(b.charAt(0)<='9')){
            type_b = 1;
            if (b.length()>1) {
                if (b.charAt(1)!='0') {
                    System.out.println("Некорректные вводные данные!");
                    System.exit(0);
                }
            }
        }
        if (type_b == 0){
            for (int i=0; i<b.length();i++){
                if ((b.charAt(i)!=('X'))&&(b.charAt(i)!=('V'))&&(b.charAt(i)!=('I'))){
                    System.out.println("Некорректные вводные данные!");
                    System.exit(0);
                }
            }
        }
        if (type_a!=type_b) {
            System.out.println("Некорректные вводные данные!");
            System.exit(0);
        }
        if (type_a == 0){
            if ((a.charAt(0)=='X')&&(a.length()>1)){
                System.out.println("Некорректные вводные данные!");
                System.exit(0);
            }
            if (a.length()>4){
                System.out.println("Некорректные вводные данные!");
                System.exit(0);
            }

        }

        if (type_b == 0){
            if ((b.charAt(0)=='X')&&(b.length()>1)){
                System.out.println("Некорректные вводные данные!");
                System.exit(0);
            }
            if (b.length()>4){
                System.out.println("Некорректные вводные данные!");
                System.exit(0);
            }

        }

        return type_a;
    }

}
