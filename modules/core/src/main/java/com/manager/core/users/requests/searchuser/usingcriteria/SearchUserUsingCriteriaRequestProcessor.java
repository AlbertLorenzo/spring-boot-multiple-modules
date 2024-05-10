package com.manager.core.users.requests.searchuser.usingcriteria;

import com.manager.common.infraestructure.messaging.RequestProcessor;
import com.manager.core.users.requests.searchuser.SearchEmployeeItem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public final class SearchUserUsingCriteriaRequestProcessor
        implements RequestProcessor<SearchUserUsingCriteriaRequest, List<SearchEmployeeItem>> {
    
    @Override
    public List<SearchEmployeeItem> process(SearchUserUsingCriteriaRequest query) {
        final List<SearchEmployeeItem> items = null;


        return items;
    }
}
