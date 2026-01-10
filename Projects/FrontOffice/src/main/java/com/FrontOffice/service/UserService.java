package com.FrontOffice.service;

import com.FrontOffice.binding.ForgotForm;
import com.FrontOffice.binding.LoginForm;
import com.FrontOffice.binding.SignUp;
import com.FrontOffice.binding.UnLockForm;
import jakarta.mail.MessagingException;


public interface UserService {

    boolean SignUp(SignUp form) throws MessagingException;


    boolean unlockAccount(UnLockForm form);

    String handleLogin(LoginForm form);

    String forgotPassword(ForgotForm form) throws MessagingException;
}
