import application.Bootcamp;
import application.Curso;
import application.Dev;
import application.Mentoria;

public class Program {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de abstração Java.");
        curso1.setDescricao("Neste Curso você aprenderá tecnicas de abstração!");
        curso1.setCargaHoraria(13);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Webhook!");
        curso2.setDescricao("Venha aprender as melhores práticas para facilitar seu trabalho com webhooks");
        curso2.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Para aqueles que não conseguem usar a própria cabeça, iremos lhe ensinar.");

        System.out.println(curso1);
        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Melhores Práticas em Java.");
        bootcamp.setDescricao("Aprendendo a ser um Java Developer.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnd = new Dev();
        devAnd.setNome("Anderson");
        devAnd.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+ devAnd.getConteudosInscritos());

        Dev devGus = new Dev();
        devGus.setNome("Gustavo");
        devGus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos "+ devGus.getConteudosInscritos());

    }
}
