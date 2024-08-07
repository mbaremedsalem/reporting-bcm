package com.reportingbcm.gestion.situations.domain;


import com.reportingbcm.gestion.situations.enums.StatusEnum;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bcm_publie")
public class Publier {
    @Id
    @SequenceGenerator(name = "bcm_publie_seq", sequenceName = "bcm_publie_seq",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bcm_publie_seq")
    private long id;
    private String situation;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    //private Date datePublication;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
