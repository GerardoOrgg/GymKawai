package utez.edu.mx.gymKawai.repository.plan;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.gymKawai.model.plan.PlanMensual;

import java.util.List;

@Repository
public interface PlanMensualRepository extends JpaRepository<PlanMensual, Long> {

    List<PlanMensual> findByActivoTrue();
}