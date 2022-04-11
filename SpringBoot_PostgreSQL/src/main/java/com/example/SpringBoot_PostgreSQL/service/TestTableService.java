package com.example.SpringBoot_PostgreSQL.service;

import com.example.SpringBoot_PostgreSQL.entity.TestTable;
import com.example.SpringBoot_PostgreSQL.repository.TestTableRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class TestTableService {

    @Autowired
    private final TestTableRepository testTableRepository;

    public void createTestTable(TestTable testTable) {
        testTableRepository.save(testTable);
    }

    public List<TestTable> findAll(String kolumna){
        List<TestTable> testTables = testTableRepository.findAll();
        List<TestTable> testTables2 = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();

        switch (kolumna){
            case "kolumna1":
                for(int i = 1; i < testTables.size(); i++){
                    map.put(i,testTables.get(i).getKolumna1());
                }
                break;
            case "kolumna2":
                for(int i = 1; i < testTables.size(); i++){
                    map.put(i,testTables.get(i).getKolumna2());
                }
                break;
            case "kolumna3":
                for(int i = 1; i < testTables.size(); i++){
                    map.put(i,testTables.get(i).getKolumna3());
                }
                break;
            case "kolumna4":
                for(int i = 1; i < testTables.size(); i++){
                    map.put(i,testTables.get(i).getKolumna4().toString());
                }
                break;
        }

        for (Map.Entry<Integer, String> entry:map.entrySet())  {
            if(Collections.frequency(map.values(),entry.getValue()) > 1)
                testTables2.add(testTables.get(entry.getKey()));
        }

        return testTables2;
    }

}
