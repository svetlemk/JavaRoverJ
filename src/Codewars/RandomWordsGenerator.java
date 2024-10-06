package Codewars;

import java.util.Arrays;
import java.util.Random;
/*
Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
 */
public class RandomWordsGenerator {
   // public static void main(String[] args){
        public static String[] getWords(String word1,String word2,String word3,String word4,String word5){
           // String[] words = {word1,word2,word3,word4,word5};
           String[] words = new String[5];
           words[0] = word1;
           words[1] = word2;
           words[2] = word3;
           words[3] = word4;
           words[4] = word5;

            return words;

        }

        public static String[] generateWords(int n){
            Random random = new Random();
            String[] newArray = new String[n];
            for(int i=0; i<n;i++){
                newArray[i] = generateRandomWords(random, 5);
            }
            return newArray;
        }

        public static String generateRandomWords(Random random, int length){
            String alpahbet = "abcdefghijklmnopqrstuvwxyz";
            StringBuilder word = new StringBuilder(length);
            for(int i =0; i<length; i++){
                word.append(alpahbet.charAt(random.nextInt(alpahbet.length())));
            }
            return word.toString();
        }

        public static void main(String[] args){
            getWords("hello","world","i", "love","you");
            System.out.println(Arrays.toString(getWords("hello","world","i", "love","you")));

            System.out.println(Arrays.toString(generateWords(10)));
        }

    }
//}
