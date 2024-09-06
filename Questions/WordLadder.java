package Questions;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        System.out.println(ladderLengthMY(beginWord, endWord, wordList));
        System.out.println(ladderLength(beginWord, endWord, wordList));
    }
    public static int ladderLengthMY(String beginWord, String endWord, List<String> wordList) {
        if(wordList.get(wordList.size() - 1) != endWord){
            return 0;
        }
        return match(beginWord, endWord, wordList, 0);
    }

    public static int match(String start, String end, List<String> wordList, int count){
        for (int i = 0; i < wordList.size(); i++) {
            int add = 0;
            for (int j = 0; j < start.length(); j++) {
                if(start.charAt(j) == wordList.get(i).charAt(j)){
                    add++;
                }
            }
            if(add == start.length() - 1){
                start = wordList.get(i);
                count++;
            }
        }
        return count;
    }
    public static int ladderLength(String beginWord, String endWord, List<String> wordList){
        if (!wordList.contains(endWord)){
            return 0;
        }
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int length = 0;
        while (!q.isEmpty()){
            int size = q.size();
            length++;
            for (int i = 0; i < size; i++) {
                String current = q.poll();
                for (int j = 0; j < current.length(); j++) {
                    char[] temp = current.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++){
                        temp[j] = ch;
                        String newWord = new String(temp);
                        if (newWord.equals(endWord)){
                            return length + 1;
                        }
                        if (wordList.contains(newWord) && !visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }
}