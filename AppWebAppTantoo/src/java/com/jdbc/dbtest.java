/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;

import java.sql.Connection;

/**
 *
 * @author MARCELO
 */
public class dbtest {
    
        public static void main(String[] args) {
        // prueba de conexion
        try {
            Connection cn= DBUtility.getConnection();
            System.out.println("CONEXION CONFORME...");
        } catch (Exception e) {
            System.out.println("ERROR : "+e.getMessage());
        }
    }
    
}
