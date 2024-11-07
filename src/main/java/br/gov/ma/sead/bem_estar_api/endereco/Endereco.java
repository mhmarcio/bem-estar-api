package br.gov.ma.sead.bem_estar_api.endereco;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    @Column(name = "tbm_logradouro")
    private String logradouro;
    @Column(name = "tbm_bairro")
    private String bairro;
    @Column(name = "tbm_cep")
    private String cep;
    @Column(name = "tbm_numero")
    private String numero;
    @Column(name = "tbm_complemento")
    private String complemento;
    @Column(name = "tbm_cidade")
    private String cidade;
    @Column(name = "tbm_uf")
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }
}
