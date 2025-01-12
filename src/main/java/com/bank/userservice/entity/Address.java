package com.bank.userservice.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "state",
                column = @Column(name="user_state",nullable = false)
        ),
        @AttributeOverride(
                name="city",
                column = @Column(name="user_city",nullable = false)
        ),
        @AttributeOverride(
                name="pincode",
                column = @Column(name="zipcode",nullable = false)
        )
}
)
public class Address {
    private String state;
    private String city;
    private String pincode;
}
