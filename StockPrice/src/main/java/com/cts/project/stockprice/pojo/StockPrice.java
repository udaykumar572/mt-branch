package com.cts.project.stockprice.pojo;


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
	private  String Time;
	private  String Date;
	private String Uploadfile;
	
	
	public String getUploadfile() {
		return Uploadfile;
	}
	public void setUploadfile(String uploadfile) {
		Uploadfile = uploadfile;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
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
				+ currentprice + ", Time=" + Time + ", Date=" + Date + ", Uploadfile=" + Uploadfile + "]";
	}
	

	
	
}

