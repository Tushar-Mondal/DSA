package Heaps;

import java.util.ArrayList;

public class Heap1 {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        System.out.println(heap.remove());
        System.out.println(heap.heapSort());
    }
    public static class Heap <T extends Comparable<T>> {
        public ArrayList<T> list;

        public Heap() {
            list = new ArrayList<>();
        }
        public void swap (int first, int second){
            T temp = list.get(first);
            list.set(first, list.get(second));
            list.set(second, temp);
        }
        public int parent (int index){
            return (index - 1) / 2;
        }
        public int left (int index){
            return (index * 2) + 1;
        }
        public int right (int index){
            return (index * 2) + 2;
        }
        public void insert (T value){
            list.add(value);
            upHeap (list.size() - 1);
        }
        private void upHeap (int index){
            if(index == 0){
                return;
            }
            int p = parent(index);
            if(list.get(index).compareTo(list.get(p)) < 0){
                swap(index, p);
                upHeap(p);
            }
        }
        public T remove () throws Exception {
            if(list.isEmpty()){
                throw new Exception("Removing from an empty Heap!");
            }
            T temp = list.getFirst();
            T last = list.remove(list.size() - 1);
            if(!list.isEmpty()){
                list.set(0, last);
                downHeap(0);
            }
            return temp;
        }
        private void downHeap(int index) {
            int min = index;
            int left = left(index);
            int right = right(index);
            if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
                min = left;
            }
            if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
                min = right;
            }
            if (min != index){
                swap(min, index);
                downHeap(min);
            }
        }
        public int size(){
            return list.size();
        }
        public ArrayList<T> heapSort() throws Exception {
            ArrayList<T> data = new ArrayList<>();
            while (!list.isEmpty()){
                data.add(this.remove());
            }
            return data;
        }
    }
}