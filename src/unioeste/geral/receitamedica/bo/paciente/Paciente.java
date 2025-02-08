package unioeste.geral.receitamedica.bo.paciente;


import unioeste.geral.endereco.bo.enderecoespecifico.EnderecoEspecifico;
import unioeste.geral.pessoa.bo.cpf.CPF;
import unioeste.geral.pessoa.bo.email.Email;
import unioeste.geral.pessoa.bo.pessoafisica.PessoaFisica;
import unioeste.geral.pessoa.bo.sexo.Sexo;
import unioeste.geral.pessoa.bo.telefone.Telefone;

import java.io.Serializable;
import java.util.List;

public class Paciente extends PessoaFisica implements Serializable {

    public Paciente() {
    }

    public Paciente(Long id, String nome, EnderecoEspecifico enderecoEspecifico, List<Telefone> telefones, List<Email> emails, String primeiroNome, String nomeMeio, String ultimoNome, Sexo sexo, CPF cpf) {
        super(id, nome, enderecoEspecifico, telefones, emails, primeiroNome, nomeMeio, ultimoNome, sexo, cpf);
    }

}
