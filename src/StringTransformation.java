import java.util.Set;
import java.util.TreeSet;

public class StringTransformation {
    public TreeSet stringTransformation(String string) {
        String[] lines = string.split("\\r?\\n"); // impartim string-ul in mai multe stringuri cand intalnim "new line"
        // de asemenea stocam stringurile obtinute intr-un array de stringuri
        if (lines.length == 0 || lines.length == 1) {
            System.out.println("Nothing to transform");
            return null;
            // verificam daca inputul este gol sau contine doar headerul, iar daca da, returnal null si un mesaj
        } else {
            TreeSet<String> treeSet = new TreeSet<String>(); // cream un obiect de tipul TreeSet
            for (int i = 1; i < lines.length; i++) { // i=1 pentru a omite headerul
                treeSet.add(lines[i]); // stocam fiecare element din array in TreeSet
            }
            TreeSet<String> groupedTreeSet = new TreeSet<String>(treeSet); // cream un nou obiect de tipul TreeSet pentru a stoca si initialele
            for (String s : treeSet) {
                groupedTreeSet.add(String.valueOf(s.charAt(0)) + ":"); // parcurgem treesetul initial si adaugam toate initialele care apar.
            }

            print(lines); // prit input
            System.out.println("-----------------------------");
            print(groupedTreeSet); // print output
            return groupedTreeSet;
        }
    }

    public void print(String[] arrayString) {
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
    }
    public void print(Set<String> treeSet){
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
