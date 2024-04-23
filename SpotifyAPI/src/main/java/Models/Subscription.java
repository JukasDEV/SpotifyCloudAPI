package Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Subscription {

    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id;

    @Column
    private Integer userId;

    @Column
    private Integer planId;

    @Column
    private String status;
}