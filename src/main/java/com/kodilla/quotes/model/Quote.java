package com.kodilla.quotes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "quotes")
public final class Quote {

  @Id
  private Long id;
  private String author;
  private String content;


}
