package HeadFirst;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayTime {


    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

//        int firstItem = 0;
//        list.add(firstItem);
//        firstItem = 4;
//        list.add(firstItem);
//        System.out.println(list);



        ArrayList<String> wowNpcs = new ArrayList();

        wowNpcs.add("Thrall");
        wowNpcs.add("Jaina Proudmoore");
        wowNpcs.add("Anduin Wrynn");

        ArrayList<String> factionChampions = new ArrayList<>();


        factionChampions.addAll(wowNpcs);

        System.out.println(factionChampions);


        factionChampions.remove(1);

        ArrayList hordeFactionChampions = (ArrayList)factionChampions.clone();
        System.out.println("---------------------------------");
        System.out.println("Removing Jaina:");
        System.out.println(factionChampions);


        System.out.println("Printing the new horde faction champion list");
        hordeFactionChampions.remove(1);
        System.out.println(hordeFactionChampions);

        System.out.println(hordeFactionChampions.contains("Thrall"));
        System.out.println("---------------------------------");

        System.out.println(hordeFactionChampions.isEmpty());
        System.out.println("---------------------------------");

        System.out.println(hordeFactionChampions.indexOf("Thrall"));
        System.out.println(factionChampions);
        System.out.println(factionChampions.indexOf("Anduin"));

    }
}
