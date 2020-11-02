import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {


    /*scans each line for inputted word, if the word is detected, adds the line containing the word's
    index position to a Integer ArrayList and returns the ArrayList*/
    public static ArrayList<Integer> wordSearch(ArrayList<String> stringArray, String word){
        ArrayList<Integer> wordIndex = new ArrayList<>();
        for (int i = 0; i <= stringArray.size() - 1; i++){
            if(stringArray.get(i).contains(word)){
                wordIndex.add(i);
            }
        }
        return wordIndex;
    }

    public static void main(String[] args) throws IOException {
        //ArrayList containing each line of the txt file
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        br.close();

        //examples of code in work
        for(String s : lines){
            System.out.println(s);
        }
        System.out.println(wordSearch(lines, "devices"));

    }
}
