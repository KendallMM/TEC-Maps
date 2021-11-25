
package Clases;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

/**
     *
     * @author Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
     */
public class TextPrompt extends JLabel
	implements FocusListener, DocumentListener
{
	public enum Show
	{
		ALWAYS,
		FOCUS_GAINED,
		FOCUS_LOST;
	}

	private JTextComponent component;
	private Document document;

	private Show show;
	private boolean showPromptOnce;
	private int focusLost;
/**
	 * Esta funcion permite setear el texto del tiempo en pantalla
	 *
	 *  
	 */
	public TextPrompt(String text, JTextComponent component)
	{
		this(text, component, Show.ALWAYS);
	}
/**
	 * Esta funcion permite setear el tipo de letra, el tamaño, entre otras características.
	 *
	 *  
	 */
	public TextPrompt(String text, JTextComponent component, Show show)
	{
		this.component = component;
		setShow( show );
		document = component.getDocument();

		setText( text );
		setFont( component.getFont() );
		setForeground( component.getForeground() );
		setBorder( new EmptyBorder(component.getInsets()) );
		setHorizontalAlignment(JLabel.LEADING);

		component.addFocusListener( this );
		document.addDocumentListener( this );

		component.setLayout( new BorderLayout() );
		component.add( this );
		checkForPrompt();
	}

	/**
	 *  Metodo para canbiar el valor de flotante a el valor actual de la funcion.
	 *
	 *  @param alpha value in the range of 0 - 1.0.
	 */
	public void changeAlpha(float alpha)
	{
		changeAlpha( (int)(alpha * 255) );
	}

	/**
	 * Metodo encargado de generar el estilo de la letra y su fondo.
	 *
	 * 
	 */
	public void changeAlpha(int alpha)
	{
		alpha = alpha > 255 ? 255 : alpha < 0 ? 0 : alpha;

		Color foreground = getForeground();
		int red = foreground.getRed();
		int green = foreground.getGreen();
		int blue = foreground.getBlue();

		Color withAlpha = new Color(red, green, blue, alpha);
		super.setForeground( withAlpha );
	}

	/**
	 * Metodo encargado de cambiar el estilo de la fuente.
	 *
	 * 
	 */
	
	public void changeStyle(int style)
	{
		setFont( getFont().deriveFont( style ) );
	}

	/**
	 * obtiene lo que se muestra en el JLabel
	 *
	 *  
	 */
	public Show getShow()
	{
		return show;
	}

/**
	 * Setea el eñ show del label.
	 *
	 *  
	 */
	public void setShow(Show show)
	{
		this.show = show;
	}

	/**
	 * Obtiene el booleano del Prompt 
	 *
	 *  
	 */
	public boolean getShowPromptOnce()
	{
		return showPromptOnce;
	}
/**
	 * Setea el show
	 *
	 *  
	 */
	
	public void setShowPromptOnce(boolean showPromptOnce)
	{
		this.showPromptOnce = showPromptOnce;
	}

	/**
	 * Se encarga de chequear el prompt
	 *
	 *  
	 */
	private void checkForPrompt()
	{
		

		if (document.getLength() > 0)
		{
			setVisible( false );
			return;
		}

		

		if (showPromptOnce && focusLost > 0)
		{
			setVisible(false);
			return;
		}

		

        if (component.hasFocus())
        {
        	if (show == Show.ALWAYS
        	||  show ==	Show.FOCUS_GAINED)
        		setVisible( true );
        	else
        		setVisible( false );
        }
        else
        {
        	if (show == Show.ALWAYS
        	||  show ==	Show.FOCUS_LOST)
        		setVisible( true );
        	else
        		setVisible( false );
        }
	}

//  Implement FocusListener

	public void focusGained(FocusEvent e)
	{
		checkForPrompt();
	}

	public void focusLost(FocusEvent e)
	{
		focusLost++;
		checkForPrompt();
	}

//  Implement DocumentListener
/**
	 * Se encarga de actualizar
	 *
	 *  
	 */
	public void insertUpdate(DocumentEvent e)
	{
		checkForPrompt();
	}
/**
	 * remueve lo ultimo agregado
	 *
	 *  
	 */
	public void removeUpdate(DocumentEvent e)
	{
		checkForPrompt();
	}
/**
	 * cambia la agregado por lo actual
	 *
	 *  
	 */
	public void changedUpdate(DocumentEvent e) {}
}