package Program;

import Program.Collections.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<String> strA = new ArrayList<>(new String[]{"first", "second", "third"});
        System.out.println(getDrawing(strA));
        strA.put("fourth");
        System.out.println(getDrawing(strA));
        System.out.println(strA.contains("Alexander Galanov"));
        System.out.println(strA.contains("second"));
        strA.clear();
        System.out.println(getDrawing(strA));

        ArrayList<Integer> intA = new ArrayList<>(new Integer[]{1, 2, 3});
        System.out.println(getDrawing(intA));
        intA.put(4);
        System.out.println(getDrawing(intA));
        System.out.println(intA.contains(8));
        System.out.println(intA.contains(2));
    }

    private static String getDrawing(ArrayList list) {
        String res = "";
        for (int i = 0; i < list.getSize(); ++i) {
            res += list.get(i) + " ";
        }
        return res;
    }
}
