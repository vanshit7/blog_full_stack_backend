package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "post")
public class Post {

  @Id
  private int id;

  private String title;
  private String content;

  @ManyToOne
  private User author;
  private int likes;

  @OneToMany
  private List<Comment> comments;

  public Post() {}
}

