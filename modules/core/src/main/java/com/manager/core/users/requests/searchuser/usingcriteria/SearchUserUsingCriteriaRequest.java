package com.manager.core.users.requests.searchuser.usingcriteria;

import com.manager.common.infraestructure.messaging.Request;
import com.manager.core.users.requests.searchuser.SearchEmployeeItem;
import jakarta.annotation.Nonnull;

import java.util.List;

public record SearchUserUsingCriteriaRequest(
        @Nonnull String criteria) implements Request<List<SearchEmployeeItem>> {
}
