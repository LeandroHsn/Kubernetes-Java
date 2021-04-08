package one.digitalinnovation.web.KubernetesJava.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.*;

@Entity

@Getter @Setter @AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private LocalDate birthDate;

    public User(@NotNull String name, @NotNull LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

}
