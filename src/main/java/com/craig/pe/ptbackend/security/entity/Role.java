package com.craig.pe.ptbackend.security.entity;


import com.craig.pe.ptbackend.security.enums.RoleName;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleName rolName;

    public Role(RoleName rolName) {
        this.rolName = rolName;
    }

}
