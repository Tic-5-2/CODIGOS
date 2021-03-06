package Horaweb;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import java.text.DateFormat;
import java.util.Date;

public class Hora extends AbstractPageBean
{
    private int  __placeholder;
    private void  _init() throws Exception
    {
        
    }
    private Page page1 = new Page();
    
    public  Page getPage1()
    {
        return page1;
        
    }
    public void setPage1(Page p)
    {
        this.page1 = p;
    }
    private Html html1 = new  Html();
    public Html getHtml1()
    {
        return html1;
    }
    public void setHtml1(Html h)
    {
        this.html1 = h;
    }
    private Head head1 = new  Head();

    public Head getHead1() 
    {
        return head1;
    }
    public void setHead1(Head h) 
    {
        this.head1 = h;
    }
    private Link link1 = new Link();
    public Link getLink1() 
    {
        return link1;
    }
    public void setLink1(Link l)
    {
        this.link1 = l;
        
    }
    private Body body1 = new Body();
    public Body getBody1()
    {
        return body1;
    }
    public void setBody1(Body b)
    {
        this.body1 = b;
    }
    private Form form1 = new Form();
    public Form getForm1() 
    {
        return form1;
    }
    public void setForm1(Form f)
    {
        this.form1 = f;
    }
    private StaticText encabezadoHora = new StaticText();
    public StaticText getEncabezadoHora() 
    {
        return encabezadoHora;
    }
    public void setEncabezadoHora(StaticText st)
    {
        this.encabezadoHora = st;
    }
    private StaticText textoReloj = new StaticText();
    public StaticText getTextoReloj() 
    {
        return textoReloj;
    }
    public void setTextoReloj(StaticText st)
    {
        this.textoReloj = st;
    }
    
    public Hora() 
    {
        
    }
    protected ResquestBean1 getRequestBean1()
    {
        return (RequestBean1)getBean("RequestBean1");

    }
    protected ApplicationBean1 getApplicationBean1() 
    {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }
    protected SessionBean1 getSessionBean1() 
    {
        return (SessionBean1)getBean("SessionBean1");
        
    }
    public void init()
    {
        super.init();
        try
        {
            _init();
        }
        catch ( Exception e )
        {
            log( "Error al inicializar Hora", e );
            throw e instanceof FacesException ? ( FacesException ) e:
               new FacesException( e );
            
        }

    }
    public void preprocess() 
    {
        
    }
    public void prerender() 
    {
        textoReloj.setValue( DateFormat.getTimeInstance(
            DateFormat.LONG ).format( new Date() ) );
    }
    public void destroy()
    {
        
    }
    
}
