package pe.edu.cibertec.spring_mvc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer languageId;
    private String name;
    private Date lasUpdate;

    @OneToMany(mappedBy = "language")
    private List<Film>film;

}
