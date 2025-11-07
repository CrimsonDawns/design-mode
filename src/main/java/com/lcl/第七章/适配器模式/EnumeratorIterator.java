package com.lcl.第七章.适配器模式;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorIterator implements Enumeration {
    private Iterator iterator;

    public EnumeratorIterator(Iterator iterable) {
        this.iterator = iterable;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
