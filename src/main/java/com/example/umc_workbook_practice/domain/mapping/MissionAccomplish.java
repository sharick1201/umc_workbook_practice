package com.example.umc_workbook_practice.domain.mapping;

import com.example.umc_workbook_practice.domain.Member;
import com.example.umc_workbook_practice.domain.Mission;
import com.example.umc_workbook_practice.domain.common.BaseEntity;
import com.example.umc_workbook_practice.domain.enums.MissionStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MissionAccomplish extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15)")
    private MissionStatus missionStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

}
