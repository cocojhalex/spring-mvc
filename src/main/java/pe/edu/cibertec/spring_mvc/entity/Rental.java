package pe.edu.cibertec.spring_mvc.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rental {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer rental_id;
    private Date rental_date;
    private Integer inventory_id;
    private Integer customer_id;
    private Date return_date;
    private Integer staff_id;
    private Date last_update;


}
