package dao;

import entities.Cpu;

import java.util.List;

public interface CpuDao {
    void add(Cpu about);
    void udate(Cpu about);
    Cpu get(int id);
    List<Cpu> getAll();
}
