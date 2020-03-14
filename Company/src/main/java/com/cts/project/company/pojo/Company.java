package com.cts.project.company.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cts.project.company.StockPrice;

import javax.persistence.Entity;

import javax.persistence.Table;

import javax.persistence.Id;

import java.util.List;

import javax.persistence.Column;

@Entity

@Table(name="company")

public class Company {
	
	
	
	
	@Override
	public String toString() {
		return "Company [ceo=" + ceo + ", boardofdirectors=" + boardofdirectors + ", listedinstockexchange="
				+ listedinstockexchange + ", sector=" + sector + ", stockcode=" + stockcode + ", companyname="
				+ companyname + ", brief=" + brief + ", turnover=" + turnover + "]";
	}

	private String ceo;

	  private String boardofdirectors;

	  private int listedinstockexchange;

	  private String sector;
	  
	  @Column(name="stockcode",nullable=false,length=100)
	  
	  private String stockcode;

	@Id
	  private String companyname;

	  private String brief;
	  @Transient
	  List<StockPrice> stockPriceList;
	 

	  public List<StockPrice> getStockPriceList() {
		return stockPriceList;
	}

	public void setStockPriceList(List<StockPrice> stockPriceList) {
		this.stockPriceList = stockPriceList;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	private int turnover;

	  public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardofdirectors() {
		return boardofdirectors;
	}

	public void setBoardofdirectors(String boardofdirectors) {
		this.boardofdirectors = boardofdirectors;
	}

	public int getListedinstockexchange() {
		return listedinstockexchange;
	}

	public void setListedinstockexchange(int listedinstockexchange) {
		this.listedinstockexchange = listedinstockexchange;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	

	

	public String getStockcode() {
		return stockcode;
	}

	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}

	  

}
