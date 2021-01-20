import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();



        input = preparation.prepare(input);


        //узнаем знак и сразу проверяем на наличие и количество

        byte act = Expression_definition.definition(input);



        //узнаем индекс знака

        int index_act = Expression_definition.index_act(input);



        //узнали индекс знака

        String b = input.substring(index_act + 1);
        String a = input.substring(0, index_act);


        //извлекли переменные
        a = a.toUpperCase();
        b = b.toUpperCase();



        byte type_values = expection.checking_values(a, b); //проверим вводные данные на корректность, заодно узнаем тип данных 1 - арабские 0 - римские



        int result=0;


        if (type_values == 1){
            int val_a=Integer.valueOf(a);
            int val_b=Integer.valueOf(b);
            result = calculations.calc(val_a,val_b,act);
            System.out.println(result);
        }

        if (type_values == 0){
            int val_a=roman_to_arabic.translate(a);
            int val_b=roman_to_arabic.translate(b);
            result = calculations.calc(val_a,val_b,act);
            System.out.println(arabic_to_roman.translate(result));
        }





    }
}
