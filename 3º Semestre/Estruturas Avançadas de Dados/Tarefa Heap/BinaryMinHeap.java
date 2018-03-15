public class BinaryMinHeap {
  private int[] data;
  private int heapSize;

  public BinaryMinHeap(int size) {
    data = new int[size];
    heapSize = 0;
  }

  public int getMinimum() {
    if (isEmpty())
      throw new HeapException("Heap is empty");
    else
      return data[0];
  }

  public boolean isEmpty() {
    return (heapSize == 0);
  }

  private int getLeftChildIndex(int nodeIndex) {
    return 2 * nodeIndex + 1;
  }

  private int getRightChildIndex(int nodeIndex) {
    return 2 * nodeIndex + 2;
  }

  private int getParentIndex(int nodeIndex) {
    return (nodeIndex - 1) / 2;
  }

  public void insert(int value) {
    if (heapSize == data.length -1) {
      data[heapSize - 1] = value;
    } else {
      data[++heapSize] = value;
    }
    int i = heapSize;
    while(data[getParentIndex(i)] > data[i]) {
      int tmp = data[getParentIndex(i)];
      data[getParentIndex(i)] = data[i];
      data[i] = tmp;
      i = getParentIndex(i);
    }
  }

  public void print(){
    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i]);
    }
  }

  public static void main (String[] args) {
    BinaryMinHeap heap = new BinaryMinHeap(6);
    heap.insert(1);
    heap.insert(3);
    heap.insert(6);
    heap.insert(5);
    heap.insert(9);
    heap.insert(8);
    heap.print();
  }

  public class HeapException extends RuntimeException {
    public HeapException(String message) {
      super(message);
    }
  }

}
