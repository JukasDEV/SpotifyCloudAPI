package Models;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String image;

    @Column
    private Integer[] musics;
}