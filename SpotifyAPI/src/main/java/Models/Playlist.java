package Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;


@Data
@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer userId;

    @Column
    private Integer[] musics;

}