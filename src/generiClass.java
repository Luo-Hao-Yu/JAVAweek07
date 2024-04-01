public class generiClass<T> implements GenericInterface<T> {
    private T data;
    public void setData(T data){
        this.data=data;
    }
    public T getData(){
        return data;
    }
}
