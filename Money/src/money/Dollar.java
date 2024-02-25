/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package money;

/**
 *
 * @author emaph
 */
class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }


    @Override
    public boolean equals(Object obj) {
        Dollar other = (Dollar)obj;
        return this.amount == other.amount;
    }
}
