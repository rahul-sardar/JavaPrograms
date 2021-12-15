package OnlineTest.OnlineTest;

public class RemoveExtraSpacesWithoutUtils {
	
	public static void main(String[] args) {
        String inputValue="  How are        you  man   ";
        String str = removeSpace(inputValue);
       System.out.println(str);
         
    }
    public static String removeSpace(String str){
       String st1 =str.trim();
       String result ="";
       for(int i=0;i<str.length();i++){
           char ch= str.charAt(i);
           if(ch!=' '){
               result = result+ch;
               if(str.charAt(i+1) == ' '){
                   result =result+' ';
               }
           }
       }
       return result;
    }

}
/**
 * Next, each character is check for space if found ignored it, and append 
 * to the result variable, then it checks for multiple spaces. If found 
   multiple spaces the add a single space.
 */
