package ajedrez;

public enum Abscisa {
    a(0),b(1),c(2),d(3),e(4),f(5),g(6),h(7);
    private int value;
    private Abscisa(int _value){
        this.value = _value;
    }

    public int getValue(){
        return value;
    }
}
