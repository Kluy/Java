import java.sql.*;
import java.util.ArrayList;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/laptop";
    static final String USER = "root";
    static final String PASSWORD = "soBusoduh0";

    static final String query = "select laptops.id," +
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

    static final String update = "UPDATE laptops SET price=? WHERE id=?";

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);

        PreparedStatement preparedStatement = connection.prepareStatement(update);

        ArrayList<Laptop> laptopList = new ArrayList<>();

        ResultSet rs = preparedStatement.executeQuery(query);

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
            laptopList.add(new Laptop(id,model,companyName,price,quantity,cpu,memory,ram,resolution,bLife));
        }

//        laptopList.stream()
//                .filter(e -> e.getCompanyName().equals("Apple"))
//                .forEach(e -> e.setPrice(e.getPrice() - 1));
//
//        laptopList.stream()
//                .filter(e -> e.getCompanyName().equals("Apple"))
//                .forEach(e -> {
//                    try {
//                        preparedStatement.setInt(1, e.getPrice());
//                        preparedStatement.setInt(2, e.getId());
//                        preparedStatement.executeUpdate();
//                    } catch (SQLException ex) {
//                        ex.printStackTrace();
//                    }
//                });

        for (Laptop laptop : laptopList) {
            if (laptop.getCompanyName().equals("Apple")) {
                laptop.setPrice(laptop.getPrice() - 1);
                preparedStatement.setInt(1, laptop.getPrice());
                preparedStatement.setInt(2, laptop.getId());
                preparedStatement.executeUpdate();
            }
        }

        System.out.println("HP " + laptopList.stream()
                .filter(e -> e.getCompanyName().equals("HP"))
                .count());

        preparedStatement.close();
        connection.close();
    }
}
