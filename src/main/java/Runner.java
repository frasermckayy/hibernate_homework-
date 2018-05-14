import db.DBCustomer;
import db.DBOrder;
import models.Customer;
import models.Order;

import java.util.List;

    public class Runner {

        public static void main(String[] args){
            Customer customer1 = new Customer("John", "Bonjovi", 43);
            DBCustomer.save(customer1);

            Customer customer2 = new Customer("fraser", "mckay", 56);
            DBCustomer.save(customer2);

            customer2.setFirstName("Tom");

            DBCustomer.update(customer2);

            List<Customer> results = DBCustomer.getCustomers();

            Customer findResult = DBCustomer.find(customer2.getId());

            Order order1 = new Order();
            DBOrder.save(order1);

            Order order2 = new Order();
            DBOrder.save(order2);

            order2.setDescription("Description");

            DBOrder.update(order2);








        }



    }


