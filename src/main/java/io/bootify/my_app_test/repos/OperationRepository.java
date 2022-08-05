package io.bootify.my_app_test.repos;

import io.bootify.my_app_test.domain.Operation;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OperationRepository extends JpaRepository<Operation, UUID> {
}
