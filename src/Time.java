public class Time {

    public String nome;
    public int pontuacao;
    public int saldoDeGol;
    public int golTime1;
    public int golTime2;


    public Time(String nome){
        this.nome = nome;
        this.saldoDeGol = 0;
        this.pontuacao = 0;
    }

    public Time(int golTime1, int golTime2){
        this.golTime1 = golTime1;
        this.golTime2 = golTime2;
    }

    public String getnome(){
        return nome;
    }

    public int getPontuacao(){
        return pontuacao;
    }
    
    public int setPontuacao(){
              return pontuacao;
    }
    
    public int getsaldoDeGol(){
        return saldoDeGol;
    }
    
    public int setsaldoDeGol(){
        return saldoDeGol;
    }


}
