package unioeste.geral.receitamedica.bo.medicamentoreceitamedica;

import unioeste.geral.receitamedica.bo.medicamento.Medicamento;

import java.io.Serializable;
import java.time.LocalDate;

public class MedicamentoReceitaMedica implements Serializable {

    private Long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String posologia;
    private Medicamento medicamento;

    public MedicamentoReceitaMedica() {
    }

    public MedicamentoReceitaMedica(Long id, LocalDate dataInicio, LocalDate dataFim, String posologia, Medicamento medicamento) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.posologia = posologia;
        this.medicamento = medicamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
