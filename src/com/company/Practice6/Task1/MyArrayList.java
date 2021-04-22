package com.company.Practice6.Task1;

public class MyArrayList<T> {
    final int maxSize = 10;
    int pointer = 0;
    Object[] storageArray = new Object[maxSize];

    public void add(T t) throws MyArrayStoreException {
        if (pointer < 10) {
            storageArray[pointer++] = t;
        } else {
            throw new MyArrayStoreException("Over max size");
        }
    }

    public boolean remove(T t) {
        boolean inArray = false;
        for (int i = 0; i < pointer; i++) {
            if (storageArray[i] == t) {
                for (int j = i; j < pointer - 1; j++) {
                    storageArray[j] = storageArray[j + 1];
                }

                inArray = true;
                break;
            }
        }
        pointer--;
        return inArray;
    }

    public T[] toArray() {
        return (T[]) storageArray;
    }

    public int size() {
        return pointer;
    }


    public T get(int index) {
        if (index < pointer) {
            return (T) storageArray[index];
        }
        else {
            return null;
        }
    }

}
