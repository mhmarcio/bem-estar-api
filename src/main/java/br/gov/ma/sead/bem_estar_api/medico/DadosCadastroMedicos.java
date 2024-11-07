package br.gov.ma.sead.bem_estar_api.medico;

import br.gov.ma.sead.bem_estar_api.endereco.DadosEndereco;

public record DadosCadastroMedicos(
        String nome,
        String email,
        String crm,
        String telefone,
        Especialidade especialidade,
        DadosEndereco endereco) {
}
