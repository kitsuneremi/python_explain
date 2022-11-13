
package explanpythoncodebyjava;

import java.util.ArrayList;


public class partition {
    public static void main(String[] args) {
        ArrayList<String> list = partitionexpain("yeahh vo dich roi","o");
        for (String string : list) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> partitionexpain(String initString,String keyword){
        ArrayList<String> list = new ArrayList<>();
        int a = initString.length();
        String newString = "";
        for(int i = initString.length(); i > 0; i--){
            if(initString.substring(i-1, i).equals(keyword)){
                if(a == initString.length()){
                    list.add(initString.substring(i, a).replace(" ", ""));
                    list.add(keyword);
                    newString = initString.substring(0, i-1);
                    a = i - 1;
                }else{
                    list.add(newString.substring(0, a - 1).replace(" ", ""));
                    list.add(keyword);
                    newString = newString.substring(i - 1, newString.length());
                    a = i - 1;
                }
            }
        }
        list.remove(list.size() - 1);
        return list;
    }
}
