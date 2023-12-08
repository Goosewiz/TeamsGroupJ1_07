package main.gusev.java23.task1;

public class GenericImplementation<T> implements SomeInterface<T> {
    protected T data;
    @Override
    public T getData(){
        T answer = data;
        return answer;
    }
    @Override
    public boolean validate(T data){
        return true;
    }
}
