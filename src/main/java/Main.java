import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso PHP");
        curso2.setDescricao("descrição curso PHP");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosInscritos());
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Julia:" + devJulia.getConteudosConcluidos());
        System.out.println("XP:" + devJulia.calcularTotalXp());

        System.out.println("-------");

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Guilherme:" + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Guilherme:" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP:" + devGuilherme.calcularTotalXp());

    }

}