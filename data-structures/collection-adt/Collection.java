public class Collection<T> implements ContainerInterface<T>{
    private int index = -1;
    private T[] arr;
    public Collection (){
        arr = (T[]) new Object[10];
    }
    public Collection(int size){
        arr = (T[]) new Object[size];
    }
    public void add (T element){
        if(index<arr.length-1){
            ++index;
            arr[index]=element;
        }
    }

    public void remove(){
        if(index<0) return;
        arr[index]=null;
        index--;
    }

    public boolean isFull(){
        return index >= arr.length - 1;
    }

    public boolean isEmpty(){
        return index < 0;
    }

    public int size(){
        return index + 1;
    }

    public String toString(){
        System.out.print("Container elements are: ");

        String result = "[";
        for(int i = 0; i < index; i++) result += arr[i] + ", ";
        result += arr[index] + "]";

        System.out.print(result);

        return result;
    }
}
