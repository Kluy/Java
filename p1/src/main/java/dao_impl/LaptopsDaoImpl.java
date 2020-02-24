package dao_impl;

import dao.LaptopsDao;
import entities.Laptops;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LaptopsDaoImpl implements LaptopsDao {
    private static final String SQL_INSERT = "insert into laptops (model, company_name, price, quantity,\n" +
            " ram, memory, cpu, screen_resolution, battery_life) values\n" +
            "(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE laptops SET price=? WHERE id = ?";
    private static final String SQL_GET = "SELECT * FROM laptops WHERE company_name = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM laptops WHERE id = ?";
    private static final String SQL_GET_ALL = "select laptops.id," +
            "laptops.model, company_name.company_name," +
            " laptops.price, laptops.quantity,\n" +
            "ram.size, memory.size, cpu.size,\n" +
            "screen_resolution.size, battery_life.size from laptops\n" +
            "join ram on laptops.ram = ram.id\n" +
            " join cpu on laptops.cpu = cpu.id\n" +
            " join company_name on laptops.company_name = company_name.id\n" +
            " join memory on laptops.memory = memory.id\n" +
            " join battery_life on laptops.battery_life = battery_life.id\n" +
            " join screen_resolution on laptops.screen_resolution = screen_resolution.id";
    Connection connection;

    public LaptopsDaoImpl() {
        this.connection = ConnectionUtil.getConnection();
    }

    @Override
    public void add(Laptops laptops) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, laptops.getModel());
            statement.setString(2, laptops.getCompanyName());
            statement.setInt(3, laptops.getPrice());
            statement.setInt(4, laptops.getQuantity());
            statement.setString(5, laptops.getRam());
            statement.setString(6, laptops.getMemory());
            statement.setString(7, laptops.getCpu());
            statement.setString(8, laptops.getResolution());
            statement.setString(9, laptops.getBatteryLife());
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void upate(Laptops laptops) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL_UPDATE);
                    preparedStatement.setInt(1, laptops.getPrice());
                    preparedStatement.setInt(2, laptops.getId());
                    preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Laptops get(int id) {
        Laptops laptop = null;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_GET_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                int idGet = rs.getInt("id");
                String model = rs.getString("model");
                laptop = new Laptops(idGet, model);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return laptop;
    }

    @Override
    public Laptops getModel(int id) {
        Laptops laptop = null;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_GET);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int idGet = rs.getInt("id");
                String model = rs.getString("model");
                laptop = new Laptops(idGet, model);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return laptop;
    }

    @Override
    public List<Laptops> getAll() {
        List<Laptops> laptopList = new ArrayList<>();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL_GET_ALL);

            while(rs.next()){
                int id = rs.getInt(1);
                String model = rs.getString(2);
                String companyName = rs.getString(3);
                int price = rs.getInt(4);
                int quantity = rs.getInt(5);
                String ram = rs.getString(6);
                String memory = rs.getString(7);
                String cpu = rs.getString(8);
                String resolution = rs.getString(9);
                String bLife = rs.getString(10);
                laptopList.add(new Laptops(id,model,companyName,price,quantity,cpu,memory,ram,resolution,bLife));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return laptopList;
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
