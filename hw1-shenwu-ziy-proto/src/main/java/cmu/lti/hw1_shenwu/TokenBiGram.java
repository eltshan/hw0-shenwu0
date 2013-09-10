

/* First created by JCasGen Tue Sep 10 11:02:13 CST 2013 */
package cmu.lti.hw1_shenwu;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This type will be the annotation of all 2-Grams
 * Updated by JCasGen Tue Sep 10 12:15:18 CST 2013
 * XML source: C:/Users/Eltshan/git/hw1-shenwu/hw1-shenwu-ziy-proto/src/main/resources/hw1-shenwu-typesystem.xml
 * @generated */
public class TokenBiGram extends basicAnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenBiGram.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TokenBiGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenBiGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenBiGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenBiGram(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    