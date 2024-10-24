public class App
{
    public static void main(String[] args) throws Exception
    {
        Fila fila = new Fila();
        fila.enfileirar("Caio");
        fila.enfileirar("Cezar");
        fila.enfileirar("Ribeiro");
        fila.enfileirar("Baltazar");

        System.out.println(fila);

        fila.desenfileirar();

        fila.enfileirar("Menote");

        System.out.println(fila);

        fila.enfileirar("Luis");
        System.out.println(fila.head());
        System.out.println(fila.size());
        System.out.println(fila);
    }
}
