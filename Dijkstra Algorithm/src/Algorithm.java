
public class Algorithm 
{
   public int d[];
    String color[];
    int d1[];
    int pred[];
    public boolean col(int n)
    {int i=0;
     while(i<n)
     {
        if(color[i]=="white")
     return true;
      i++;    
     }
    return false;
    }
    public int Extacte_Min(int n)
    {
    int min=Integer.MAX_VALUE;
    int t = 0;
    for(int i=0;i<n;i++)
    {
      if(d[i]<min)
      { min=d[i];
          t=i;
      }
      
    }
    return t;
    }
            
    public void Initialize(int n)
    {
        d=new int[n];
        color=new String[n];
        d1=new int[n];
        pred=new int[n];
    for(int i=0;i<n;i++)
    {
    d[i]=Integer.MAX_VALUE; 
    color[i]="white";
    }
    
    }
    public void Dijkstra(int [][] Adj,int s)
    {d1[s]=0;
    pred[s]=0;
    Initialize( Adj.length);
    while(col(Adj.length))
    {
       int u=Extacte_Min(Adj.length);
       for(int i=0; i<Adj.length;i++)
       {
          if(d[u]+Adj[u][i]<d[i])
          {
          d[i] =d[u]+Adj[u][i];
          pred[i]=u;
          }
          
       }
       
     color[u]="black";
    }   
    }
        
 }
