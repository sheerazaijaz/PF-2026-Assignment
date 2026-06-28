import java.util.ArrayList;
public class RemoveNegativesTask1 {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(5); list.add(-3); list.add(8); list.add(-1);
list.add(12); list.add(-7); list.add(4);
// go backward so index doesnt shift
int i = list.size() - 1;
while (i >= 0) {
if (list.get(i) < 0) {
list.remove(i);
}
i--;
}
System.out.println("ArrayList: " + list);
}
}