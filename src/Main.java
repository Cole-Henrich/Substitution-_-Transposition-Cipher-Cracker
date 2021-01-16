

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
    static File output = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/output.txt");
   static ArrayList<String>alphaNum = new ArrayList<>();
    public static void main(String[] args) throws IOException {
       p("""
               /**
               Clear input.txt
               
               *paste encrypted input into input.txt.
               
               *Then run main.
               
               See the System output, and copy the third array, the alphanumeric one,
               * and paste it into AlphanumComparator.main.values;
               * List<String> values = Arrays.asList(//paste it in the parentheses when you see this in AlphanumComparator);
               */
               """);

        FileWriter fileWriter = new FileWriter("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/second.txt");
        char[] Alphabet = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        int[] Counts = new int[Alphabet.length];
        File file = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/input.txt");
        Scanner s = new Scanner(file);
        while (s.hasNext()) {
            String str = s.next();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int count = 0;
                for (int j = 0; j < Alphabet.length; j++) {
                    char letter = Alphabet[j];
                    if (ch == letter) {
                        count++;
                        Counts[j] += count;
                    }
                }
            }
        }
        p(Arrays.toString(Alphabet));
        p(Arrays.toString(Counts));

        for (int i = 0; i < Alphabet.length; i++) {
            String alphanum = Counts[i] + "" + Alphabet[i];
            alphaNum.add("\"" + alphanum + "\"");
        }
        p(alphaNum);
        String alphaNumSorted = "91x 98d 169g 214m 1193p 1210s 1936r 1988e 2610b 2803w 2851k 3060h 3282j 3498o 3585y 5141l 6113v 7208n 7649a 7916q 8869i 9006f 9718t 10762c 11535z 15619u";
        String alpha = alphaNumSorted.replaceAll("[0-9]", "");
        alpha = alpha.replaceAll("\s", "");
        String reverse = "zqxjkvbpygfwmculdrhsnioate";
        p(alpha);
        p(reverse);
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