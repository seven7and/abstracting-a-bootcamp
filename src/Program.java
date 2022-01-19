import application.Curso;

public class Program {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de abstração Java.");
        curso1.setDescricao("Neste Curso você aprenderá tecnicas de abstração!\nPra focar no que realmente importa. ");
        curso1.setCargaHoraria(13);

        Curso curso2 = new Curso();
        curso2.setTitulo("Mentoria WebHook!");
        curso2.setDescricao("Venha aprender as melhores práticas para facilitar seu trabalho com webhooks");
        curso2.setCargaHoraria(2);

        System.out.println(curso1);
        System.out.println(curso2);

    }
}
