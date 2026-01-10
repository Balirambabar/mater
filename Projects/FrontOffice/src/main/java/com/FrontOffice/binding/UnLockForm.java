package com.FrontOffice.binding;

import lombok.Data;

@Data
public class UnLockForm {
    private String email;
    private String tempPassword;
    private String newPassword;
    private String confirmPassword;
}
