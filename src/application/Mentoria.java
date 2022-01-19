package application;

public class Mentoria extends Conteudo {
    private int cargaHoraria;

    public Mentoria() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + getTitulo() + '\'' +
                ", description='" + getDescricao() + '\'' +
                ", workLoad=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
}
