package com.arthur.venue_api.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_FOTO_FEED")
@Data
public class FotoFeed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "foto", length = 255)
    private String foto;

    @ManyToOne
    @JoinColumn(name = "id_local", nullable = false)
    private Local local;

    @CreationTimestamp
    @Column(name = "data_foto", nullable = false, updatable = false)
    private LocalDateTime datafoto;
}
