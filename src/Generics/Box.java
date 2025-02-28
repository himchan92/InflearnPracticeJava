package Generics;

public class Box<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    //    private Object content;
//    public void setContent(Object content) {
//        this.content = content;
//    }
//
//    public Object getContent() {
//        return content;
//    }
}
