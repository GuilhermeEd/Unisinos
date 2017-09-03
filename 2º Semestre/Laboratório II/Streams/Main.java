import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            Aluno[] a = CarregaAlunos.carregaArquivo("alunos.txt");
            for (int i = 0; i < a.length; i++){
                System.out.println(a[i]);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}