package unioeste.geral.receitamedica.bo.diagnosticocid;

import java.io.Serializable;

public class DiagnosticoCID implements Serializable {

    private String codigo;
    private String descricao;

    public DiagnosticoCID() {
    }

    public DiagnosticoCID(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
