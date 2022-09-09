package src.src.level2.lesson3;

import java.util.*;
import java.util.concurrent.Callable;

public class Task_3_Part_1 {
    public static void main(String[] args) {

        Task_3_Part_1 task_3_part_1 = new Task_3_Part_1();


        System.out.println(task_3_part_1.words);
        System.out.println("unic word are: " + task_3_part_1.unicWords(task_3_part_1.words));
        task_3_part_1.report(task_3_part_1.words);


    }

    List<String> words = new ArrayList<>(Arrays.asList( "red", "white", "blue",
            "green", "yellow", "black",
            "gray", "brown", "white",
            "red", "pink", "orange",
            "yellow", "black", "purple"));

    HashSet unicWords(Collection collection){
        HashSet unic_words = new HashSet(collection);
        return unic_words;
    }

    void report(List list){

        /*Class<String> type = String.class;
        if (!type.isInstance(collection)){
            System.out.println("this collection doesn't have Strings " );
            return;
        }*/

        int all = 0;
        ArrayList<String> Arrlist =
                new ArrayList<String>(unicWords(words));

        for (int i = 0; i < Arrlist.size(); i++){
            Iterator<String> iter = list.iterator();
            int amount = 0;
            String str1 = Arrlist.get(i);
            while (iter.hasNext()){
                String str2 = iter.next();
                if (str2.equals(str1)){
                    amount++;
                    all++;
                }
            }
            System.out.println( "word " + str1.toUpperCase(Locale.ROOT) + " is contains " + amount + " times");
        }
        System.out.println("so, there are " + all + " words, including unique: " + Arrlist.size());
    }

}
