package br.gov.ma.sead.bem_estar_api.medico;

import br.gov.ma.sead.bem_estar_api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedicos(
        @NotBlank
        String nome,
        @NotBlank
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotBlank
        String telefone,
        @NotBlank
        Especialidade especialidade,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}
