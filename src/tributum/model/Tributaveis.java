/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tributum.model;

/**
 *
 * @author medabot
 */
public interface Tributaveis {
    /**
     * @return double, a soma total dos impostos.
     * @throws NullPointerException, EmptyException.
     */
    public double valorTotalImposto(Imposto impostos[])throws NullPointerException, EmptyException;
}
