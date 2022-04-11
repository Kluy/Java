package com.example.SpringBoot_PostgreSQL.repository;

import com.example.SpringBoot_PostgreSQL.entity.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestTableRepository extends JpaRepository<TestTable,Long> {

}
