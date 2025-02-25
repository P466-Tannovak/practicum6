package edu.iu.p466.prime_service.repository;

import java.io.IOException;
import edu.iu.p466.prime_service.model.Customer;

public interface IAuthenticationFileRepository {

    boolean save(Customer customer) throws IOException;

    Customer findByUserName(String username) throws IOException;
}
