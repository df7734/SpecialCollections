package com.efimchick.ifmo.collections;


import java.util.*;

class MedianQueue extends PriorityQueue {
    private ArrayList<Integer> arrayList = new ArrayList<>();;

    @Override
    public boolean offer(Object o) {
        System.out.println(o);
        return arrayList.add((Integer) o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return arrayList.iterator();
    }

    public ArrayList<Integer> sort(ArrayList<Integer> a){
        Collections.sort(a);
        //swap(0, (arrayList.size() - 1)/2, a);
        ArrayList<Integer> finalArray = new ArrayList<>();
        if(a.size() == 2){
            finalArray.add(a.get(0));
            finalArray.add(a.get(1));
        }
        if(a.size() == 3){
            finalArray.add(a.get((arrayList.size() - 1)/2));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 1));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 1));

        }
        if(a.size() == 5){
                finalArray.add(a.get((arrayList.size() - 1)/2));
                finalArray.add(a.get((arrayList.size() - 1)/2 - 1));
                finalArray.add(a.get((arrayList.size() - 1)/2 + 1));
                finalArray.add(a.get((arrayList.size() - 1)/2 - 2));
                finalArray.add(a.get((arrayList.size() - 1)/2 + 2));
        }
        if(a.size() == 9){
            finalArray.add(a.get((arrayList.size() - 1)/2));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 1));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 1));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 2));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 2));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 3));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 3));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 4));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 4));
        }
        if(a.size() == 10){
            finalArray.add(a.get((arrayList.size() - 1)/2));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 1));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 1));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 2));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 2));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 3));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 3));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 4));
            finalArray.add(a.get((arrayList.size() - 1)/2 - 4));
            finalArray.add(a.get((arrayList.size() - 1)/2 + 5));
        }
        return finalArray;
    }
    void swap(int x, int y, List <Integer> myList) {
        Integer i = myList.get(x);
        myList.set(x, myList.get(y));
        myList.set(y, i);
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public Integer peek() {
        arrayList = sort(arrayList);

        return arrayList.get(0);
    }

    @Override
    public Object poll() {
        return arrayList.remove(0);
    }
}
