import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Function;
public class SampleProgram1Optimization {
public static Integer prodList(List<Integer> argParty){
ArrayList<Integer>temp0 = new ArrayList<>(argParty);
return (argParty.size() == 0)
? 1
: argParty.get(0) * prodList(temp0.subList(1, temp0.size()));
}
public static void main(String[] args) {
ArrayList<Integer> list0 = new ArrayList<>();
ArrayList<Integer> list1 = new ArrayList<>();
list1.add(1);
list1.add(2);
list1.add(3);
list0.add(prodList(list1));
ArrayList<Integer> list2 = new ArrayList<>();
list2.add(5);
list2.add(7);
list2.add(2);
list0.add(prodList(list2));
ArrayList<Integer> list3 = new ArrayList<>();
list3.add(0);
list3.add(127);
list3.add(9);
list0.add(prodList(list3));
print(list0);
}
private static void print(List list) {
StringBuilder sb = new StringBuilder();
sb.append("[ ");
list.forEach(element -> sb.append(element).append(" "));
sb.append("]");
System.out.println(sb.toString());
}
}