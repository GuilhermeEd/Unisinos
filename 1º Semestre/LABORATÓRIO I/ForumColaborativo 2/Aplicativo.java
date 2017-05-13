public class Aplicativo
{
    private double tamanho;
    private boolean usaInternet;
    
    public Aplicativo(double tam, boolean usaNet)
    {
        tamanho = tam;
        usaInternet = usaNet;
    }
    
    public void iniciaAplicativo()
    {
        System.out.println("Iniciando aplicativo...");
    }
    
    public void finalizaAplicativo()
    {
        System.out.println("\nFinalizando aplicativo...");
    }

}
