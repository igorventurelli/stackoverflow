//http://pt.stackoverflow.com/questions/189486/consulta-de-dados-arquivo-settings

public class AcessoAoSettings 
{
    public Propriedade1 
    { 
        get 
        {
            return Properties.Settings.Default.Propriedade1;
        }
        set
        {
            Properties.Settings.Default.Propriedade1 = value;
        }
    }

    public Propriedade2 
    { 
        get 
        {
            return Properties.Settings.Default.Propriedade2;
        }
        private set;
    }
}