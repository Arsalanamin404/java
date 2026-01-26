package basics;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainApp {
    private static final String url = "jdbc:postgresql://localhost:5432/comapany_db";
    private static final String user = "postgres";
    private static final String password = "arsalanrather";
    private static final String SELECT_QUERY = "SELECT * FROM employees";
    private static final String INSERT_QUERY = "INSERT INTO employees (name, age, salary) VALUES (?,?,?)";
    private static final String DELETE_BY_ID_QUERY = "DELETE FROM employees WHERE ID=?";
    private static final String UPDATE_SALARY_BY_ID_QUERY = "UPDATE employees SET salary=? WHERE ID=?";


    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement insertPS = connection.prepareStatement(INSERT_QUERY);
                PreparedStatement deletePS = connection.prepareStatement(DELETE_BY_ID_QUERY);
                PreparedStatement updatePS = connection.prepareStatement(UPDATE_SALARY_BY_ID_QUERY);
                Statement statement = connection.createStatement()
        ) {

/*
            ---------- INSERT ---------
            int insert_rows_affected = insertEmployee(insertPS,"Ramesh",29,13500);
            if (insert_rows_affected>0)
                System.out.println("INSERTION SUCCESSFUL "+insert_rows_affected+" row(s) affected.");
            else
                System.out.println("INSERTION FAILED "+insert_rows_affected+" row(s) affected.");
*/

/*
            ---------- DELETE ---------
            int delete_rows_affected = deleteById(deletePS, 9);
            if (delete_rows_affected > 0)
                System.out.println("DELETION SUCCESSFUL " + delete_rows_affected + " row(s) affected.");
            else
                System.out.println("DELETION FAILED " + delete_rows_affected + " row(s) affected.");
*/

//            ---------- UPDATE ---------
            int update_rows_affected = updateSalaryById(updatePS, 17, 12000);

            if (update_rows_affected > 0)
                System.out.println("UPDATE SUCCESSFUL " + update_rows_affected + " row(s) affected.");
            else
                System.out.println("UPDATE FAILED " + update_rows_affected + " row(s) affected.");

            System.out.println("-".repeat(30));

            ResultSet rs = statement.executeQuery(SELECT_QUERY);
            printResult(rs);
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
    }

    static void printResult(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            int salary = resultSet.getInt("salary");

            System.out.println(id + " " + name + " " + age + " " + salary);
        }
    }

    static int insertEmployee(PreparedStatement ps, String name, int age, int salary) throws SQLException {
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setInt(3, salary);

        return ps.executeUpdate();
    }

    static int deleteById(PreparedStatement ps, int id) throws SQLException {
        ps.setInt(1, id);
        return ps.executeUpdate();
    }

    static int updateSalaryById(PreparedStatement ps, int id, int salary) throws SQLException {
        ps.setInt(1, salary);
        ps.setInt(2, id);
        return ps.executeUpdate();
    }
}
