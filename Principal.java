import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme("A Volta Dos que Não Foram", 1999);

        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        Serie Catatau = new Serie("Catatau", 1999);
        //Catatau.setNome("Catatau");
        //Catatau.setAnoDeLancamento(1999);
        Catatau.setDuracaoEmMinutos(70);
        Catatau.exibeFichaTecnica();

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());


        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(outroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Catatau);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDosGuri = new Filme("Ze da goela frouxa", 2003);
        filmeDosGuri.setDuracaoEmMinutos(200);
        filmeDosGuri.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDosGuri);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(favorito);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        ArrayList<String> BuscaPorArtista = new ArrayList<>();
        BuscaPorArtista.add("Catatau");
        BuscaPorArtista.add("Adenor");
        BuscaPorArtista.add("Gonas");
        System.out.println(BuscaPorArtista);

        Collections.sort(BuscaPorArtista); // Ordem alfabetica
        System.out.println("Depois");
        System.out.println(BuscaPorArtista);
    }

}