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
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 100, message = "La cantidad de caracteres es erronea" )
    private String nombre_proyecto;

    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String descripcion_proyecto;

    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String url_foto_proyecto;

    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String url_direccion_proyecto;

}

