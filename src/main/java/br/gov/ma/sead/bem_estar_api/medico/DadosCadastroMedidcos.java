package br.gov.ma.sead.bem_estar_api.medico;

import br.gov.ma.sead.bem_estar_api.endereco.DadosEndereco;
import br.gov.ma.sead.bem_estar_api.endereco.Endereco;

public record DadosCadastroMedidcos(String nome, String email, String crm, Especialidade especialidade,
                                    DadosEndereco endereco) {
}
