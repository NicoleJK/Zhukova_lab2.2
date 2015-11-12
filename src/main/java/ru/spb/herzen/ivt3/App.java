package ru.spb.herzen.ivt3;


import org.kohsuke.randname.RandomNameGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<String> names =new ArrayList<String>();
        RandomNameGenerator rnd = new RandomNameGenerator();

        for (int i = 0; i < 15; i++) {
            names.add(rnd.next());
        }
        Collections.sort(names);
        for(String s:names){
        System.out.println("Hello, " + s);}
        //
        System.out.println("ВЫВОД ИМЕН С 3 ПО 5");
        for (int i = 2; i < 5; i++) {
            System.out.println("Hello, " +names.get(i));}
        //
        for(String s:names){
            System.out.println( s.toUpperCase());}
        //Числовой массив
        List<Integer> numbers =new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            numbers.add((int) (Math.random() * 201 - 100));
            System.out.println(numbers.get(i));
            if (numbers.get(i) % 2 == 0)  {
                sum++;
        }}
        System.out.println("Количество четных чисел: " + sum);
        //Максимальное, минимальное число
        System.out.println("Минимальное число: " + Collections.min(numbers));
        System.out.println("Максимальное число: " + Collections.max(numbers));
        //Символы
       List<Character> charList =new ArrayList<Character>();
        for(char c : "НИКОЛЬ".toCharArray()) {
            charList.add(c);}
        //Сортированный список
        Collections.sort(charList);
        for (char c:charList) {
            System.out.println(c);
        }
        //Количество гласных
        int s1 = 0;
        int s2 = 0;
        for (char c:charList) {
            if (c == 'И') {
                s1++;
            }
            ;
            if (c == 'А') {
                s2++;
            }

        }
        System.out.println("Количество букв И: " + s1);
        System.out.println("Количество букв А: " + s2);

    }
    }

