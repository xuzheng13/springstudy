package com.azxx.demon.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name="books")
public class Book {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private Double price;
  private Date publishdate;

  @javax.persistence.Id
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Date getPublishdate() {
    return publishdate;
  }

  public void setPublishdate(Date publishdate) {
    this.publishdate = publishdate;
  }
}
