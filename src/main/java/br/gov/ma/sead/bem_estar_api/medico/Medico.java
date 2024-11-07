package br.gov.ma.sead.bem_estar_api.medico;

import br.gov.ma.sead.bem_estar_api.endereco.DadosEndereco;
import br.gov.ma.sead.bem_estar_api.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Table(schema = "apl_eatos", name = "tab_medicos")
@SequenceGenerator(name="medico_sequence_generator", schema = "apl_eatos", sequenceName="seq_tab_medicos", allocationSize = 1)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="medico_sequence_generator")
    private Long id;
    @Column(name = "tbm_nome")
    private String nome;
    @Column(name = "tbm_email")
    private String email;
    @Column(name = "tbm_crm")
    private String crm;
    @Column(name = "tbm_telefone")
    private String telefone;
    @Enumerated(EnumType.STRING)
    @Column(name = "tbm_especialidade")
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;


    public Medico(DadosCadastroMedicos dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());

    }
}
