package Ooops.Generics;

import java.util.*;

//Here T should either be Number or its subclasses.
public class WildCard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public void getList(List<? extends Number> list){

    }
    public WildCard(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T removed(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, int element){
        data[index] = element;
    }
    public String toString(){
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {

        //    ArrayList list = new ArrayList();
//        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//        System.out.println(list);
        CustomGenericArrayList list = new CustomGenericArrayList();
        list.add(45);
    }
}