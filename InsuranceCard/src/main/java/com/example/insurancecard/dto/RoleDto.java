package com.example.insurancecard.dto;

import com.example.insurancecard.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto {
        private int id;
        private String name;

        public RoleDto() {

        }

        public RoleDto(Role role){
                if (null != role){
                        this.setId(role.getId());
                        this.setName(role.getName());
                }
        }
}
