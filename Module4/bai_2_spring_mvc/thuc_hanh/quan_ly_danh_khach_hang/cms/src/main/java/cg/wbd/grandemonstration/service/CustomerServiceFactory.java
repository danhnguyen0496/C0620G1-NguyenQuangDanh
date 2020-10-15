package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.service.impl.SimpleCustomerServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceFactory {
    private static CustomerService singleton;

    public static synchronized CustomerService getInstance() {
        if (singleton == null) {
            singleton = new SimpleCustomerServiceImpl();
        }
        return singleton;
    }
}
