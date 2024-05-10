package com.manager.core.users.search;

import com.manager.core.users.actions.domain.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeachUserByGroup {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Sql(
            scripts = {"/import_senior_employees.sql"},
            config = @SqlConfig(encoding = "utf-8", transactionMode = SqlConfig.TransactionMode.ISOLATED))
    public void testLoadDataForTestCase() {
        assertEquals(5, userRepository.findAll().size());
    }
}
