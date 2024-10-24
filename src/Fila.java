

public class Fila
{

    private Elemento cabeca;
    private Elemento fim;
    private int size;

    public Fila()
    {
        this.cabeca = null;
        this.fim = null;
        this.size = 0;
    }

    public boolean isEmpty()
    {
        return this.size == 0;
    }

    public int size()
    {
        return this.size;
    }

    public void enfileirar(Object valor)
    {
        Elemento elemento = new Elemento(valor);
        if(isEmpty())
        {
            this.cabeca = elemento;
            this.fim = elemento;
        }else
        {
            this.fim.proximo = elemento;
            this.fim = elemento;
        }
        this.size++;
    }

    public void desenfileirar()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("A Fila está vazia");
        }
        this.cabeca = this.cabeca.proximo;
        this.size--;
        if(this.size == 0)
        {
            this.fim = null;
        }
    }

    public Elemento head()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("A Fila está vazia");
        }
        return this.cabeca;
    }

    @Override
    public String toString()
    {
        if(isEmpty())
        {
            return "[]";
        }else
        {
            StringBuilder resultado = new StringBuilder("[");
            Elemento atual = cabeca;
            while(atual != null)
            {
                resultado.append(atual.valor);
                if(atual.proximo != null)
                {
                    resultado.append(", ");
                }
                atual = atual.proximo;
            }
            resultado.append("]");
            return resultado.toString();
        }
    }

}
