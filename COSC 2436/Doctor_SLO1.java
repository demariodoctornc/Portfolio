import java.util.PriorityQueue;
import java.util.HashSet;

public class Doctor_SLO1 {

        public static void main(String[] args) {

            PriorityQueue<String> queue1 = new PriorityQueue<>();
            queue1.add("George");
            queue1.add("Jim");
            queue1.add("John");
            queue1.add("Blake");
            queue1.add("Kevin");
            queue1.add("Michael");
            queue1.add("Walter");
            queue1.add("Angel");

            PriorityQueue<String> queue2 = new PriorityQueue<>();
            queue2.add("George");
            queue2.add("Katie");
            queue2.add("Kevin");
            queue2.add("Michelle");
            queue2.add("Ryan");
            queue2.add("Angel");

            HashSet<String> set1 = new HashSet<>(queue1);
            HashSet<String> set2 = new HashSet<>(queue2);

            HashSet<String> union = new HashSet<>(set1);
            union.addAll(set2);

            HashSet<String> difference = new HashSet<>(set1);
            difference.removeAll(set2);

            HashSet<String> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);

            System.out.println("--------------------------------------------------");
            System.out.println("Queue 1: " + set1);
            System.out.println("Queue 2: " + set2);
            System.out.println("--------------------------------------------------");

            System.out.println("UNION (no duplicates):");
            System.out.println(union);
            System.out.println();

            System.out.println("DIFFERENCE (queue1 - queue2):");
            System.out.println(difference);
            System.out.println();

            System.out.println("INTERSECTION:");
            System.out.println(intersection);
            System.out.println("--------------------------------------------------");
        }
    }
