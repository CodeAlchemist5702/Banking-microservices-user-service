package com.bank.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
// @data of lombok reduces boilerplate code for creating getter,setter,tostring,hashcode
@Entity(name="user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
//The @Builder annotation in Spring Boot simplifies object creation and improves code readability. It generates a builder class that provides a fluent interface for setting object values
@Table(name="user",
        uniqueConstraints = {
        @UniqueConstraint(
                name="emailId_unique",
                columnNames = "email_address"
        ),
        @UniqueConstraint(
                name="username_unique",
                columnNames = "user_name"
                ),
        @UniqueConstraint(
                name="phoneno_unique",
                columnNames = "user_mobilenumber"
                )

}
)
public class User {
    @Id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
   private Long id;
    @Column(name="user_name",
            nullable = false
    )
   private String userName;
    @Column(name="email_address",
            nullable = false
     )
   private String email;
    @Column(name="user_password",
            nullable = false
    )
   private String password;
    @Column(name="user_fullname",
            nullable = false
    )
   private String fullName;
    @Column(name="user_mobilenumber")
   private String phoneNumber;
    @Column(name = "created_at")
   private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name="is_active")
    private boolean isActive;
   @Embedded
   private Address address;



}
