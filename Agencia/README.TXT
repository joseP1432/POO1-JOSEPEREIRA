----------------------------------------------------------------------------
Este é o arquivo README do projeto. Você deve descrever aqui o seu projeto.
Informe ao usuário (alguém que não sabe nada sobre este projeto!) tudo que
ele/ela precisa saber. Os comentários devem incluir, pelo menos:
------------------------------------------------------------------------

TITULO DO PROJETO:
OBJETIVO DO PROJETO:
VERSÃO ou DATA:
COMO INICIAR O PROJETO:
AUTORES:
INSTRUÇÕES PARA O USUÁRIO:



class Agencia{
    public List<ContaCorrente> veaco(){
        return contas.stream().filter(c->c.devedor()).collect(Collectors.toList());
    }
}