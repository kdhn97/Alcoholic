package com.scheduler.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Builder
public class League {
    @Id
    @Column(name = "league_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name = "league_created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "league_rank", nullable = false)
    private Integer rank;

    @Column(name = "league_num", nullable = false)
    private Integer num;

    public void updateRank(int i) {
        this.rank = i;
    }
}
