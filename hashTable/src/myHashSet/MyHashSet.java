package myHashSet;

import java.util.ArrayList;

public class MyHashSet implements HashTableADT {
    private final int size = 1000;
    private

    //return hashValue
    @Override
    public int hashTable(Object key) {
        return (int)key % size;
    }

    @Override
    public void add(Object key) {

    }

    @Override
    public void remove(Object key) {

    }

    @Override
    public boolean contains(Object key) {
        return false;
    }
}
