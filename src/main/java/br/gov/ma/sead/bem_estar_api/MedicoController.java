package br.gov.ma.sead.bem_estar_api;

import br.gov.ma.sead.bem_estar_api.medico.DadosCadastroMedidcos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedidcos dados){
        System.out.println(dados);

    }
}
