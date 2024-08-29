package Exercise4_ListAsMethodParameter;

import java.util.*;

class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        System.out.println(returnSize(names));

        Map<String,String> maps = new HashMap<>();
        maps.put("1","First");
        maps.put("2","Second");
        System.out.println(returnSize(maps));

        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("first");
        set.add("second");
        set.add("second");
        set.add("second");
        set.add("second");
        System.out.println(returnSize(set));
    }

    public static int returnSize(Map map){
        return map.size();
    }

    public static int returnSize(List list){
        return list.size();
    }

    public static int returnSize(Set set){
        return set.size();

    }
}
