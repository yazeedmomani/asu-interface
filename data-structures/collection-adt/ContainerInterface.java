public interface ContainerInterface <T> {
    public void add(T element);
    public void remove();
    public int size();
    public boolean isFull();
    public boolean isEmpty();
}
