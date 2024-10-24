public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("output: "+isPalindrome("ab"));
    }
    public  static boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]","");
        String lowerCase = s.toLowerCase();
        boolean result = false;

        int j=lowerCase.length()-1;
        if(lowerCase.isEmpty()){
            return true;
        }

        for(int i=0;i<lowerCase.length();i++){
            System.out.println(lowerCase.charAt(i));
            if(lowerCase.charAt(i)!=lowerCase.charAt(j)){
                System.out.println("i: "+ i + lowerCase.charAt(i));
                System.out.println("j: "+j  +lowerCase.charAt(j));
               return false;

            }
            j--;

            System.out.println(result);
        }
        return true;
    }
}