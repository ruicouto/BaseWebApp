/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.data;

import com.example.business.Example;

/**
 *
 * @author ruicouto
 */
public class ExampleDAO {
    public static Example get(int id) {
        Example e = new Example();
        //TODO: load from database
        return e;
    }
    
    public static void save(Example example) {
        //TODO: persist to database
    }
}
