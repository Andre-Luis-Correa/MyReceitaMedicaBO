package unioeste.geral.receitamedica.bo.medico;

import unioeste.geral.endereco.bo.enderecoespecifico.EnderecoEspecifico;
import unioeste.geral.pessoa.bo.cpf.CPF;
import unioeste.geral.pessoa.bo.email.Email;
import unioeste.geral.pessoa.bo.pessoafisica.PessoaFisica;
import unioeste.geral.pessoa.bo.sexo.Sexo;
import unioeste.geral.pessoa.bo.telefone.Telefone;
import unioeste.geral.receitamedica.bo.crm.CRM;

import java.io.Serializable;
import java.util.List;

public class Medico extends PessoaFisica implements Serializable {

    private CRM crm;

    public Medico() {
    }

    public Medico(Long id, String nome, EnderecoEspecifico enderecoEspecifico, List<Telefone> telefones, List<Email> emails, String primeiroNome, String nomeMeio, String ultimoNome, Sexo sexo, CPF cpf, CRM crm) {
        super(id, nome, enderecoEspecifico, telefones, emails, primeiroNome, nomeMeio, ultimoNome, sexo, cpf);
        this.crm = crm;
    }

    public CRM getCrm() {
        return crm;
    }

    public void setCrm(CRM crm) {
        this.crm = crm;
    }
}
