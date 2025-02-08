package unioeste.geral.receitamedica.bo.receitamedica;

import unioeste.geral.receitamedica.bo.diagnosticocid.DiagnosticoCID;
import unioeste.geral.receitamedica.bo.medicamentoreceitamedica.MedicamentoReceitaMedica;
import unioeste.geral.receitamedica.bo.medico.Medico;
import unioeste.geral.receitamedica.bo.paciente.Paciente;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ReceitaMedica implements Serializable {

    private Long id;

    private Integer numero;
    private LocalDate dataEmissao;
    private Medico medico;
    private Paciente paciente;

    private DiagnosticoCID diagnosticoCID;

    private List<MedicamentoReceitaMedica> medicamentoReceitaMedicas;

    public ReceitaMedica() {

    }

    public ReceitaMedica(Long id, Integer numero, LocalDate dataEmissao, Medico medico, Paciente paciente, DiagnosticoCID diagnosticoCID, List<MedicamentoReceitaMedica> medicamentoReceitaMedicas) {
        this.id = id;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.medico = medico;
        this.paciente = paciente;
        this.diagnosticoCID = diagnosticoCID;
        this.medicamentoReceitaMedicas = medicamentoReceitaMedicas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public DiagnosticoCID getDiagnosticoCID() {
        return diagnosticoCID;
    }

    public void setDiagnosticoCID(DiagnosticoCID diagnosticoCID) {
        this.diagnosticoCID = diagnosticoCID;
    }

    public List<MedicamentoReceitaMedica> getMedicamentoReceitaMedicas() {
        return medicamentoReceitaMedicas;
    }

    public void setMedicamentoReceitaMedicas(List<MedicamentoReceitaMedica> medicamentoReceitaMedicas) {
        this.medicamentoReceitaMedicas = medicamentoReceitaMedicas;
    }
}
