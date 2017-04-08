public class Dado {

    // atributos
    private int lados;

    /*constructor de objetos da classe Dado */
    public Dado (int nlados) {
        lados = nlados; 
    }

    // método que simula o lancamento de um dado
    public int jogaDado() {
        return (int) (Math.random ( ) * lados + 1); 
    }
}