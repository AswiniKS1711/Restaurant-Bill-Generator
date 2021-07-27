import java.util.*;

public class Main
{
    static String dish[]={"Pasta","Fried Chicken","Chowmein","Fish Cutlet","Momo","Chicken Shawarma Roll","Grilled Chicken","Biryani","French Fries","Ice Cream"};
    static double cost[]={100.00,80.00,100.00,200.00,70.00,80.00,150.00,200.00,100.00,60.00};
    static Bill ob=new Bill();
    public static void main(String args[])
    {
        
        receiveOrder();
        System.out.print('\u000C');
        System.out.println("Your bill");
        System.out.println("-----------------------------------------------------");
        ob.getOrderBill();
        System.out.println("-----------------------------------------------------");
        System.out.println("Total Amount = Rs."+ob.getTotal());
        System.out.println("Thank You !");
    }
    
    public static void receiveOrder()
    {
        
        int choice,quantity,ch;
        Scanner sc=new Scanner(System.in);
        System.out.print('\u000C');
        System.out.println("\t\tMenu");
        System.out.println("----------------------------------------------");
        System.out.println("OrderNo.\tDish\t(Price)");
        for(int i=0;i<10;i++)
        {
            System.out.println((i+1)+"\t\t"+dish[i]+" (Rs."+cost[i]+")");
        }
        do
        {
        System.out.println("\nPlease select your order by selecting the order number.");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Pasta",quantity,dish,cost);
            break;
            case 2 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Fried Chicken",quantity,dish,cost);
            break;
            case 3 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Chowmein",quantity,dish,cost);
            break;
            case 4 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Fish Cutlet",quantity,dish,cost);
            break;
            case 5 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Momo",quantity,dish,cost);
            break;
            case 6 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Chicken Shawarma Roll",quantity,dish,cost);
            break;
            case 7 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Grilled Chicken",quantity,dish,cost);
            break;
            case 8 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Biryani",quantity,dish,cost);
            break;
            case 9 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("French Fries",quantity,dish,cost);
            break;
            case 10 :
            System.out.println("Enter quantity :");
            quantity=sc.nextInt();
            ob.addOrder("Ice Cream",quantity,dish,cost);
            break;
            default : System.out.println("Sorry ! No such item present in our menu.");
        } 
        System.out.println("Do you want to order anything else ?\nEnter 1 to add more to the order list.Enter any other number to generate the bill");
        ch=sc.nextInt();
        if(ch!=1)
        break;
    }while(true);
    System.out.println("------------------------------------------------------------------------------");
    
    }
}