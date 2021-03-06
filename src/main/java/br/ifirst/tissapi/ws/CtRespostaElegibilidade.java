
package br.ifirst.tissapi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_respostaElegibilidade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaElegibilidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="reciboElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_elegibilidadeRecibo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_respostaElegibilidade", propOrder = {
    "mensagemErro",
    "reciboElegibilidade"
})
public class CtRespostaElegibilidade {

    protected CtMotivoGlosa mensagemErro;
    protected CtElegibilidadeRecibo reciboElegibilidade;

    /**
     * Obtém o valor da propriedade mensagemErro.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Define o valor da propriedade mensagemErro.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMensagemErro(CtMotivoGlosa value) {
        this.mensagemErro = value;
    }

    /**
     * Obtém o valor da propriedade reciboElegibilidade.
     * 
     * @return
     *     possible object is
     *     {@link CtElegibilidadeRecibo }
     *     
     */
    public CtElegibilidadeRecibo getReciboElegibilidade() {
        return reciboElegibilidade;
    }

    /**
     * Define o valor da propriedade reciboElegibilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link CtElegibilidadeRecibo }
     *     
     */
    public void setReciboElegibilidade(CtElegibilidadeRecibo value) {
        this.reciboElegibilidade = value;
    }

}
