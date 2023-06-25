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
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    private Integer porcentaje;


    @NotNull
    @Size(min = 1, max = 50, message = "La cantidad de caracteres es erronea")
    private String subtitulo;

    @NotNull
    @Size(min = 1, max = 30, message = "La cantidad de caracteres es erronea")
    private String color_inner;

    @NotNull
    @Size(min = 1, max = 30, message = "La cantidad de caracteres es erronea")
    private String color_outer;

}

