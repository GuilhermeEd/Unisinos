public class ListaAmigo
{
    private Usuario[] listaAmigos;
    private int qtdAmigos;
    
    public ListaAmigo(int tam)
    {
        this.listaAmigos = new Usuario[tam];
        this.qtdAmigos = tam;
    }
    
    public void adicionaAmigo(Usuario usr){
        // Arrays
        for(int i = 0; i < this.listaAmigos.length; i++){
            if(listaAmigos[i] != null){
                if(listaAmigos[i].getNumCelular() == usr.getNumCelular()){
                    return;
                }
            }
        }
        
        for(int i = 0; i < this.listaAmigos.length; i++){
            if(listaAmigos[i] == null){
                listaAmigos[i] = usr;
                return;
            }
        }
        
    }
    
    public void visualizaAmigos(){
        for(int i = 0; i < listaAmigos.length; i++)
            if(listaAmigos[i] != null) listaAmigos[i].exibeDados();
    }
    
    public Usuario[] pesquisaAmigoPorCelular(int numCelular){
        for(int i = 0; i < listaAmigos.length; i++){
            if(listaAmigos[i] != null){
                if(listaAmigos[i].getNumCelular() == numCelular){
                    Usuario[] novaLista = new Usuario[this.qtdAmigos];
                    novaLista[0] = listaAmigos[i];
                    return novaLista;
                }
            }
        }
        return null;
    }

}
