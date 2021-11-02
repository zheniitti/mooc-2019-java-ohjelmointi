/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc_2017koe;

import java.util.Comparator;

/**
 *
 * @author zheny
 */
public class SanaNumeroVertailija implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(Integer.valueOf(o2.substring(o2.length()-1, o2.length())) == Integer.valueOf(o1.substring(o1.length()-1, o1.length()))){
            return o1.split(",")[0].compareTo(o2.split(",")[0]);
        }
        return Integer.valueOf(o2.substring(o2.length()-1, o2.length())) - Integer.valueOf(o1.substring(o1.length()-1, o1.length()));
    }
    
}
