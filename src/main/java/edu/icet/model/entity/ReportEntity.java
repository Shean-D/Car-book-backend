package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "generated_by", nullable = false, foreignKey = @ForeignKey(name = "fk_report_user"))
    private UserEntity generatedBy;

    @Column(name = "report_type", nullable = false)
    private String reportType;

    @Column(name = "generated_date", nullable = false)
    private String reportDate;

}
