public class calculations {
    public static int calc(int a, int b, byte type_act){
        int result=0;

        if (type_act == 1)
            result = a+b;
        if (type_act == 2)
            result = a-b;
        if (type_act == 3)
            result = a*b;
        if (type_act == 4)
            result = a/b;

        return result;


    }
}
