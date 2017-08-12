public class Teste {
    public static void main(String[] args) {
        Onibus onibus = new Onibus();
        onibus.embarca(10);
        
        Ambulancia ambulancia = new Ambulancia();
        ambulancia.setSireneLigada(true);
        ambulancia.tocaSirene();
        
    }
}