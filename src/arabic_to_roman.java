public class arabic_to_roman {
    public static String translate(int value){
        String result="";
        int c=0;
        int d1;
        int d2;
        if (value == 100) {
            result = "C";
            value =0;
        }
        if ((value / 50) ==1) {
            value -=50;
            if ((value/10) == 4){
                result = "XC";
            } else {
                result = "L";
                for (int i=0; i<(value/10);i++){
                    result+='X';
                }
            }
        } else {
            for (int i=0; i<(value/10);i++) {
                result += 'X';
            }
        }
        value = value % 10;

        if (value == 10)
            result +='X';
        if (value == 9)
            result+="IX";
        if (value == 8)
            result+="VIII";
        if (value == 7)
            result+="VII";
        if (value == 6)
            result+="VI";
        if (value == 5)
            result+="V";
        if (value == 4)
            result+="IV";
        if (value == 3)
            result+="III";
        if (value == 2)
            result+="II";
        if (value == 1)
            result+="I";
        return result;
    }
}
