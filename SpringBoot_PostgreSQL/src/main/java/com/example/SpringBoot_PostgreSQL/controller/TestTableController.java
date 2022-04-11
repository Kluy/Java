package com.example.SpringBoot_PostgreSQL.controller;

import com.example.SpringBoot_PostgreSQL.entity.TestTable;
import com.example.SpringBoot_PostgreSQL.service.TestTableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class TestTableController {

    private final TestTableService testTableService;

    @GetMapping("/find")
    public List<TestTable> findAll(@RequestParam String kolumna) {
        return testTableService.findAll(kolumna);
    }

}
