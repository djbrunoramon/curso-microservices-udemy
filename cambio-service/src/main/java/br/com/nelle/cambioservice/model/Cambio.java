package br.com.nelle.cambioservice.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name = "cambio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cambio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "from_currency", nullable = false, length = 3)
    private String from;
    @Column(name = "to_currency", nullable = false, length = 3)
    private String to;
    @Column(nullable = false)
    private BigDecimal conversionFactor;
    @Transient
    private BigDecimal convertedValue;
    @Transient
    private String environment;

}
