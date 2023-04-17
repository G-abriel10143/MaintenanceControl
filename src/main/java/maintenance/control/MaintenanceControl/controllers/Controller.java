package package maintenance.control.MaintenanceControl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.maintenance.control.models.Busca;
import br.com.fiap.maintenance.control.repository.Procura;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProcuraController {

    Logger log = LoggerFactory.getLogger(ProcuraController.class);

    List<Procura> Procura = new ArrayList<>();

    @AutoWired
    ProcuraRepository procuraRepository;

    @GetMapping("/api/Procura/detalhes/")
    public ResponseEntity<Procura> show(@PathVariable Long id_empresa) {
        log.info("buscando data marcada com id " + id_empresa);
        var dataEncontrada = Procura.stream().filter(d -> d.getid_empresa().equals(id_empresa)).findFirst();

        if (dataEncontrada.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(dataEncontrada.get());

    }

    @GetMapping("/api/datasMarcadas")
    public Page<Procura> index(@RequestParam(required = false) String marca, @PageableDefault(size = 5) Pageable pageable) {
        if (marca == null) return procuraRepository.findAll(pageable);
        return procuraRepository.;
    }

    @PostMapping("/api/Procura/cadastrar/")
    public ResponseEntity<Procura> create(@RequestBody Procura Procura) {
        log.info("cadastrando dataMarcada: " + Procura);
        Procura.setid_empresa(Procura.size() + 1l);
        Procura.add(Procura);
        return ResponseEntity.status(HttpStatus.CREATED).body(Procura);
    }

    @DeleteMapping("/api/datasMarcadas/apagar/")
    public ResponseEntity<Procura> destroy(@PathVariable Long id_empresa) {
        log.info("apagando data marcada com id " + idE);
        var dataEncontrada = Procura.stream().filter(d -> d.getid_empresa().equals(id_empresa)).findFirst();

        if (dataEncontrada.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        Procura.remove(dataEncontrada.get());

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }

    @PutMapping("/api/dataMarcada/atualizar/")
    public ResponseEntity<Procura> update(@PathVariable Long id_empresa, @RequestBody Procura Procura) {
        log.info("alterando dataMarcada com id " + id_empresa);
        var dataEncontrada = Procura.stream().filter(d -> d.getid_empresa().equals(id_empresa)).findFirst();

        if (Encontrdaraada.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        Procura.remove(dataEncontrada.get());
        data.setid_empresa(id_empresa);
        Procura.add(Procura);

        return ResponseEntity.ok(data);

        @PutMapping("/api/dataMarcada/atualizar/")
        public ResponseEntity<Procura> update(@PathVariable Long id_empresa, @RequestBody Procura Procura) {
            log.info("alterando data com id " + id_empresa);
            var dataEmcontrada = repository.findById(id_empresa) ;
    
            if (dataEmcontrada.isEmpty())
                return ResponseEntity.notFound().build();
    
            
            data.setId(id_empresa);
    
            data.save(id_empresa);
    
            return ResponseEntity.ok(reserva);
    
        }
    
    }
