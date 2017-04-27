/**
* Bike que pode ser compartilhada com outras pessoas.
* 
* @author Rodrigo Waldow 
* @version 26.04.2017
*/
public class Bike
{
private int number;
private char station;

/**
* COnstrutor para objetos da classe Bike
*/
public Bike(int num, char st)
{
this.number = num;
this.station = st;
}

/**
* metodos SET para configuracao dos atributos; 
*/
public void setBikeNumber(int num) 
{ 
this.number = num; 
} 
/**
*metodos GET para acesso dos atributos; 
*/
public int getBikeNumber() 
{ 
return number; 
} 

/**
* metodos SET para configuracao dos atributos; 
*/
public void setBikeStation(char st) 
{ 
this.station = st; 
} 

/**
*metodos GET para acesso dos atributos; 
*/
public char getBikeStation() 
{ 
return station; 
} 

/**
* Método que retorna o nome da estação da bike.
* 
* @return nome da estação 
*/
public String returnStationBike(char station)
{
if(station == 'A')
return "Iberê";
else if(station == 'B')
return "Parcão";
else if (station == 'C')
return "Encol";
else
return "Station not defined;";
}

/**
* Método exibeDados para apresentar os dados da classe Bike.
* 
*/
public void exibeDados()
{
System.out.println("\nDados do ShareBike:");
System.out.printf("Você retirou a bicicleta número " + number);
System.out.printf(" localizada na estação " + returnStationBike(station));
System.out.println("\nBom Passeio!");
}
}