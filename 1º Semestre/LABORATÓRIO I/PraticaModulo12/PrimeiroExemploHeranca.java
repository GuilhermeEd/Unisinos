public class PrimeiroExemploHeranca
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
        
        //criar um novo usuário do tipo Aluno no sistema
        Aluno aluno = new Aluno(  Teclado.leInt("Informe a matrícula do aluno: "), 
                                  Teclado.leString("Informe o nome do aluno: "), 
                                  Teclado.leString("Informe o login do aluno: "), 
                                  Teclado.leString("Informe a senha do aluno: ")
                               );
        
        //apresentar a matricula e o nome da cada usuário criado
        /*
         * Este trecho foi comentado pois modificamos a classe Usuario para ser abstrata
        //Usuario
        System.out.println("");
        System.out.println("Matrícula do usuário: " + usuario.getMatricula());
        System.out.println("Nome do usuário: " + usuario.getNome());
        */
       
        //Professor
        System.out.println("");
        System.out.println("Matrícula do professor: " + professor.getMatricula());
        System.out.println("Nome do professor: " + professor.getNome());
        //Aluno
        System.out.println("");
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
        System.out.println("Nome do aluno: " + aluno.getNome());
    }
}
