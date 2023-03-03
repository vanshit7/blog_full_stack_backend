package com.ecommerce.constants;

import javax.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Category {
  CLOTHES("clothes"),
  JEWELRY("jewelry"),
  FASHION("fashion"),
  SPORTS("sports"),
  ENTERTAINMENT("entertainment"),
  OTHER("other");

  @Getter
  @Nonnull private String categoryName;
}