package Moeuddin;

public class MoeUddintest {
    public static String isPalindrome(String input)
    {
        String output1="";

        int x=0;
        while(input.length() >= x )
        {
            String s2=input.substring(input.length()-1,input.length());
            String s1=input.substring(x,x+1);
            if(s1.equals(s2))

            {
                output1=output1+s2;

            }
            else
            {


                break;
            }

        }
        return output1;
    }
}
