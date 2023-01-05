import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        System.out.println("category: phone");
        System.out.println("phone_id: 101");
        System.out.println("title: iphone14");
        System.out.println("price: 1064 euros");
        System.out.println("description: perfect product with best image quality");


        int id =101;
        String c,t,p,d;
        c= "phone";
        t= "iphone14";
        p= "1064 euros";
        d= "description: perfect product with best image quality";
        System.out.println("id= "+id);
        System.out.println("title= "+c);
        System.out.println("title= "+t);
        System.out.println("title= "+p);
        System.out.println("title= "+d);



        try(Scanner input = new Scanner(System.in);){

            String catagory,title,descript;
            int Id ,price;

            System.out.print("Catagory: ");
            catagory=input.nextLine();
            System.out.print("ID: ");
            Id=input.nextInt();
            input.nextLine();
            System.out.print("Title: ");
            title=input.nextLine();
            System.out.print("Price: ");
            price=input.nextInt();
            input.nextLine();
            System.out.print("Description: ");
            descript=input.nextLine();

            System.out.println("Your Catagory: "+catagory);
            System.out.println("Product ID: "+Id);
            System.out.println("Product title: "+title);
            System.out.println("Product Price: "+price+"taka");
            System.out.println("Description: "+descript);

        }



    }
}
