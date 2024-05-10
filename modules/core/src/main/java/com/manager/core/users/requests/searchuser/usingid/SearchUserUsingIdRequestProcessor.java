package com.manager.core.users.requests.searchuser.usingid;

import com.manager.common.infraestructure.messaging.RequestProcessor;
import com.manager.core.users.requests.searchuser.SearchEmployeeItem;

public class SearchUserUsingIdRequestProcessor
        implements RequestProcessor<SearchUserUsingIdRequest, SearchEmployeeItem> {

    @Override
    public SearchEmployeeItem process(SearchUserUsingIdRequest query) {
        return null;
    }
}
