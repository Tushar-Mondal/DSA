package File_Handling;

import java.io.*;

public class FileHandling1 {
    public static void main(String[] args) {
//        //Input
//        try (InputStreamReader ist = new InputStreamReader(System.in)) {
//            System.out.print("Enter some letters: ");
//            int letters = ist.read();
//            while (ist.ready()){
//                System.out.println((char) letters);
//                letters = ist.read();
//            }
////            ist.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        try (FileReader fr = new FileReader("notes.txt")) {
//            int letters = fr.read();
//            while (fr.ready()){
//                System.out.print(STR."\{(char) letters}");
//                letters = fr.read();
//            }
////            ist.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        //Byte to char stream then reading char stream.
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println(STR."You typed : \{br.readLine()}");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try(BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
//            while (br.ready()){
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//             System.out.println(e.getMessage());
//        }

        //Output
//        OutputStream op = System.out;
//        op.write("Love Emoji which i don't find");//If i put love emoji over there then the range will get exceeded.
//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("Hello World\n");
//            osw.write(97);
//            osw.write(10);
//            osw.write('A');
//            osw.write('\n');
//            char[] arr = "Hello World".toCharArray();
//            osw.write(arr);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (FileWriter fr = new FileWriter("notes.txt", true)) {
//            fr.write("This should be appended");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"))) {
//            bw.write("Hare Krishna");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        //Creating the file.
//        try {
//            File fo = new File("New-File.txt");
//            fo.createNewFile();
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        //Write in the file.
//        try {
//            FileWriter fw = new FileWriter("New-File.txt");
//            fw.write("Hare Krishna");
//            fw.close();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        //Reading from a file
        try {
            File fo = new File("New-File.txt");
            fo.createNewFile();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        //Write in the file.
        try(BufferedReader br = new BufferedReader(new FileReader("New-File.txt"))) {
            while (br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
