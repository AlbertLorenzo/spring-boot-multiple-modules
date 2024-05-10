package com.manager.core.users.requests.searchuser;

import java.io.Serializable;
import java.util.UUID;

public record SearchEmployeeItem(Employee fullName) implements Serializable {

    public record Employee(String fullName) {
        public static Employee of(UUID id, String firstName, String lastName) {
            return (id == null) ? null : new Employee(firstName + ", " + lastName);
        }
    }

}
