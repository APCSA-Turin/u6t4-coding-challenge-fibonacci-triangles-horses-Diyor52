package com.example.project;

public class Fibonacci {
  // Instance variable to store the Fibonacci sequence
  private int[] sequence;

  /** Constructor: sets sequence to an array containing the first seqLen numbers
      in a Fibonacci sequence. A Fibonacci sequence is formed by summing the
      previous two numbers to generate the next number,
      e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…
      All Fibonacci sequences start out with 0 and 1 as the first two numbers.
      PRECONDITION: seqLen >= 2
  */
  public Fibonacci(int seqLen) {
    sequence = new int[seqLen];
    sequence[0] = 0; 
    sequence[1] = 1; 
    for (int k = 2; k < seqLen; k++) {
        sequence[k] = sequence[k - 1] + sequence[k - 2];
    }
  }

  /** Getter method: returns a reference to the sequence array */
  public int[] getSequence() {
    return sequence; 
  }

  /** Returns the index in the array where a particular value, searchVal, is
      located in sequence; if not found, returns -1.  If searchVal == 1, return
      first index where 1 is found (since this value appears twice in Fibonacci
      sequences longer than 2 numbers)
   */
  public int getIndexOf(int searchVal) {
    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] == searchVal) {
        return i;
      }
    }
    return -1; 
  }

  /** Assigns sequence to a new array that extends the current sequence by
      howManyMore numbers of the Fibonacci sequence */
  public void extendBy(int howManyMore) {
    int[] newArray = new int[sequence.length + howManyMore];
    for (int i = 0; i < this.sequence.length; i++) {
      newArray[i] = sequence[i];
    }
    
    // Generate the new Fibonacci numbers and add them to the new array
    for (int k = this.sequence.length; k < newArray.length; k++) {
      newArray[k] = newArray[k - 1] + newArray[k - 2];
    }
    sequence = newArray;
  }

  /** Returns a string that represents the sequence array nicely formatted */
  public String fibonacciString() {
    return ArrayPrinter.printableString(sequence);
  }
}
