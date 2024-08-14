import lombok.*;

import java.time.LocalDate;

@Getter @Setter @ToString
public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp() { return XP_PADRAO + 20d; }

    public Mentoria() {}


}