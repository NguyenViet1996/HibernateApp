package entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    @NotNull
    private String name;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="amount_day_work")
    private Integer amountDayWork;

    @Column(name="id_manager_room")
    @NotNull
    private Integer idManagerRoom;

    public Employee(String name, String phoneNumber, Integer amountDayWork, Integer idManagerRoom) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.amountDayWork = amountDayWork;
        this.idManagerRoom = idManagerRoom;
    }

    public Employee() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String hoTen) {
        this.name = hoTen;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAmountDayWork() {
        return amountDayWork;
    }

    public void setAmountDayWork(Integer amountDayWork) {
        this.amountDayWork = amountDayWork;
    }

    public Integer getIdManagerRoom() {
        return idManagerRoom;
    }

    public void setIdMangerRooom(Integer idManagerRoom) {
        this.idManagerRoom = idManagerRoom;
    }

}
