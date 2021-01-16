

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * paste encrypted input into input.txt.
 *
 * Then run main.
 *
 * See the System output, and copy the third array, the alphanumeric one,
 * and paste it into AlphanumComparator.main.values;
 * List<String> values = Arrays.asList(//paste it in the parentheses when you see this in AlphanumComparator);
 *
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
   static ArrayList<String>alphaNum = new ArrayList<>();
    public static void main(String[] args) throws IOException {
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
        String alphaNumSorted = "91t 98d 169z 214b 1193w 1210c 1936o 1988j 2610q 2803r 2851v 3060u 3282f 3498h 3585l 5141p 6113k 7208i 7649s 7916y 8869a 9006x 9718n 10762e 11535m 15619g";
        String alpha = alphaNumSorted.replaceAll("[0-9]", "");
        alpha = alpha.replaceAll("\s", "");
        String reverse = "zqxjkvbpygfwmculdrhsnioate";
        p(alpha);
        p(reverse);
        File source = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/input.txt");
        Scanner scanner = new Scanner(source);
        File output = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/output.txt");
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

//        Arrays.sort(Counts);




       // recurr(Alphabet);



//    char[] k0 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//    char[] k1 = {'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a'};
//    char[] k2 = {'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b'};
//    char[] k3 = {'d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c'};
//    char[] k4 = {'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d'};
//    char[] k5 = {'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e'};
//    char[] k6 = {'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f'};
//    char[] k7 = {'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g'};
//    char[] k8 = {'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h'};
//    char[] k9 = {'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i'};
//    char[] k10 = {'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j'};
//    char[] k11 = {'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k'};
//    char[] k12 = {'m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l'};
//    char[] k13 = {'n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m'};
//    char[] k14 = {'o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n'};
//    char[] k15 = {'p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'};
//    char[] k16 = {'q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
//    char[] k17 = {'r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q'};
//    char[] k18 = {'s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r'};
//    char[] k19 = {'t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s'};
//    char[] k20 = {'u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t'};
//    char[] k21 = {'v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'};
//    char[] k22 = {'w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v'};
//    char[] k23 = {'x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w'};
//    char[] k24 = {'y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x'};
//    char[] k25 = {'z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y'};
//    char[][]all = {
//            k0,k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12,k13,k14,k15,k16,k17,k18,k19,k20,k21,k22,k23,k24,k25
//    };
//        for (char[] k : all) {
//            System.out.println(Arrays.toString(k));
//        }
    // static int stack = 0;
//    private static void recurr(char[] alphabet) {
//        while (stack < 26) {
//            ai(alphabet);
//
//            int i = 0;
//            char start = alphabet[0];//var preservation
//            while (i < alphabet.length) {
//                if (i == 25) {
//                    alphabet[25] = start;
//
//                } else if (i < 25) {
//                    alphabet[i] = alphabet[i + 1];
//                }
//                i++;
//            }
//            stack++;
//            recurr(alphabet);
//        }
//    }

    public static void p(Object o) {
        System.out.println(o);
    }
    public static int pi(String s){
        return Integer.parseInt(s);
    }
}