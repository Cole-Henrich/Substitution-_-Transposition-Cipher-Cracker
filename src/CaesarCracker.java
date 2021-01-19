import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CaesarCracker {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        File Ngraphs = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/Ngraphs.txt");
        Scanner sg= new Scanner(Ngraphs);
        int Nlength = 0;
        while (sg.hasNext()) {
            String string = sg.next();
            if (string != null) {
                Nlength++;
            }
        }
        p("Number of common Ngraphs in Ngraphs.txt: "+Nlength);
        int len = 0;
        StringBuilder graphs = new StringBuilder();
        Scanner scanGraphs= new Scanner(Ngraphs);
        while (scanGraphs.hasNext()) {
            String thisGraph = scanGraphs.next();
            if (thisGraph != null) {
                len++;
            }
            StringBuilder graph = new StringBuilder("\"" + thisGraph + "\"");
            if (len < Nlength) {
                graph.append(",");
            }
            graphs.append(graph);
        }
        p("ArrayList<String>checkSolved = new ArrayList<>(Arrays.asList(" + graphs + "));");
        ArrayList<String>checkSolved = new ArrayList<>(Arrays.asList("of","to","in","it","is","be","as","at","so","we","he","by","or","on","do","if","me","my","up","an","go","no","us","am","the","and","for","are","but","not","you","all","any","can","had","her","was","one","our","out","day","get","has","him","his","how","man","new","now","old","see","two","way","who","boy","did","its","let","put","say","she","too","use","that","with","have","this","will","your","from","they","know","want","been","good","much","some","time"));
        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList(
                "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'"
        ));
        recurr(alphabet);
        p("char[][] all = {" + sb + "};");
        char[] Alphabet0 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] Alphabet1 = {'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a'};
        char[] Alphabet2 = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b'};
        char[] Alphabet3 = {'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c'};
        char[] Alphabet4 = {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd'};
        char[] Alphabet5 = {'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e'};
        char[] Alphabet6 = {'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] Alphabet7 = {'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] Alphabet8 = {'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] Alphabet9 = {'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        char[] Alphabet10 = {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] Alphabet11 = {'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        char[] Alphabet12 = {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'};
        char[] Alphabet13 = {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        char[] Alphabet14 = {'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'};
        char[] Alphabet15 = {'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};
        char[] Alphabet16 = {'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};
        char[] Alphabet17 = {'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q'};
        char[] Alphabet18 = {'s', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r'};
        char[] Alphabet19 = {'t', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's'};
        char[] Alphabet20 = {'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'};
        char[] Alphabet21 = {'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
        char[] Alphabet22 = {'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char[] Alphabet23 = {'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w'};
        char[] Alphabet24 = {'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x'};
        char[] Alphabet25 = {'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'};
        char[][] all = {
                Alphabet0,Alphabet1,Alphabet2,Alphabet3,Alphabet4,Alphabet5,Alphabet6,
                Alphabet7,Alphabet8,Alphabet9,Alphabet10,Alphabet11,Alphabet12, Alphabet13,
                Alphabet14,Alphabet15,Alphabet16,Alphabet17,Alphabet18,Alphabet19,
                Alphabet20,Alphabet21,Alphabet22,Alphabet23,Alphabet24,Alphabet25
        };
        File caesar = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/input-caesar.txt");
        File cracked = new File ("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/cracked.txt");
        for (char[] ab : all) {
            int solved01 = 0;
            File guess = new File("/Users/cole.henrich/IdeaProjects/BasicSubCipherCracker/src/guess.txt");
            FileWriter fileWriter = new FileWriter(guess);
            Scanner scanner = new Scanner(caesar);
            int lencount = 0;
            while (scanner.hasNext()) {
                String string = scanner.next();
                StringBuilder rtn = new StringBuilder();
                if (string != null) {lencount++;}
                for (int j = 0; j < string.length(); j++) {
                    char Char = string.charAt(j);
                    for (int k = 0; k < Alphabet0.length; k++) {
                        char letter = Alphabet0[k];
                        if (Char == letter) {
                            Char = ab[k];
                            rtn.append(Char);
                        }
                    }
                }
                for (String check : checkSolved) {
                    if (rtn.toString().equalsIgnoreCase(check)) {
                        solved01++;
                    }
                }
                p(rtn);
            }
            p("length of guess: "+ lencount);
                if (solved01 > lencount / 5) {
                    p("solved with " + solved01 + " attesting Ngraphs");
                }
        }
    }


    static int stack = 0;

    /**
     * recurses 26 times in order to generate alphabets shifted up by 1, then 2, then 3, etc.
     * This means the alphabet is
     * a,b,c...x,y,z
     * b,c,d...y,z,a
     * c,d,e...z,a,b
     *
     * etc.
     * It prints them out to be pasted into code as stationary arrays.
     * Lastly it prints out a char[][] of all of them just because it's tedious to do by hand.
     *
     * @param Alphabet the alphabet to be recursively shifted
     * (presumably a-z, but having it as a parameter makes the recursing easier).
     *                 yes, recurse seems more apt in description than recur.
     */
    private static void recurr(ArrayList<String> Alphabet){
        while (stack < Alphabet.size()) {
            String printable_0 = (stack + " = {" + Alphabet + "};");
            String printable = "char[] Alphabet" + printable_0.replaceAll("[\\[\\]]", "");
            p(printable);
            sb.append("Alphabet").append(stack);
            if (stack < 25){
                sb.append(",");
            }
            String start = Alphabet.get(0);
            for (int i = 0; i < Alphabet.size(); i++) {
                if (i == 25) {
                   Alphabet.set(25, start);
                }
                else {
                    Alphabet.set(i, Alphabet.get(i + 1));
                }
            }
            stack++;
            recurr(Alphabet);
        }
    }
    public static void p(Object object_to_print){
        System.out.println(object_to_print);
    }
}
