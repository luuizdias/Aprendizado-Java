/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author luiz.dias
 */
@Stateless
public class MySession implements MySessionRemote {

    @Override
    public String getResult() {
        return "This is My Session Bean";
    }   
}
