public class CustomArrayList {
  
  private int size;
  private int[] array;
  private int current;

  public CustomArrayList() {
    this(2);
  }

  public CustomArrayList(int size) {
    this.size = size;
    this.array = new int[size];
    this.current = 0;
  }

  public int insert(int position, int element) {
    return 0;
  }

  public int add(int element) {

    if (this.current == this.size) {
      expandArray();
    }

    array[this.current] = element;
    this.current+=1;

    return element;
  }

  public int delete(int position) {
    return 0;
  }

  public void print() {
    for(int i=0; i<this.current; i++) {
      System.out.println(this.array[i]);
    }
  }

  private void expandArray() {
    this.size*=2;
    int[] newArray = new int[this.size];
    for(int i=0; i<this.array.length; i++) {
      newArray[i] = this.array[i];
    }
    this.array = newArray;
  }

  public static void main(String[] args) {
    CustomArrayList list = new CustomArrayList();

    list.add(10);
    list.add(20);
    list.add(30);
    list.print();
    
    
  }
}
