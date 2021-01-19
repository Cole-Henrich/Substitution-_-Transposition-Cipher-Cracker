import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 Clear input.txt

 *paste encrypted input into input.txt.

 *Then run main.

 See the System output, and copy the third array, the alphanumeric one,
 * and paste it into AlphanumComparator.main.values;
 * List<String> values = Arrays.asList(//paste it in the parentheses when you see this in AlphanumComparator);

 * Run AlphanumComparator.
 *
 * Copy the System output and paste it into Main.main.alphaNumSorted
 * Like this: String alphaNumSorted = "//here";
 *
 *The program will output:
 * ______(letters)
 * zqxjkvbpygfwmculdrhsnioate which are the alphabet ascending from the least common letter in English to most common.
 * The first row and second row match. That tells you that the first letter in the first row represents z, and so on.
 *
 *
 */

public class Main {
    public static ArrayList<String>charFreq = new ArrayList<>();
    static File output = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/output.txt");
   static ArrayList<String>alphaNum = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        /*
         * Counts the frequency of each character occurring in a NON-ENCODED text.
         * This is because some texts may not match the purported frequency ordering of
         * zqxjkvbpygfwmculdrhsnioate
         * It is also notable because it counts frequency of chars instead of solely letters.
         * This may be used to crack the EmojEncode.
         *          Has a user-input scanner to get the pathname of the file
         *          and make it generally easier on a user,
         *          so they don't have to enter the code itself to paste the filename.
         */
        p("""
                Please enter the pathname of the file that you want to be analyzed. 
                                
                This can be found by shift+command+c when you click on the file in Intellij.
                or "Right click on the file, hold down Alt/Option, and an item to copy file path will appear as Copy "<FILENAME>" as Pathname." - Attributed to Skeleton Bow on Stack Exchange
                                
                An example, using the Great Gatsby text, of what the pathname looks like, is this: 
                                
                /Users/cole.henrich/Desktop/Desktop/\\=\\-?/The Great Gatsby Text.txt
                               
                Enter pathname:
                """);


        Scanner ScAn = new Scanner(System.in);

        String pathname = ScAn.nextLine();
        if (pathname.equalsIgnoreCase("g")){
            pathname = "/Users/cole.henrich/Desktop/Desktop/\\=\\-?/The Great Gatsby Text.txt";
        }
        File text = new File(pathname);
        Scanner SCANNER = new Scanner(text);
        ArrayList<Character> unique = new ArrayList<>();
        while (SCANNER.hasNext()) {
            String string = SCANNER.next();
            for (int i = 0; i < string.length(); i++) {
                char character = string.charAt(i);
                if (!unique.contains(character)) {
                    unique.add(character);
                }
            }
        }
        p("unique:  " + unique);
        SCANNER.close();
        for (int i = 0; i < unique.size(); i++){
            charFreq.add("filler");
        }
        for (int i = 0; i < unique.size(); i++) {
            Scanner scanText = new Scanner(text);
            int charCount = 0;
            char uniqueChar = unique.get(i);
            while(scanText.hasNext()) {
                String string = scanText.next();
                for (int j = 0; j < string.length(); j++) {
                    char character = string.charAt(j);
                    if (uniqueChar == character) {
                        charCount +=1;
                    }
                }
            }
            String count_plus_char = charCount + "~" + uniqueChar;
            charFreq.set(i, count_plus_char);
        }
        p("charFreq:  " + charFreq);
        FileWriter fileWriter = new FileWriter("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/second.txt");
        char[] Alphabet = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        Collections.sort(charFreq, new AlphanumComparator());
        p("""
                
                
                
                Sorted:
                
                
                
                """
        );
        p(charFreq);
        for (int i = 0; i < charFreq.size(); i++) {
            String str = charFreq.get(i);
            str = str.replaceAll("^[^~]*~", "");
            charFreq.set(i, str);
        }
        String reverse = "zqxjkvbpygfwmculdrhsnioate";
        p("""
                
                
                removed everything before ~
                
                
                """);
        p(charFreq);
        StringBuilder alpha = new StringBuilder();
        for (String Ch : charFreq) {
            alpha.append(Ch);
        }

       p("alpha: "+ alpha);
        p("standard reverse: " + reverse);


        File source = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/input.txt");
        Scanner scanner = new Scanner(source);

        FileWriter fileWriter1 = new FileWriter(output);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                if (ch == ' ') {
                    ch = '_';
                }
                for (int j = 0; j < alpha.length(); j++) {
                    char a = alpha.charAt(j);
                    if (a == ch) {
                        ch = reverse.charAt(j);
                    }
                }
                fileWriter1.append(ch);
            }
        }
        fileWriter1.close();
    }
    public static void p(Object o) {
        System.out.println(o);
    }
    public static int pi(String s){
        return Integer.parseInt(s);
    }

    private static void Enhance() throws IOException {
        String[] Ngrams = {"_o_", "_I_","_oi_", "_of_", "_sor_", "for", "eww", "egg", "oder", "over", "_eou_", "_you_", "_sae_", "_say_", "_daes_", "_days_", "bt", "st", "_tto_", "_two_", "_lut_", "_but_", "_ce_", "_me_", "_dod_", "_did_", "_hos_", "_his_", "_iot_", "_all_", "wht", "ght", "ied_", "ned_", "_hot_", "_how_", "_tas_", "_was_", "_aid_", "_and_", "_lust_", "_just_", "lcost", "lmost", "curcur", "murmur","tocorrot", "tomorrow", "_wade_", "_made_", "_oder_", "_over_", "_loie_", "_love_", "_edwe_", "_edge_", "_tace_", "_face_", "_thai_", "_that_", "_cuth_", "_with_", "_torld_", "_world_", "_brode_", "_broke_", "_hode_", "_hope_", "_seise_", "_seize_"};
        File outEnhanced = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/outEnhanced.txt");
        FileWriter FILEWRITER  = new FileWriter(outEnhanced);
        Scanner SCANNER = new Scanner(output);
        while(SCANNER.hasNext()) {
            String S = SCANNER.next();
            for (int i = 0; i < Ngrams.length; i+=2) {
                String Ngram = Ngrams[i];
                String Fix = Ngrams[i+1];
                S = S.replace(Ngram, Fix);
            }
            FILEWRITER.append(S);
        }
    }
}