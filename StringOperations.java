//Elijah Koch
//AP Comp Sci A
//8-25-25

public class StringOperations{
    public static void main(String args[]){

        /*
        Code Challenge 1
        Scrambles words, switching the first and last letters.
        */

        String word = "Popcorn";
        int len = (word).length();
        String firstLetter = (word).substring(0,1);
        String wordMiddle = (word).substring(1,len-1);
        String lastLetter = (word).substring(len-1,len);
        String result = (lastLetter+wordMiddle+firstLetter).toLowerCase();
        System.out.println(result);

        word = "Picture";
        len = (word).length();
        firstLetter = (word).substring(0,1);
        wordMiddle = (word).substring(1,len-1);
        lastLetter = (word).substring(len-1,len);
        result = (lastLetter+wordMiddle+firstLetter).toLowerCase();
        System.out.println(result);

        word = "Computer";
        len = (word).length();
        firstLetter = (word).substring(0,1);
        wordMiddle = (word).substring(1,len-1);
        lastLetter = (word).substring(len-1,len);
        result = (lastLetter+wordMiddle+firstLetter).toLowerCase();
        System.out.println(result);


        /*
        Code Challenge 2
        Makes ascii art of very long dog
        */
        System.out.println("                                  .-.\n     (___________________________()6 `-,\n     (   ______________________   /''\"`\n     //\\\\                      //\\\\\njgs  \"\" \"\"                     \"\" \"\"");




    }
}