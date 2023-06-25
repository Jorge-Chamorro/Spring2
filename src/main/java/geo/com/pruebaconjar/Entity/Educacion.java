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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 100, message = "La cantidad de caracteres es erronea" )
    private String institucion;

    @NotNull
    @Size(min = 1, max = 100, message = "La cantidad de caracteres es erronea" )
    private String titulo;

    @NotNull
    @Size(min = 1, max = 10, message = "La cantidad de caracteres es erronea" )
    private String fecha_inicio;

    @NotNull
    @Size(min = 1, max = 10, message = "La cantidad de caracteres es erronea" )
    private String fecha_final;

    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String url_titulo;

    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String descripcion;

}

