package utez.edu.mx.gymKawai.model.plan;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "plan_mensual")
@Getter
@Setter
public class PlanMensual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plan")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "precio_mensual", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioMensual;

    @Column(name = "meses", nullable = false)
    private Integer meses;

    @Column(name = "activo", nullable = false)
    private boolean activo = true;
}