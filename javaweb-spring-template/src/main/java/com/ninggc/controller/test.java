package com.ninggc.controller;

import com.ninggc.DAO.KeyInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyEditor;

@Controller
public class test {
    private KeyInfo keyInfo;

    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }

    @InitBinder
    public void bind(WebDataBinder binder) {

    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(Model m) {
        return "encrypt";
    }

    @RequestMapping(value = "/view", method = RequestMethod.POST)
    public ModelAndView view(HttpServletRequest request){
//        String path = request.getParameter("path") + "";
//        System.out.println(path);
        System.out.println(request.getParameter("key"));
        if (keyInfo != null) {
            System.out.println(keyInfo.getKey());
        } else {
            System.out.println("null");
        }

        String path = "encrypt";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(path);
        return mav;
    }

    @RequestMapping(value = "/string", method = RequestMethod.GET)
    @ResponseBody
    public String string() {
        return "string test";
    }
}
