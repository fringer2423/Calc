public class roman_to_arabic {
    public static int translate (String str){
        int result=0;
        boolean found=false;
        if (str.equals("I")){
            result = 1;
            found=true;
        }
        if (str.equals("II")){
            result = 2;
            found=true;
        }
        if (str.equals("III")){
            result = 3;
            found=true;
        }
        if (str.equals("IV")){
            result = 4;
            found=true;
        }
        if (str.equals("V")){
            result = 5;
            found=true;
        }
        if (str.equals("VI")){
            result = 6;
            found=true;
        }
        if (str.equals("VII")){
            result = 7;
            found=true;
        }
        if (str.equals("VIII")){
            result = 8;
            found=true;
        }
        if (str.equals("IX")){
            result = 9;
            found=true;
        }
        if (str.equals("X")){
            result = 10;
            found=true;
        }
        if(found == false){
            System.out.println("Некорректные вводные данные!");
            System.exit(0);
        }
        return result;
    }
}
