package org.convey.example.controller;

import org.convey.example.email.EmailSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * $LastChangedDate:  $
 * $LastChangedBy:  $
 * $LastChangedRevision:  $
 */
@Controller
@RequestMapping("/sending")
public class EmailController {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("emailConfiguration.xml");
    EmailSender emailSender=(EmailSender)context.getBean("emailSenderBean");


    @RequestMapping(value="/",method= RequestMethod.GET)
    public ModelAndView sendEmailUsingGmailDefault(){

        ModelAndView view=new ModelAndView("EmailView");
        view.addObject("emailSender",emailSender);

        emailSender.sendMail("abanstest@gmail.com","chathuranga.t@gmail.com","Test Email","Test Email from Spring MVC 3");
        return view;

    }


    @RequestMapping(value="/email",method= RequestMethod.GET)
    public ModelAndView sendEmailUsingGmail(){


        ModelAndView view=new ModelAndView("EmailView");

        view.addObject("emailSender",emailSender);

        emailSender.sendMail("abanstest@gmail.com","chathuranga.t@gmail.com","Test Email","Test Email from Spring MVC 3");
        return view;

    }


}
