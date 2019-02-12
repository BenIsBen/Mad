import java.util.Scanner;
public class Runner {
    private static String Story1 = "Dear ^ , You are extremely ^ and I ^ you! I want kiss your ^ ^ times. You make my ^ burn with desire. When I first saw you, I ^ stared at you and fell in love. Will you ^ out with me? Don`t let your parents discourage you, ^ are just jealous. Yours forever, ^";
    private static String[] oneparts = {"name","adjective","verb", "body part", "number" , "noun" , "adverb" , "verb" , "plural pronoun" ,"your name"};
    private static String Story2 = "Look, I guarantee there`ll be ^ times. I guarantee that at some ^ , ^ or both of us is gonna want to get out of this ^ . But I also guarantee that if I don`t ask you to be ^ , I`ll ^ it for the rest of my ^ , because I know, in my ^ , you`re the ^ one for me.";
    private static String Story3 = "My \"Dream Man\" should, first of all be very ^ and ^ . He should have a physique like ^ , a profile like ^ , and the intelligence of a/an ^ . He must be polite and must always remember to ^ my ^ , to tip his ^ and to take my ^ when crossing the street. He should move ^ , have a/an ^ voice, and should always dress ^ . I would also like him to be a/an ^ dancer, and when we are alone he should whisper ^ nothings into my ^ and hold my ^ ^ . I know a/an ^ is hard to find. In fact the only one I can think of is ^";
    private static String[] threeparts = {"adjective", "adjective", "celebrity", "celebrity", "animal", "verb", "noun", "noun", "body part", "adverb", "adjective", "adverb", "adjective", "adjective", "body part", "adjective", "noun", "noun", "name"};
    private static String[] twoparts = {"adjective", "noun", "number", "noun", "adjective", "verb", "noun", "body part", "adjective"};
    public static void main(String[] args){
        System.out.println("Welcome to Ben's Wacky World of Madlibs");
        System.out.println("Select story 1, 2, or 3 by typing in the corresponding number");
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()) {
            int which = input.nextInt();
            if(which <= 3 && which >= 1){
                System.out.println("You selected story number " + which);
                collectWords(which);
            }else{
                System.out.println("Please select a valid story");
            }
        } else {
            System.out.println("enter a number");
        }

    }
    private static void collectWords(int x){
        Filler fill = new Filler();
        switch(x){
            case 1:
                String[] arr = actuallyDoIt(oneparts);
                fill.fillSpace(Story1, arr);
                break;
            case 2:
                String[] arr2 = actuallyDoIt(twoparts);
                fill.fillSpace(Story2, arr2);
                break;
            case 3:
                String[] arr3 = actuallyDoIt(threeparts);
                fill.fillSpace(Story3, arr3);
                break;
        }
    }

    private static String[] actuallyDoIt(String[] x){
        String[] words = new String[x.length];
        for(int i = 0; i < x.length; i++){
            System.out.println("Enter a " + x[i]);
            Scanner input = new Scanner(System.in);
            if(input.hasNextLine()) {
                String newword = input.nextLine();
                words[i] = newword;
            }else{
                System.out.println("enter a word");
            }
        }
        return words;
    }
}
