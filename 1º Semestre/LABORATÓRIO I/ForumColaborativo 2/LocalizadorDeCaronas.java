public class LocalizadorDeCaronas extends Aplicativo
{
  String horaDoDia; // Hora do dia representado em forma de texto. Ex.: "manhã", "tarde" ou "noite".
  String enderecoEmbarque; // Endereço onde o usuário poderá encontrar sua carona
  String enderecoDestino; // Endereço onde o usuário será deixado
  double horarioEmbarque; //  Horário no qual o usuário poderá encontrar sua carona
  double custoRateado; // Custo da carona dividido entre todos os passgeiros
  
  // Construtor da classe inicializando os atributos
  public LocalizadorDeCaronas(String emb, String des, double hor, double custo, double tam, boolean usaNet)
  {
    super(tam, usaNet);
    enderecoEmbarque = emb;
    enderecoDestino = des;
    horarioEmbarque = hor;
    custoRateado = custo;
  }

  public void localizarCarona(){
      
    if (horarioEmbarque >= 6.00f && horarioEmbarque < 12.00f) {
        horaDoDia = "manhã";
    } else if (horarioEmbarque < 18.00f) {
        horaDoDia = "tarde";
    } else {
        horaDoDia = "noite";
    }
    
      
    System.out.printf("Olá, sua carona será de %s ", enderecoEmbarque);
    System.out.printf("até %s. ", enderecoDestino);
    System.out.printf("\nPor favor esteja no endereço de embarque às %f da %s.", horarioEmbarque, horaDoDia);
    System.out.printf("\nEssa carona lhe custará a bagatela de %f. Boa viagem!", custoRateado);
  }

}