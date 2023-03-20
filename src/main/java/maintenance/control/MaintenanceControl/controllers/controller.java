package package maintenance.control.MaintenanceControl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

package maintenance.control.MaintenanceControl.models;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MarcarController {

    Logger log = LoggerFactory.getLogger(MarcarController.class);

    List<Marcar> Marcar = new ArrayList<>();

    @GetMapping("/api/marcar/detalhes/")
    public ResponseEntity<Marcar> show(@PathVariable Long id_empresa) {
        log.info("buscando data marcada com id " + id_empresa);
        var dataEncontrada = Marcar.stream().filter(d -> d.getid_empresa().equals(id_empresa)).findFirst();

        if (dataEncontrada.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(dataEncontrada.get());

    }

    @GetMapping("/api/datasMarcadas")
    public List<datas> index() {
        return Marcar;
    }

    @PostMapping("/api/marcar/cadastrar/")
    public ResponseEntity<Marcar> create(@RequestBody Marcar marcar) {
        log.info("cadastrando dataMarcada: " + Marcar);
        marcar.setid_empresa(Marcar.size() + 1l);
        Marcar.add(marcar);
        return ResponseEntity.status(HttpStatus.CREATED).body(marcar);
    }

    @DeleteMapping("/api/datasMarcadas/apagar/")
    public ResponseEntity<Marcar> destroy(@PathVariable Long id_empresa) {
        log.info("apagando data marcada com id " + idE);
        var reservaEncontrada = Marcar.stream().filter(d -> d.getid_empresa().equals(id_empresa)).findFirst();

        if (reservaEncontrada.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        Marcar.remove(dataEncontrada.get());

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }

    @PutMapping("/api/dataMarcada/atualizar/")
    public ResponseEntity<Marcar> update(@PathVariable Long id_empresa, @RequestBody Marcar marcar) {
        log.info("alterando dataMarcada com id " + id_empresa);
        var dataEncontrada = Marcar.stream().filter(d -> d.getid_empresa().equals(id_empresa)).findFirst();

        if (Encontrdaraada.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        Marcar.remove(dataEncontrada.get());
        data.setid_empresa(id_empresa);
        Marcar.add(reserva);

        return ResponseEntity.ok(data);

    }

}