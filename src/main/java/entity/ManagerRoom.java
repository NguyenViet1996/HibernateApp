package entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "manager_room")
public class ManagerRoom {

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

		@Column(name="amount_employee")
		private Integer amountEmployee;

		public ManagerRoom(String name, String phoneNumber, Integer amountDayWork, Integer amountEmployee) {
				this.name = name;
				this.phoneNumber = phoneNumber;
				this.amountDayWork = amountDayWork;
				this.amountEmployee = amountEmployee;
		}

		public ManagerRoom() {

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

		public Integer getAmountEmployee() {
				return amountEmployee;
		}

		public void setAmountEmployee(Integer amountEmployee) {
				this.amountEmployee = amountEmployee;
		}

}
