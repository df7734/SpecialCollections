package com.efimchick.ifmo.collections;


import java.util.*;

class PairStringList extends ArrayList {
    @Override
    public boolean add(Object o) {
        super.add(o);
        return super.add(o);
    }

    @Override
    public boolean remove(Object o) {
        super.remove(o);
        return super.remove(o);
    }

    @Override
    public Object remove(int index) {
            super.remove(index);
            return super.remove(index-1);
    }

    @Override
    public void add(int index, Object element) {
        if(index%2!=0){
            index++;
        }
        super.add(index, element);
        super.add(index, element);
    }

    @Override
    public Object set(int index, Object element) {
        if(index%2!=0){
            index--;
        }
        super.set(index, element);
        return super.set(index+1, element);
    }

    @Override
    public boolean addAll(Collection c) {
        List<Object> objectList = Arrays.asList(c.toArray());
        Collection<Object> collection = new ArrayList<>();
        for (Object o: objectList) {
            collection.add(o);
            collection.add(o);
        }
        return super.addAll(collection);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if(index%2!=0){
            index++;
        }
        List<Object> objectList = Arrays.asList(c.toArray());
        Collection<Object> collection = new ArrayList<>();
        for (Object o: objectList) {
            collection.add(o);
            collection.add(o);
        }
        return super.addAll(index, collection);
    }
}
