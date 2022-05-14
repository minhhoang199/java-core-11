package myHashSet;

public interface HashTableADT<T> {
     int hashTable(T key);
     void add(T key);
     void remove(T key);
     boolean contains(T key);
}
