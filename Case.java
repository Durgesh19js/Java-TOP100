public class Case{
    public static void main(String[] args) {
        String input="DURgesh";
        String output = swapcase(input);
        System.out.println(output);

       
    }
    public static String swapcase(String str){
        String result ="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>'A' && c<'Z'){
                result+=(char)(c+32);
            
            }
            else if(c>'a' && c<'z'){
                result+=(char)(c-32);

            }else{
                result+=c;
            }
        }
        return result;

    }



    // //using String builder
    // public static String swapcase(String str) {
    //     StringBuilder result = new StringBuilder();
        
    //     for (char c : str.toCharArray()) {
    //         result.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
    //     }
        
    //     return result.toString();
    // }
}