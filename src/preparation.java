
public class preparation {
   public static String prepare(String str){
      String temp="";
      for (int i=0; i<str.length();i++){
         if (str.charAt(i) != ' ') {
            temp+=str.charAt(i);
         }
      }
      return temp;
   }
}
