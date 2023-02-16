package com.linuxtips.descomplicandojavaespring.day10.ListJava;

import java.util.LinkedList;

public class LinkedListCollections {

    public static void main(String[] args) {

        //igual o array list porem com melhor peformance para os métodos add e remove
        //
        LinkedList<Integer> minhaLinkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++)
            minhaLinkedList.add(i);
        System.out.println(minhaLinkedList);
        System.out.println(minhaLinkedList.pop());
        System.out.println(minhaLinkedList.peek());
        System.out.println(minhaLinkedList.poll());
        System.out.println(minhaLinkedList);
        minhaLinkedList.clear();
        System.out.println(minhaLinkedList);

    }


}
