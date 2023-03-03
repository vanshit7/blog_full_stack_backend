package com.ecommerce.model;

import javax.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "comment")
public class Comment {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  private int id;

  private String text;
  private int upvotes;
  private int downvotes;

  @OneToOne
  private User author;
  private Date commentTime;

  public Comment()  {}
}
