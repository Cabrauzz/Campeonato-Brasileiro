public class Tabela {

    public int pontuacao;
    public String nome;
    public int saldoDeGol;

    public Tabela(String nome, int pontuacao, int saldoDeGol){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.saldoDeGol = saldoDeGol;
    }


    public int getPontuacao(){
        return pontuacao;
    }

    public void setPontuacao(int pontuacao){
       this.pontuacao = pontuacao;
    }


    public int getsaldoDeGol() {
        return saldoDeGol;
    }

    public void setSaldoDeGol(int saldoDeGol) {
        this.saldoDeGol = saldoDeGol;
    }
}
