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
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "La cantidad de caracteres es erronea" )
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "La cantidad de caracteres es erronea" )
    private String apellido;


    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String url_foto;

    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String sobre_mi;

    @NotNull
    @Size(min = 1, max = 50, message = "La cantidad de caracteres es erronea" )
    private String correo;


}