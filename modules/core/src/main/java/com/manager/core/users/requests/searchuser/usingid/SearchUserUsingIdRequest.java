package com.manager.core.users.requests.searchuser.usingid;

import com.manager.common.infraestructure.messaging.Request;
import com.manager.core.users.requests.searchuser.SearchEmployeeItem;

import java.util.UUID;

public record SearchUserUsingIdRequest(UUID id) implements Request<SearchEmployeeItem> {
}
