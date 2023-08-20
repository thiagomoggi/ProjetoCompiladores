package comp.src.ast;

public class cmdEscrita extends AbstractCommand {

    private String id;

    public cmdEscrita (String id) {
        this.id = id;
    }

    @Override
    public String GerarCodigo() {
        return "System.out.println(" + id + ");";
    }

    @Override
    public String toString() {
        return "cmdEscreve{" +
                "id='" + id + '\'' +
                '}';
    }
}
