package com.FrontOffice.service;

import com.FrontOffice.binding.ForgotForm;
import com.FrontOffice.binding.LoginForm;
import com.FrontOffice.binding.SignUp;
import com.FrontOffice.binding.UnLockForm;
import com.FrontOffice.entity.UserDtsEntity;
import com.FrontOffice.repo.UserDtlsRepo;
import com.FrontOffice.util.EmailUtils;
import com.FrontOffice.util.PwdUtils;
import jakarta.mail.MessagingException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDtlsRepo userDtlsRepo;

    @Autowired
    EmailUtils emailUtils;

    @Override
    public boolean SignUp(SignUp form) throws MessagingException {
        //todo :copy form data to entity
        UserDtsEntity userDtsEntity = new UserDtsEntity();
        BeanUtils.copyProperties(form, userDtsEntity);
        //todo :generate random passwords set to object
        String password = PwdUtils.getPassword();
        userDtsEntity.setUserPassword(password);
        //todo :set account status as lock
        userDtsEntity.setUserAccountStatus("LOCKED");
        //todo: call repository method to insert record
        userDtsEntity.setUserName(form.getUsername());
        userDtsEntity.setUserEmail(form.getEmail());
        userDtsEntity.setUserPhoneNumber(form.getPhone());

        userDtlsRepo.save(userDtsEntity);
        //todo :send email to unlock account
        String to = form.getEmail();
        String userName = form.getUsername();
        String subject = "Unlock your account";

        StringBuffer body = new StringBuffer();
        body.append("<h1>Use Below Temporary Password To Unlock Your Account</h1>");
        body.append("Temporary Password: " + password);
        body.append("<br/>");
        body.append("<a href=\"http://localhost:8080/unlock?email=" + to + "\">Click Here To Unlock Your Account</a>");
        emailUtils.sendEmail(to, subject, body.toString());
        return true;
    }

    @Override
    public boolean unlockAccount(UnLockForm form) {

        UserDtsEntity userDtsEntity = userDtlsRepo.findByUserEmail(form.getEmail());
        if (userDtsEntity.getUserPassword().equals(form.getTempPassword())) {
            userDtsEntity.setUserPassword(form.getNewPassword());
            userDtsEntity.setUserAccountStatus("UnLocked");
            userDtlsRepo.save(userDtsEntity);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String handleLogin(LoginForm form) {
        UserDtsEntity userDtsEntity = userDtlsRepo.findByUserNameAndUserPassword(form.getUsername(), form.getPassword());

        if (userDtsEntity == null) {
            return "Invalid username or password";
        }
        if (userDtsEntity.getUserAccountStatus().equals("Locked")) {
            return "Your ACCOUNT has been LOCKED";
        } else {
            return "Success";
        }

    }

    @Override
    public String forgotPassword(ForgotForm form) throws MessagingException {
        UserDtsEntity byUserEmail = userDtlsRepo.findByUserEmail(form.getEmail());
        if (byUserEmail != null) {
            //Todo :send mail
            String to = form.getEmail();
            String subject = "Forgot Password";
            StringBuffer body = new StringBuffer();
            body.append("<h1>Please use this password to login :" + byUserEmail.getUserPassword() + "</h1>");
            emailUtils.sendEmail(to, subject, body.toString());
            return "Success";

        } else {
            return "Invalid email";
        }

    }


}
