package ajedrez;

public enum Abscisa {
    a(0),b(1),c(2),d(3),e(4),f(5),g(6),h(7);
    private byte value;
    private Abscisa(byte _value){
        this.value = _value;
    }

    public byte getValue(){
        return value;
    }
}
