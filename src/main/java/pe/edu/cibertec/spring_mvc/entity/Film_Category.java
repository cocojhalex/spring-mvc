package pe.edu.cibertec.spring_mvc.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film_Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer film_id;
    private Integer category_id;
    private Date last_update;

}
