/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weblicht.format_converter.datamodel.utils;

import java.io.IOException;

/**
 *
 * @author felahi
 */
public interface InputOutputChecker {

    public boolean isInputValid()throws IOException;

    public boolean isOutputValid()throws IOException;

}
