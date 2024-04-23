package Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class PlaylistMusics {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @OneToMany
    @JoinColumn(name = "music_id", referencedColumnName = "id")
    private List<Music> musics;
}
