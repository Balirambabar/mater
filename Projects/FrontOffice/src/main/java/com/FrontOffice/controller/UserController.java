package com.FrontOffice.controller;


import com.FrontOffice.binding.ForgotForm;
import com.FrontOffice.binding.LoginForm;
import com.FrontOffice.binding.SignUp;
import com.FrontOffice.binding.UnLockForm;
import com.FrontOffice.service.UserServiceImpl;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute("loginForm") LoginForm form, Model model) {
        // handle login form
        String checkStatus = userService.handleLogin(form);
        if (checkStatus.equals("Success")) {
            return "redirect:/dashBoard";
        } else {
            model.addAttribute("errMsg", checkStatus);
        }

        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {

        model.addAttribute("register", new SignUp());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("register") SignUp form, Model model) throws MessagingException {
        boolean checkStatus = userService.SignUp(form);
        if (checkStatus) {
            model.addAttribute("message", "User registered successfully!");
        } else {
            model.addAttribute("message", "please provide correct data!");
        }
        return "register";
    }

    @GetMapping("/forgotPassword")
    public String showForgotPasswordForm(Model model) {
        model.addAttribute("forgotPasswordForm", new ForgotForm());
        return "forgotPass";
    }

    @PostMapping("/forgotPassword")
    public String processForgotPassword(@ModelAttribute("forgotPasswordForm") ForgotForm form) throws MessagingException {
        String checkStatus = userService.forgotPassword(form);
        if (checkStatus.equals("Success")) {
            return "redirect:/login";
        }
        return "forgotPass";
    }

    @GetMapping("/unlock")
    public String unlock(@RequestParam String email, Model model) {
        UnLockForm unLockFormObj = new UnLockForm();
        unLockFormObj.setEmail(email);
        model.addAttribute("unlockForm", unLockFormObj);
        return "unlock";
    }

    @PostMapping("/unlock")
    public String processUnlock(@ModelAttribute("unlockForm") UnLockForm form, Model model) {
        System.out.println(form);
        if (form.getConfirmPassword().equals(form.getNewPassword())) {
            boolean checkStatus = userService.unlockAccount(form);
            if (checkStatus) {
                model.addAttribute("succMsg", "Your Account has been unlocked!");
            } else {
                model.addAttribute("errorMsg", "Your temporary password is incorrect!");
            }
        } else {
            model.addAttribute("errorMsg", "New Passwords and Confirm Passwords don't match!");
        }
        return "unlock";
    }
}

