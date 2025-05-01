package Application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

    Department obj = new Department(1, "Açougue");
    System.out.println(obj);

    Seller seller = new Seller(4, "Pedro", "pedro@gmail.com", 7500.0, new Date(), obj);
        System.out.println(seller);
    }
}