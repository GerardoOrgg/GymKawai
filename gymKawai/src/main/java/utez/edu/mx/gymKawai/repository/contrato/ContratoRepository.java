package utez.edu.mx.gymKawai.repository.contrato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.gymKawai.model.contrato.Contrato;

import java.util.List;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {

    List<Contrato> findByUsuarioId(Long idUsuario);

    List<Contrato> findByPlanId(Long idPlan);

    List<Contrato> findByEstado(String estado);
}