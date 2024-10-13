
public class Info <T>{
    private T value;

    public Info(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }

    public <T extends Number>void print(T[] list) {
        for (T i : list) {
            System.out.println("Number: " + i);
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (String)this.value;
    }
}
