import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("A Volta Dos que Não Foram", 1999);
        Serie Catatau = new Serie("Catatau", 1999);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDosGuri = new Filme("Ze da goela frouxa", 2003);

        ArrayList<Titulos> lista = new ArrayList<>();
        lista.add(filmeDosGuri);
        lista.add(outroFilme);
        lista.add(favorito);
        lista.add(Catatau);

        for(Titulos item: lista){
            System.out.println(item);
        }
    }
}
