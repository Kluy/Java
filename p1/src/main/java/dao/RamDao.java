package dao;

import entities.Ram;

import java.util.List;

public interface RamDao {
    void add(Ram about);
    void udate(Ram about);
    Ram get(int id);
    List<Ram> getAll();
}
