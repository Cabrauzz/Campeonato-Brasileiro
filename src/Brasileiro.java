
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Brasileiro {

    public static void main(String[] args) {

        ArrayList<Time> lista = new ArrayList<>();
        ArrayList<Tabela> tabela = new ArrayList<>();


        lista.add(new Time("América - MG"));
        lista.add(new Time("Athletico - PR"));
        lista.add(new Time("Atlético - MG"));
        lista.add(new Time("Bahia"));
        lista.add(new Time("Botafogo"));
        lista.add(new Time("Corinthians"));
        lista.add(new Time("Coritiba"));
        lista.add(new Time("Cruzeiro"));
        lista.add(new Time("Cuibá"));
        lista.add(new Time("Flamengo"));
        lista.add(new Time("Fluminense"));
        lista.add(new Time("Fortaleza"));
        lista.add(new Time("Goias"));
        lista.add(new Time("Grêmio"));
        lista.add(new Time("Internacional"));
        lista.add(new Time("Palmeiras"));
        lista.add(new Time("Bragantino"));
        lista.add(new Time("Santos"));
        lista.add(new Time("São Paulo"));
        lista.add(new Time("Vasco da Gama"));
        Brasileiro brasileiro = new Brasileiro();

        for (int i = 1; i <= 1; i++) {
            System.out.println("Rodada: " + i);
            Collections.shuffle(lista);
            System.out.println(lista.get(0).getnome() + " x " + lista.get(1).getnome());
            System.out.println(lista.get(2).getnome() + " x " + lista.get(3).getnome());
            System.out.println(lista.get(4).getnome() + " x " + lista.get(5).getnome());
            System.out.println();
            brasileiro.resultado(lista, tabela);
            brasileiro.atualizarTabela(lista, tabela);
        }
    }
    public void resultado(ArrayList<Time> lista, ArrayList<Tabela> tabela) {
        int count = 0;
        for (int i = 0; i <= 2; i++) {
            if (i == 0) {
                count = 0;
            } else if (i == 1) {
                count = 2;
            } else {
                count = 4;
            }

            System.out.println("Placar: ");
            int golTime1 = new Scanner(System.in).nextInt();
            System.out.println("Gols do: " + lista.get(count).getnome() + ": " + golTime1);
            int golTime2 = new Scanner(System.in).nextInt();
            System.out.println("Gols do: " + lista.get(count + 1).getnome() + ": " + golTime2);
            System.out.println("Resultado do jogo" + (count + 1) + ": " + lista.get(count).getnome()+ " " +
                    golTime1 + " x " + golTime2 + " " + lista.get(count + 1).getnome() + " ");
            System.out.println();

            if (golTime1 > golTime2) {
                lista.get(count).pontuacao += 3;
                lista.get(count).saldoDeGol += golTime1 - golTime2;
                lista.get(count + 1).saldoDeGol += golTime2 - golTime1;

            } else if (golTime1 < golTime2) {
                lista.get(count+1).saldoDeGol += golTime2 - golTime1;
                lista.get(count + 1).pontuacao += 3;
                lista.get(count).saldoDeGol += golTime1 - golTime2;

            } else {
                lista.get(count).pontuacao += 1;
                lista.get(count + 1).pontuacao += 1;
            }

            tabela.add(new Tabela(lista.get(count).nome, lista.get(count).pontuacao, lista.get(count).saldoDeGol));
            tabela.add(new Tabela(lista.get(count + 1).nome, lista.get(count + 1).pontuacao, lista.get(count + 1).saldoDeGol));

        }
    }

    public void atualizarTabela(ArrayList<Time> lista, ArrayList<Tabela> tabela) {
        int timeAux;
        for (int i = tabela.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tabela.get(j).pontuacao > tabela.get(j + 1).pontuacao) {
                    timeAux = tabela.get(j).getPontuacao();
                    tabela.get(j).saldoDeGol = tabela.get(j + 1).saldoDeGol;
                    tabela.get(j + 1).saldoDeGol = timeAux;

                } else if (tabela.get(j).pontuacao == tabela.get(j + 1).pontuacao && tabela.get(j).saldoDeGol > tabela.get(j + 1).saldoDeGol) {
                    timeAux = tabela.get(j).getsaldoDeGol();
                    tabela.get(j).saldoDeGol = tabela.get(j + 1).saldoDeGol;
                    tabela.get(j + 1).saldoDeGol = timeAux;
                }
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Brasileirão 2023");
        for(int x = 0; x<6; x++){
            System.out.println(tabela.get(x).nome + " |Pontos| " + tabela.get(x).pontuacao + " |Saldo| " + tabela.get(x).saldoDeGol);
        }
    }
}
