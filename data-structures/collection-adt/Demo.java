public class Demo {
    public static void main(String[] args) {
        Collection<Integer> i = new Collection<>();
        Collection<Boolean> b = new Collection<>(4);
        Collection<String> s = new Collection<>(5);
        Collection<Circle> c = new Collection<>(3);

        i.add(7);
        i.add(-8);
        i.add(3);
        i.toString();
    }
}
