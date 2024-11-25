package com.e102.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PasswordModifyDTO {
    int userId;
    String prevPassword;
    String modPassword;
}
