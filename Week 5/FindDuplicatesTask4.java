import java.util.ArrayList;
public class FindDuplicatesTask4 {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(1); list.add(2); list.add(3); list.add(2);
list.add(4); list.add(5); list.add(3); list.add(6); list.add(1);
ArrayList<Integer> duplicates = new ArrayList<Integer>();
for (int i = 0; i < list.size(); i++) {
for (int j = i + 1; j < list.size(); j++) {
if (list.get(i) == list.get(j)) {
if (!duplicates.contains(list.get(i))) {
duplicates.add(list.get(i));
}
}
}
}
System.out.println("Duplicates: " + duplicates);
}
}