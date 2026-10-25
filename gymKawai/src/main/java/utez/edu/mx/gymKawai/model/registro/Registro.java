package utez.edu.mx.gymKawai.model.registro;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import utez.edu.mx.gymKawai.model.contrato.Contrato;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "registro")
@Getter
@Setter
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_contrato", nullable = false)
    private Contrato contrato;

    @Column(name = "mes_cubierto", nullable = false, length = 30)
    private String mesCubierto;

    @Column(name = "monto_cobrado", nullable = false, precision = 10, scale = 2)
    private BigDecimal montoCobrado;

    @Column(name = "fecha_cobro", nullable = false)
    private LocalDate fechaCobro;

    @Column(name = "forma_pago", nullable = false, length = 30)
    private String formaPago;
}