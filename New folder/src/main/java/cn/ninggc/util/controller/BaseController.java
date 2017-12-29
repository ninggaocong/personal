package cn.ninggc.util.controller;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BaseController extends ActionSupport {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected InputStream is;
    protected BufferedReader bufferedReader;
    protected HttpSession session;
    protected Gson gson = new Gson();

    /**
     * do since client is connected
     * @return data from client
     * @throws IOException
     */
    protected String ready() throws IOException {
        response = ServletActionContext.getResponse();
        request = ServletActionContext.getRequest();
        session = request.getSession();
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        is = request.getInputStream();
        bufferedReader = new BufferedReader(new InputStreamReader(is, "utf-8"));
        StringBuffer sb = new StringBuffer();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
//        System.out.println(sb.toString());
        return sb.toString();
    }
}
