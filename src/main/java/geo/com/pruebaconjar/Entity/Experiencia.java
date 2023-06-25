package geo.com.pruebaconjar.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "La cantidad de caracteres es erronea" )
    private String empresa;

    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String url_foto_empresa;

    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String descripcion;

    @NotNull
    @Size(min = 1, max = 10, message = "La cantidad de caracteres es erronea" )
    private String fecha_inicio;

    @NotNull
    @Size(min = 1, max = 10, message = "La cantidad de caracteres es erronea" )
    private String fecha_final;

}
