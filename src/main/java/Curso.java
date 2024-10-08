import lombok.*;

@Getter @Setter
public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() { return XP_PADRAO * cargaHoraria; }

    public Curso() {}

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}