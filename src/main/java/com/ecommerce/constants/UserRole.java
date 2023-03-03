package com.ecommerce.constants;

import javax.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum UserRole {
  ADMIN("admin"),
  REGISTERED("registered"),
  PRO("pro"),
  GUEST("guest");

  @Getter
  @Nonnull private String roleName;
}