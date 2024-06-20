public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        String sinopse = """
                Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, 
                Pete 'Maverick Mitchell' está de volta, rompendo os limites como um piloto de testes corajoso.
                No mundo contemporâneo das guerras tecnológicas, Maverick enfrenta drones e prova que o fator 
                humano ainda é essencial."
                """;
        int ano = 2022, classificação;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1, mediaDoFilme = (9.8+6.3+8.8)/3;
        classificação = (int) (mediaDoFilme/2);
        String nomeDoFilme = "Top Gun: Maverick";
        System.out.println(nomeDoFilme+".\n"+"Ano de lançamento:"+ano+"\n Média das notas"+mediaDoFilme+"\n"+sinopse);

    }
}
