
public class Expression_definition {
    public static byte definition(String str) {
        byte act = 0;
        int col_act = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                act = 1;
                col_act++;
            }
            if (str.charAt(i) == '-') {
                act = 2;
                col_act++;
            }
            if (str.charAt(i) == '*') {
                act = 3;
                col_act++;
            }
            if (str.charAt(i) == '/') {
                act = 4;
                col_act++;
            }

        }
        expection.expetc_act(col_act);
        return act;
    }
    public static int index_act(String str){
        int index=0;
        for (int i=0;i<str.length();i++){
            if ((str.charAt(i)=='+')||(str.charAt(i)=='-')||(str.charAt(i)=='*')||(str.charAt(i)=='/')){
                index = i;
            }
        }
        return index;
    }
}
