package com.scms.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name="complaints")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Complaint {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String status;

    private String priority;

    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}