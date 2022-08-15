package io.bootify.my_app_test.repos;

import io.bootify.my_app_test.domain.Import629;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Import629Repository extends JpaRepository<Import629, UUID> {

    Page<Import629> findAll(Pageable pageable);
}
