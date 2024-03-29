/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parser3240;

/**
 * The Token class is used to store token symbols. This class and the Nonterminal
 * class are both subclasses of Symbol, which allows us to do things
 * like create an ArrayList<Symbol>, which can hold the right-hand side of
 * production rules after they are read in from a grammar file.
 * @author mpn
 */
public class Token extends Symbol {
    private final String type= "Token";
    
    public Token(String nameIn) { super(nameIn);}
    public String getType(){return type;}
    
    @Override
    public int hashCode () {
        return super.hashCode();
    }
    
    @Override
    public boolean equals (Object otherObj) {
        /**if(!(otherObj instanceof Token))
        {
        	return false;
        }**/
        try {
            Token T2 = (Token) otherObj;
            return (super.getName().equals(T2.getName()));
        } catch (ClassCastException e) {
            return false;
        }
    }
}
