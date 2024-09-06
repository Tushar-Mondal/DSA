package HashMaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFinal<k, v> {
    public static void main(String[] args) {
        HashMapFinal<String, String> mapFinal = new HashMapFinal<>();
        mapFinal.put("Sun Breathing" ,"King of Breathings");
        mapFinal.put("Bell", "RabbitFoot");
        mapFinal.put("Human Human Fruit", "King of Devil fruits");
        System.out.println(mapFinal);
    }
    ArrayList<LinkedList<Entity>> list;
    public int size = 0;
    public float lf = 0.5f;
    public HashMapFinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }
    public void put (k key, v value){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities){
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
        if((float) (size) / list.size() > lf){
            reHash();
        }
        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash() {
        System.out.println("We are now rehashing!");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }
        for (LinkedList<Entity> entities : old){
            for (Entity entity : entities){
                put(entity.key, entity.value);
            }
        }
    }
    public v get(k key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }
    public void remove (k key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities){
            if(entity.key.equals(key)){
                entities.remove(entity);
            }
        }
        size--;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (LinkedList<Entity> entities : list){
            for (Entity entity : entities){
                builder.append(entity.key);
                builder.append(" -> ");
                builder.append(entity.value);
                builder.append(", ");
            }
        }
        builder.append("}");
        return builder.toString();
    }
    public boolean containsKey (k key){
        return get(key) != null;
    }
    private class Entity {
        k key;
        v value;

        public Entity(k key, v value) {
            this.key = key;
            this.value = value;
        }
    }
}
