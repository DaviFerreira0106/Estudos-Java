/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.commandfactory.controller;

import Util.Upload;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author daviferreira
 */
public interface ICommand {
    public String executar(HttpServletRequest request, HttpServletResponse response, Upload objUpload) throws Exception;
}
