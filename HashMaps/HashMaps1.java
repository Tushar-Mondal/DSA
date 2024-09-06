package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class HashMaps1 {
    public static void main(String[] args) {
//        String name = "Bell";
//        int code = name.hashCode();
//        System.out.println(code);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tushar", 3);
        map.put("Tanjiro", 1);
        map.put("Bell", 0);

        System.out.println(map.get("Tushar"));
        System.out.println(map.getOrDefault("Kirito", 2));
        System.out.println(map.containsKey("Bell"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);

        MapUsingHash hashMap = new MapUsingHash();
        hashMap.put("Sun Breathing" ,"King of Breathings");
        hashMap.put("Bell", "RabbitFoot");
        hashMap.put("Human Human Fruit", "King of Devil fruits");
        System.out.println(hashMap.get("Bell"));
    }
    private static class MapUsingHash {
        public Entity[] entities;

        public MapUsingHash() {
            entities = new Entity[100];
        }
        public void put (String key, String value){
            int hash = Math.abs(key.hashCode() % entities.length);
            entities[hash] = new Entity(key, value);// Overriding
        }
        public String get (String key){
            int hash = Math.abs(key.hashCode() % entities.length);
            if (entities[hash] != null && entities[hash].key.equals(key)) {
                return entities[hash].value;
            } else {
                return null;
            }
        }
        public String remove (String key){
            int hash = Math.abs(key.hashCode() % entities.length);
            if (entities[hash] != null && entities[hash].key.equals(key)) {
                entities[hash] = null;
                return entities[hash].value;
            }
            return null;
        }
        private class Entity {
            String key;
            String value;

            public Entity(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
