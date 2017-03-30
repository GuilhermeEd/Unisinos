public class TesteDeeper
{
    // Método main para incialização e teste da aplicação
    public static void main(String[] args)
    {
        // Solicitação de dados através do teclado para criação do primeiro usuário
        System.out.println("******************** Criação do Primeiro Usuário ********************");
        String nome1 = Teclado.leString("Digite o Nome do novo usuário: ");
        String email1 = Teclado.leString("Digite o E-Mail do usuário " + nome1 + ": ");
        int numeroCelular1 = Teclado.leInt("Digite o Número de Celular do usuário " + nome1 + ": ");

        // Criação do primeiro usuário
        Usuario usuario1 = new Usuario(email1, "senhainicial", nome1, numeroCelular1);
        System.out.println("\nUsuário " + usuario1.getNome() + " criado com sucesso!");
        
        // Solicitação de dados através do teclado para criação do interesse de carreira do primeiro usuário
        System.out.println("\n\nPara prosseguir adicione um Interesse de Carreira ao usuário " + usuario1.getNome() + ".");
        String tituloCarreira1 = Teclado.leString("Dê um Título ao novo Interesse de Carreira: ");
        String descricaoCarreira1 = Teclado.leString("Descreva com suas palavras esse Interesse: ");
        
        // Criação do interesse de carreira para o primeiro usuário
        Interesse interesseCarreira1 = new Interesse(tituloCarreira1, descricaoCarreira1, 'C', usuario1);     
        System.out.println("\nInteresse \"" + interesseCarreira1.getTitulo() +
        "\" adicionado com sucesso ao usuário " + usuario1.getNome());
        
        // Solicitação de dados através do teclado para criação do interesse pessoal do primeiro usuário
        System.out.println("\n\nPara prosseguir adicione um novo Interesse Pessoal ao usuário " + usuario1.getNome() + ".");
        String tituloPessoal1 = Teclado.leString("Dê um Título ao novo Interesse Pessoal: ");
        String descricaoPessoal1 = Teclado.leString("Descreva com suas palavras esse Interesse: ");
        
        // Criação do interesse pessoal para o primeiro usuário
        Interesse interessePessoal1 = new Interesse(tituloPessoal1, descricaoPessoal1, 'P', usuario1);     
        System.out.println("\nInteresse \"" + interessePessoal1.getTitulo() +
        "\" adicionado com sucesso ao usuário " + usuario1.getNome() + ".");
        
        
        
        
        // Solicitação de dados através do teclado para criação do segundo usuário
        System.out.println("\n\n******************** Criação do Segundo Usuário  ********************");
        String nome2 = Teclado.leString("Digite o Nome do novo usuário: ");
        String email2 = Teclado.leString("Digite o E-Mail do usuário " + nome2 + ": ");
        int numeroCelular2 = Teclado.leInt("Digite o Número de Celular do usuário " + nome2 + ": ");
        
        // Criação do segundo usuário
        Usuario usuario2 = new Usuario(email2, "senhainicial", nome2, numeroCelular2);
        System.out.println("\nUsuário " + usuario2.getNome() + " criado com sucesso!");
        
        // Solicitação de dados através do teclado para criação do interesse de carreira do segundo usuário
        System.out.println("\n\nPara prosseguir adicione um Interesse de Carreira ao usuário " + usuario2.getNome() + ".");
        String tituloCarreira2 = Teclado.leString("Dê um Título ao novo Interesse de Carreira: ");
        String descricaoCarreira2 = Teclado.leString("Descreva com suas palavras esse Interesse: ");
        
        // Criação do interesse de carreira para o segundo usuário
        Interesse interesseCarreira2 = new Interesse(tituloCarreira2, descricaoCarreira2, 'C', usuario2);     
        System.out.println("\nInteresse \"" + interesseCarreira2.getTitulo() +
        "\" adicionado com sucesso ao usuário " + usuario2.getNome());
        
        // Solicitação de dados através do teclado para criação do interesse pessoal do segundo usuário
        System.out.println("\n\nPara prosseguir adicione um novo Interesse Pessoal ao usuário " + usuario2.getNome() + ".");
        String tituloPessoal2 = Teclado.leString("Dê um Título ao novo Interesse Pessoal: ");
        String descricaoPessoal2 = Teclado.leString("Descreva com suas palavras esse Interesse: ");
        
        // Criação do interesse pessoal para o segundo usuário
        Interesse interessePessoal2 = new Interesse(tituloPessoal2, descricaoPessoal2, 'P', usuario2);     
        System.out.println("\nInteresse \"" + interessePessoal2.getTitulo() +
        "\" adicionado com sucesso ao usuário " + usuario2.getNome() + ".");
        
        
        // Solicitação de dados através do teclado para atualização das senhas dos dois usuários
        System.out.println("\n\n******************** Atualização de Senhas       ********************");
        
        String senha1 = Teclado.leString("Crie uma Senha para o usuário " + usuario1.getNome() + ": ");
        usuario1.setSenha(senha1);
        System.out.println("Senha do usuário " + usuario1.getNome() + " atualizada com sucesso para " + usuario1.getSenha() + ".");
        
        String senha2 = Teclado.leString("Crie uma Senha para o usuário " + usuario2.getNome() + ": ");
        usuario2.setSenha(senha2);
        System.out.println("Senha do usuário " + usuario2.getNome() + " atualizada com sucesso para " + usuario2.getSenha() + ".");
        
        
        // Exibição dos dados na tela
        System.out.println("\n\n******************** Resumo dos Usuários criados ********************");
        
        System.out.println("\nDados do usuário " + usuario1.getNome() + ":");
        usuario1.exibeDados();
        
        System.out.println("\nDados dos Interesses do usuário " + usuario1.getNome() + ":");
        interesseCarreira1.exibeDados();
        System.out.print("\n");
        interessePessoal1.exibeDados();
        
        System.out.println("\nDados do usuário " + usuario2.getNome() + ":");
        usuario2.exibeDados();
        
        System.out.println("\nDados dos Interesses do usuário " + usuario2.getNome() + ":");
        interesseCarreira2.exibeDados();
        System.out.print("\n");
        interessePessoal2.exibeDados();
        
        
        // Modificação do título e da descrição do interesse pessoal do primeiro usuário
        interessePessoal1.setTitulo("Jogar Videogame");
        interessePessoal1.setDescricao("Interesse em jogos como Mass Effect, Zelda, Super Mario, Undertale, Watch Dogs e outos.");
        
        // Exibir novamente os dados do interesse modificado na tela
        System.out.printf("\nNOTIFICAÇÃO: O Interesse \"%s\"do usuário %s foi modificado: \n",
            interessePessoal1.getTitulo(),
            interessePessoal1.getUsuario());
        interessePessoal1.exibeDados();
        
    }
}

/*

 * 
 */