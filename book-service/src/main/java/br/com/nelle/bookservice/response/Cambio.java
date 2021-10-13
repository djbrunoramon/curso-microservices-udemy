package br.com.nelle.bookservice.response;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cambio implements Serializable {

    private Long id;
    private String from;
    private String to;
    private Double conversionFactor;
    private Double convertedValue;
    private String environment;

}
