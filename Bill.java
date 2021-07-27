
import java.util.ArrayList;

public class Bill
{
  private double totalCost;
  private ArrayList<String> orderedFood;
  private ArrayList<Integer> orderedQuantity;
  public Bill()
  {
      orderedFood=new ArrayList<String>();
      orderedQuantity=new ArrayList<Integer>();
  }
   
   public double getTotal()
   {
       return totalCost;
   }
    
    public void addOrder(String meal,int quantity,String dish[],double cost[])
    {
       orderedFood.add(meal);
       orderedQuantity.add(quantity);
           
       for(int i=0;i<dish.length;i++)
       {
           if(meal.equals(dish[i]))
           {
               totalCost=totalCost+(quantity*cost[i]);              
           }
       }
    }
    public void getOrderBill()
    {

        System.out.println("Items");
      for(int i=0;i<orderedFood.size();i++)
        {
            System.out.println(orderedFood.get(i) + "  [ Quantity --> " + orderedQuantity.get(i)+" ] ");
        }
  }
}