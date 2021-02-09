package com.biman.feb;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

  Iterator<Integer> itr = null;
  Integer nextVal = null;
  public PeekingIterator(Iterator<Integer> iterator) {
    // initialize any member here.
    itr = iterator;
    nextVal = iterator.next();

  }

  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    return nextVal;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    Integer val = nextVal;
    if(itr.hasNext())
      nextVal = itr.next();
    else
      nextVal = null;
    return val;
  }

  @Override
  public boolean hasNext() {
    return nextVal != null || itr.hasNext();
  }
}
