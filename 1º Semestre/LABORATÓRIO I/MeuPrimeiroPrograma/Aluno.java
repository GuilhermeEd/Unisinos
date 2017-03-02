/**
 * Classe Aluno
 * @author Rosemary Francisco 
 * @version 02/03/2012
 */
public class Aluno
{
    // atributos da classe
    private int matricula;
    private String nome;
    private int semestre;

    /**
     * Metodo Construtor
     */
   /* public Aluno(int mat, String nom)
    {
        matricula = mat;
        nome = nom;
        semestre = 1;
    }*/

    /**
     * Metodo aprovado
     * Funcao: aprova o aluno e altera o semestre do aluno para o proximo semestre
     */
    public void aprovado()
    {
        semestre = semestre + 1;
    }
    
    /**
     * Metodo exibeDados
     * Funcao: exibe os dados do aluno
     */
    public void exibeDados()
    {
        System.out.println("------Dados do Aluno------");
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Semestre: " + semestre);
    }
}
