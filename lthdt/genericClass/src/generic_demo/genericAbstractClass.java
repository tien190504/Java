
public abstract class genericAbstractClass<T> {
    protected T data;
    public abstract void processData(T input);

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    
}
