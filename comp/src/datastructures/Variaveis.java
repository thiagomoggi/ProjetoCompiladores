package comp.src.datastructures;

public class Variaveis extends Simbolos{
    public static final int NUMBER = 0;
    public static final int TEXT = 1;

    private  int type;
    private String value;

    public Variaveis(String name, int type, String value) {
        super(name);
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String GerarCodigo() {
        String varType;
        if (type == NUMBER){
            varType = "double";
        } else {
            varType = "String";
        }
        return varType + " " + name + ";";
    }

    @Override
    public String toString() {
        return "Variavel [name=" + name + ", type=" + type + ", value=" + value + "]";
    }


}
