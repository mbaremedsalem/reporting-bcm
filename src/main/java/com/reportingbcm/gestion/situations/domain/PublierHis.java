package com.reportingbcm.gestion.situations.domain;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bcm_publie_his")
public class PublierHis {
    @Id
    @SequenceGenerator(name = "bcm_publie_his_seq", sequenceName = "bcm_publie_his_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bcm_publie_his_seq")
    private long id;
    private LocalDateTime datePublication;
    private String situation;
    private String status;

}
