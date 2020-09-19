package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AdministratorService;
import util.EmailCodeUtil;

/**
 * Classname:EmailController
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-09-15 10:25
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/email")
public class SenEmailController {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private AdministratorService administratorService;
    @Value("${mail.username}")
    private String emailFrom;

    @RequestMapping("/send")
    @ResponseBody
    public String senMsg(@RequestParam("email") String toEmail) {
        //查看该邮箱是否已经被注册
        boolean flag = administratorService.isEmailRegister(toEmail);
        if (flag) {
            //已经被注册
            String value = "{\"verifyCode\":" + 0 + "}";
            return value;
        }
        SimpleMailMessage message = new SimpleMailMessage();
        //发件人的邮箱地址
        message.setFrom(emailFrom);
        //收件人的邮箱地址
        message.setTo(toEmail);
        //邮件主题
        message.setSubject("注册验证码");
        //生成随机验证码
        String verifyCode = EmailCodeUtil.generateVerifyCode(6);
        //邮件内容
        message.setText("您的验证码为：" + verifyCode);
        //发送邮件
        javaMailSender.send(message);
        ObjectMapper objectMapper = new ObjectMapper();
        String value = "{\"verifyCode\":" + verifyCode + "}";
        return value;
    }
}