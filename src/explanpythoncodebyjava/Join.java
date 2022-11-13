/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explanpythoncodebyjava;

import java.util.ArrayList;

/**
 *
 * @author lilyp
 */
public class Join {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(join("this is init String",list));
    }
    
    public static String join(String initString, ArrayList<String> listString){
        String finalString = "";
//        for (String list : listString) {
//            finalString = finalString + list + initString;
//        }
        for(int i = 0; i < listString.size(); i++){
            if(i == listString.size() - 1){
                finalString = finalString + listString.get(i);
            }else{
                finalString = finalString + listString.get(i) + initString;
            }
        }
        return finalString;
    }
    
}
