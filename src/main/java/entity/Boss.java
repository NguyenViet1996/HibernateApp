package entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "boss")
public class Boss {

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

		@Column(name="rate_company")
		@NotNull
		private Double rateCompany;

		public Boss(String name, String phoneNumber, Integer amountDayWork, Double rateCompany) {
				this.name = name;
				this.phoneNumber = phoneNumber;
				this.amountDayWork = amountDayWork;
				this.rateCompany = rateCompany;
		}

		public Boss() {

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

		public void setName(String name) {
				this.name = name;
		}

		public String getPhoneNumber() {
				return name;
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

		public Double getRateCompany() {
				return rateCompany;
		}

		public void setRateCompany(Double rateCompany) {
				this.rateCompany = rateCompany;
		}

}
