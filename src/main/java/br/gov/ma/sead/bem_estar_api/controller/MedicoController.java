package br.gov.ma.sead.bem_estar_api.controller;

import br.gov.ma.sead.bem_estar_api.medico.DadosCadastroMedicos;
import br.gov.ma.sead.bem_estar_api.medico.Medico;
import br.gov.ma.sead.bem_estar_api.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

  @PostMapping
  @Transactional
  public void cadastrar(@RequestBody DadosCadastroMedicos dados){
   repository.save(new Medico(dados));

        }
    }

