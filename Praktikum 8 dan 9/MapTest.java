/*
 * File : MapTest.java
 * deskripsi : Program yang menggunakan generic untuk pasangan kunci-nilai
 */

import java.util.*;

public class MapTest {
    public static void main (String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>() ;
        map. put (1, "satu");
        map .put (2, "dua");        
        System. out. println (map.get (1));
        Set<Integer> keySet = map.keyset();

    }
}