public class SegundoExemploPolimorfismo
{
    public static void main(String args[])
    {
        /*
         * Este trecho foi comentado pois modificamos a classe Usuario para ser abstrata
        //criar um novo usuário no sistema
        Usuario usuario = new Usuario(  Teclado.leInt("Informe a matrícula do usuário: "), 
                                        Teclado.leString("Informe o nome do usuário: "), 
                                        Teclado.leString("Informe o login do usuário: "), 
                                        Teclado.leString("Informe a senha do usuário: ")
                                     );
        */
        
        //criar um novo usuário do tipo Professor no sistema
        Professor professor = new Professor(  Teclado.leInt("Informe a matrícula do professor: "), 
                                              Teclado.leString("Informe o nome do professor: "), 
                                              Teclado.leString("Informe o login do professor: "), 
                                              Teclado.leString("Informe a senha do professor: ")
                                           );
        professor.setAreaAtuacao("Informática"); // atribuindo valor ao atributo: areaAtuacao por meio do método de configuração
        
        //criar um novo usuário do tipo Aluno no sistema
        Aluno aluno = new Aluno(  Teclado.leInt("Informe a matrícula do aluno: "), 
                                  Teclado.leString("Informe o nome do aluno: "), 
                                  Teclado.leString("Informe o login do aluno: "), 
                                  Teclado.leString("Informe a senha do aluno: ")
                               );
        
        //apresentar os dados de cada usuário criado
        /*
         * Este trecho foi comentado pois modificamos a classe Usuario para ser abstrata
        //Usuario
        usuario.exibeDados();
        */
       
        //Professor
        professor.exibeDados();
        //Aluno
        aluno.exibeDados();
    }
}
