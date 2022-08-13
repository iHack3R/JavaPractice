import java.util.*;

public class DataHandling {
    public static void main (String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Udit");
        names.add("Rahul");
        names.add("Udit");
        names.add("Rishi");
        names.add("Ankur");
        names.add("Shashank");
        names.add("Rishi");

        //Sorting using sort method of collections framework
        //Collections.sort(names);
        Collections.reverse(names);
        Collections.addAll(names);

        System.out.println("ArrayList Names:" + names);
        System.out.println("ArrayList Names at 2nd index:" + names.get(2));
        List<String> streamNames1 = names.stream().sorted().distinct().toList();
        System.out.println("ArrayList Stream Sorted Names:" + streamNames1);
        List<String> streamNames2 = names.stream().filter(name->name.endsWith("t")).map(name->name.toUpperCase()).toList();
        System.out.println("ArrayList Stream Sorted and Ending with 't' names:" + streamNames2);

        //Use of HashMap
        HashMap<Integer, String> mapNames = new HashMap<>();
        mapNames.put(1, "Udit");
        mapNames.put(2, "Ankur");
        mapNames.put(3, "Shashank");
        mapNames.put(4, "Udit");
        System.out.println("HashMap Names:" + mapNames);
        System.out.println("HashMap Names at 2nd value:" + mapNames.get(2));

        //Use of HashSet
        HashSet<String> setNames = new HashSet<>();
        setNames.add("Udit");
        setNames.add("Ankur");
        setNames.add("Shashank");
        setNames.add("Udit");
        System.out.println("HashSet Names:" + setNames);
        List<String> streamNames3= setNames.stream().sorted().map(name->name.toUpperCase()).toList();
        System.out.println("HashSet Stream Sorted and uppercase names:" + streamNames3);
    }
}