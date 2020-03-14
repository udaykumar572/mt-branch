package com.cts.project.company;


import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="stockprice")
public class StockPrice {

	private String companyname;
	
	@Id
	private  String stockexchange;
	private Integer currentprice;
	private Time time;
	private Date date;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	
	public Integer getCurrentprice() {
		return currentprice;
	}
	public void setCurrentprice(Integer currentprice) {
		this.currentprice = currentprice;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	@Override
	public String toString() {
		return "StockPrice [companyname=" + companyname + ", stockexchange=" + stockexchange + ", currentprice="
				+ currentprice + ", time=" + time + ", date=" + date + "]";
	}

	
	
}

