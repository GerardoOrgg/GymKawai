package utez.edu.mx.gymKawai.model.contrato;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import utez.edu.mx.gymKawai.model.plan.PlanMensual;
import utez.edu.mx.gymKawai.model.usuario.Usuario;

import java.time.LocalDate;

@Entity
@Table(name = "contrato")
@Getter
@Setter
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_plan", nullable = false)
    private PlanMensual plan;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado;
}