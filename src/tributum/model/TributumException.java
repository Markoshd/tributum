/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tributum.model;


public class TributumException extends Exception {
    private String msg;
    
    public TributumException(String msg) {
        super(msg);
        this.msg = msg;
    }
    
    @Override
    public String getMessage() {
        return msg;
    }
}
