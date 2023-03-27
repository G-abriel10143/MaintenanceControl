package maintenance.control.MaintenanceControl.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.fiap.MaintenanceControl.models.Reserva;

public interface Marcar extends JpaRepository<Marcar, Long>{
    
}