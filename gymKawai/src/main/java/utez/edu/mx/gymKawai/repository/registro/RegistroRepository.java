package utez.edu.mx.gymKawai.repository.registro;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.gymKawai.model.registro.Registro;

import java.util.List;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {

    List<Registro> findByContratoId(Long idContrato);
}