package unioeste.geral.receitamedica.bo.crm;

import java.io.Serializable;

public class CRM implements Serializable {

    private String crm;

    public CRM() {

    }

    public CRM(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
