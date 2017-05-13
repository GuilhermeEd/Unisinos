public class Teste
{
    public static void main(String[] args){
    
        Aplicativo app = new LocalizadorDeCaronas(
            "Rua Falsa, 123",
            "Rua Fake, 321",
            12.30,
            8.75,
            42.00,
            true
        );
        
        app.iniciaAplicativo();
        ((LocalizadorDeCaronas)app).localizarCarona();
        app.finalizaAplicativo();
    }
}
