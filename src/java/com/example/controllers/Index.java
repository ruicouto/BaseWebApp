/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ruicouto
 */
public class Index {
    /**
     * 
     * @param request
     * @param response 
     */
    public void processRequest(HttpServletRequest request, HttpServletResponse response) {
        String uname = request.getParameter("username");
        if(uname == null) {
            uname = "someone";
        }
        request.setAttribute("username", uname);
    }
}
