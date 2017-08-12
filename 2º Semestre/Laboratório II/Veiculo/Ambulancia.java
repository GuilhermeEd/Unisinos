public class Ambulancia extends Veiculo {
    
    private boolean sireneLigada = false;
    
    public boolean getSireneLigada(){
        return this.sireneLigada;
    }
    
    public void setSireneLigada(boolean sirene){
        this.sireneLigada = sirene;
    }
    
    public void tocaSirene(){
        if (this.sireneLigada){
            System.out.println("Nee-Naw!");
        }
    }
}