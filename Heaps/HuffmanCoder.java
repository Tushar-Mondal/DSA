package Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoder {
    public static void main(String[] args) throws Exception {
        String str = "Tapan Mondal";
        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String dcs = hf.decode(cs);
        System.out.println(dcs);
        //Bitset can be used : like an array but with a bit at each index.
    }
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    public class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.cost = cost;
            this.data = data;
            this.left = null;
            this.right = null;
        }
        @Override
        public int compareTo (Node other){
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            freqMap.put(feeder.charAt(i), freqMap.getOrDefault(feeder.charAt(i), 0) + 1);
        }
        Heap1.Heap<Node> minHeap = new Heap1.Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = freqMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet){
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }
        while (minHeap.size() != 1){
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;
            minHeap.insert(newNode);
        }
        Node ft = minHeap.remove();
        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }
    public void initEncoderDecoder(Node node, String osf){
        if (node == null){
            return;
        }
        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }
        initEncoderDecoder(node.left, osf + 0);
        initEncoderDecoder(node.right, osf + 1);
    }
    public String encode (String str){
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += encoder.get(str.charAt(i));
        }
        return ans;
    }

    public String decode (String CodedString){
        String key = "";
        String ans = "";
        for (int i = 0; i < CodedString.length(); i++) {
            key += CodedString.charAt(i);
            if (decoder.containsKey(key)){
                ans += decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
