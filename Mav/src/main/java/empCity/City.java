package empCity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int city_id;
    @Column(name = "city_name")
    private String city_name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Employee> employeeList;

    public City(String city_name) {
        this.city_name = city_name;
    }

    public City() {

    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                '}';
    }

    public List<Employee> getEmployees() {
        return employeeList;
    }

    public void setEmployees(List<Employee> employees) {
        this.employeeList = employees;
    }

    public int getCity_id() {
        return city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}
