package oefening1;

import java.util.*;

public class WordSearch {
    private int resultCount;
    private HashSet<String> result = new HashSet<>();
    private ArrayList<String> vowels =
            new ArrayList<>(Arrays.asList("A", "E", "I", "O", "U", "Y"));
    private ArrayList<String> consonants =
            new ArrayList<>(Arrays.asList("B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "W", "Z"));
    private HashMap<String, Integer> list = new HashMap<>();

    public WordSearch() {
        loadVowels();
        loadConsonants();
    }

    private void loadVowels() {
        list.put(vowels.get(0), 2);
        list.put(vowels.get(1), 3);
        list.put(vowels.get(2), 1);
        list.put(vowels.get(3), 1);
        list.put(vowels.get(4), 1);
        list.put(vowels.get(5), 1);
    }

    private void loadConsonants() {
        Random r = new Random();
        for (int i=0; i<25; i++) {
            int index = r.nextInt(consonants.size());
            list.put(consonants.get(index), list.getOrDefault(consonants.get(index), 0) + 1);
        }
    }

    public void showConsonantsInList() {
        System.out.println(" Overview consonants in list");
        for (String x : list.keySet()) {
           if(list.containsKey(x)) {
               list.replace(x, list.get(x) + 1);
           }else{
               list.replace(x, list.get(x));
        }
           System.out.println(x + list.get(x) + "\n");
    }
}
    public void showConsonantsNotInList() {
        System.out.println(" Overview consonants NOT in list");
        for(String y : list.keySet()){
            if(!list.containsKey(consonants)){
                System.out.println(" The letter " + y + "\n" + "doesn't occur");
            }
        }
    }

    public void characterMinimalOccurence(int count) {
        System.out.println("Overview characters in list with a given MINIMAL occurence ");
        System.out.println(" These characters occur MINIMAL 2 times \n");
        for(String z : list.keySet()) {
            if (list.containsKey(z)) {
                list.replace(z, list.get(z) + 1);
            } else {
                list.replace(z, list.get(z));
            }

            if (list.get(z) > 1 && list.get(z) < 3) {
                System.out.println("These characters occur MINIMAL 2 times");
                System.out.println(z);
            }
            if (list.get(z) > 2 && list.get(z) < 4) {
                System.out.println("These characters occur MINIMAL 3 times ");
            }
        }
    }

    private void printResult(){

    }

    public char[] ConvertTOLetters(String word){
//        Use this method to split the word please!
        return word.toCharArray();
    }

    public void checkWord(String word) {
//       Use convertTOLetters method to split the word into a list.
        char[] letters = ConvertTOLetters(word);

        for(String z : list.keySet())
            if(list.containsKey(letters)){
              System.out.println(z + "is possible");
        }
    }


    public void showList() {
        System.out.println(list);
    }



}
