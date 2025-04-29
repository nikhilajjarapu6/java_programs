package streamAPI_Project;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		
		  List<Customer> customers = Arrays.asList(
		            new Customer("C1", "John Doe", "john.doe@example.com", "123-456-7890", Arrays.asList("New York", "Los Angeles")),
		            new Customer("C2", "Jane Smith", "jane.smith@example.com", "234-567-8901", Arrays.asList("California", "Texas")),
		            new Customer("C3", "Bob White", "bob.white@example.com", "345-678-9012", Arrays.asList("Chicago", "Texas")),
		            new Customer("C4", "Alice Green", "alice.green@example.com", "456-789-0123", Arrays.asList("Florida", "New York")),
		            new Customer("C5", "Charlie Black", "charlie.black@example.com", "567-890-1234", Arrays.asList("California", "Nevada")),
		            new Customer("C6", "Diana Blue", "diana.blue@example.com", "678-901-2345", Arrays.asList("Texas", "Oregon")),
		            new Customer("C7", "Eve Brown", "eve.brown@example.com", "789-012-3456", Arrays.asList("Arizona", "Illinois")),
		            new Customer("C8", "Frank King", "frank.king@example.com", "890-123-4567", Arrays.asList("California", "Georgia")),
		            new Customer("C9", "Grace White", "grace.white@example.com", "901-234-5678", Arrays.asList("New York", "Texas")),
		            new Customer("C10", "Hank Lee", "hank.lee@example.com", "012-345-6789", Arrays.asList("Florida", "Oregon"))
		        );
		  // Creating products with productId, name, category, and price
		  // Creating Products
	        List<Product> products = Arrays.asList(
	            new Product("P1", "Coke", "Drinks", 1.5),
	            new Product("P2", "Chips", "Snacks", 2.0),
	            new Product("P3", "Water", "Drinks", 1.0),
	            new Product("P4", "Smartphone", "Electronics", 250.0),
	            new Product("P5", "Laptop", "Electronics", 1200.0),
	            new Product("P6", "Juice", "Drinks", 1.8),
	            new Product("P7", "Bread", "Groceries", 1.2),
	            new Product("P8", "Ice Cream", "Snacks", 3.5),
	            new Product("P9", "TV", "Electronics", 500.0),
	            new Product("P10", "Cookies", "Snacks", 2.5),
	            new Product("P11", "Chair", "Furniture", 45.0),
	            new Product("P12", "Table", "Furniture", 100.0),
	            new Product("P13", "Shoes", "Clothing", 60.0),
	            new Product("P14", "Jacket", "Clothing", 80.0),
	            new Product("P15", "Watch", "Accessories", 150.0)
	        );

	        // Creating Orders
	        List<Order> orders = Arrays.asList(
	            new Order("O1", customers.get(0), products.get(0), 3, 4.5, "New York", LocalDate.of(2024, 12, 1)),
	            new Order("O2", customers.get(1), products.get(2), 5, 5.0, "California", LocalDate.of(2024, 12, 3)),
	            new Order("O3", customers.get(2), products.get(1), 2, 4.0, "Texas", LocalDate.of(2024, 11, 28)),
	            new Order("O4", customers.get(3), products.get(3), 4, 1000.0, "Florida", LocalDate.of(2024, 12, 5)),
	            new Order("O5", customers.get(4), products.get(4), 1, 1200.0, "Nevada", LocalDate.of(2024, 12, 7)),
	            new Order("O6", customers.get(5), products.get(5), 7, 12.6, "Oregon", LocalDate.of(2024, 12, 8)),
	            new Order("O7", customers.get(6), products.get(6), 6, 7.2, "Illinois", LocalDate.of(2024, 12, 8)),
	            new Order("O8", customers.get(7), products.get(7), 3, 10.5, "Arizona", LocalDate.of(2024, 11, 25)),
	            new Order("O9", customers.get(8), products.get(8), 9, 4500.0, "Georgia", LocalDate.of(2024, 12, 10)),
	            new Order("O10", customers.get(9), products.get(9), 8, 20.0, "Oregon", LocalDate.of(2024, 11, 20)),
	            new Order("O11", customers.get(0), products.get(3), 1, 250.0, "Los Angeles", LocalDate.of(2024, 12, 11)),
	            new Order("O12", customers.get(3), products.get(0), 5, 7.5, "Florida", LocalDate.of(2024, 12, 12)),
	            new Order("O13", customers.get(2), products.get(4), 2, 2400.0, "Texas", LocalDate.of(2024, 11, 15)),
	            new Order("O14", customers.get(7), products.get(6), 4, 4.8, "Arizona", LocalDate.of(2024, 12, 13)),
	            new Order("O15", customers.get(8), products.get(8), 3, 1500.0, "New York", LocalDate.of(2024, 12, 14))
	        ); 
	        
	        
	        //getting orders total amount greater than 100
	        List<Order> moreThanHundred = orders.stream()
	        	  .filter(n->n.getTotalAmount()>100)
	        	  .collect(Collectors.toList());
	        System.out.println(moreThanHundred);
	        
	        
	        // Filter Orders by Product Category (e.g., Drinks)
	        List<Order> drinkOrders = orders.stream()
	        	  .filter(n->n.getProduct().getCategory().equals("Drinks"))
	        	  .collect(Collectors.toList());
	        drinkOrders.forEach(System.out::println);
	        
	        
	        //total amount of all orders
	        double sum = orders.stream()
	        	  .mapToDouble(n->n.getTotalAmount())
	        	  .sum();
	        System.out.println(sum);
	        
	        
	       //Group Orders by Customer
	        Map<Customer, List<Order>> ordersByCustomer = orders.stream()
	        	  .collect(Collectors.groupingBy(n->n.getCustomer()));
	        
	        ordersByCustomer.forEach((customer,list)->{
	        	System.out.println("Customer: " + customer.getName());
	        	list.forEach(System.out::println);
	        });
	        
	        
	        //Group Orders by Category
	        Map<String, List<Order>> groupByCategory = orders.stream()
	        	  .collect(Collectors.groupingBy(n->n.getProduct().getCategory()));
	        
	        groupByCategory.forEach((c,l)->{
	        	System.out.println("category :"+c);
	        	l.forEach(System.out::println);
	        });
	        
	        
	        //count of each catogory
	        Map<String, Long> count = orders.stream()
	        		  // Log the product category before grouping
	        	    .peek(order -> System.out.println("Processing Order: " + order.getOrderId() + " -> Category: " + order.getProduct().getCategory()))
	        	    .collect(Collectors.groupingBy(n->n.getProduct().getCategory(),Collectors.counting()));
	        
	        count.forEach((category,c)->{
	        	System.out.println("category :"+category+" count :"+c);
	        });
	        
	        
	        //find out who buys coke
	        List<Order> cokeOrders = orders.stream()
	        	  .filter(n->n.getProduct().getName().equals("Coke"))
	        	  .collect(Collectors.toList());
	        cokeOrders.forEach(n->System.out.println(n.getCustomer().getName()));
      
	        //count of customers from newyork
	        List<Order> newyorkCustomers = orders.stream()
	        	  .filter(n->n.getOrderAddress().equals("New York"))
	        	  .collect(Collectors.toList());
	        System.out.println("customers from new york:");
	        newyorkCustomers.forEach(n->System.out.print(n.getCustomer().getName()+" "));
	        System.out.println();
	        
	        //group by city 
	        Map<String, List<Order>> groupByCity = orders.stream()
	        	  .distinct()
	        	  .collect(Collectors.groupingBy(n->n.getOrderAddress()));
	        groupByCity.forEach((n,l)->{
	        	System.out.println("city :"+n);
	        	l.forEach(order->System.out.print(order.getCustomer().getName()+" \n"));
	        });
        
	        
	        //group customers based on location
	        System.out.println("groupByLoc.................................");
	         Map<String, List<Order>> groupByLoc = orders.stream()
	        		.peek(order -> System.out.println("Processing Order: " + order.getOrderId()))
	        		.distinct()
	        		.collect(Collectors.groupingBy(n->n.getOrderAddress()));
	        
	         
	        groupByLoc.forEach((m,l)->{
	        	l.forEach(list->System.out.println(list.getCustomer().getName()));
	        });
	        
	        Map<String, List<Order>> groupByCustomerAddress = orders.stream()
	        	    .flatMap(order -> order.getCustomer().getAddresses().stream()
	        	        .map(address -> Map.entry(address, order))) // Pair each address with its order
	        	    .collect(Collectors.groupingBy(Map.Entry::getKey, // Group by address (key of the Map.Entry)
	        	        Collectors.mapping(Map.Entry::getValue, Collectors.toList()))); // Collect orders as values

	        	// Print the grouped result
	        	groupByCustomerAddress.forEach((address, ordersList) -> {
	        	    System.out.println("Address: " + address);
	        	    ordersList.forEach(order -> System.out.println("  Order ID: " + order.getOrderId()));
	        	});

	        	OptionalDouble max = orders.stream()
	        		   .mapToDouble(n->n.getTotalAmount())
	        		   .max();
	        	System.out.println("max total amount :$"+max.getAsDouble());
	        	
	        	OptionalDouble min = orders.stream()
		        		   .mapToDouble(n->n.getTotalAmount())
		        		   .min();
	        	System.out.println("min total amount :$"+min.getAsDouble());
	        	
	        	//alternative  ways for max and min
	        	Optional<Order> max2 = orders.stream().max(Comparator.comparing(Order::getTotalAmount));
	        	Optional<Order> min2 = orders.stream().min((o1,o2)->Double.compare(o1.getTotalAmount(),o2.getTotalAmount()));
	        	System.out.println("max and min :$"+max2.get().getTotalAmount()+",$"+min2.get().getTotalAmount());
	        	
	        	Optional<Order> secondMax = orders.stream()
		        		   .sorted(Comparator.comparing(Order::getTotalAmount).reversed())
		        		   .skip(1)
		        		   .findFirst();
		        	System.out.println("second max total amount :$"+secondMax.get().getTotalAmount());
		        	
		        	
		       //finding most expensive order per category
		        Map<String, Optional<Order>> collect = orders.stream()
		        	       .collect(Collectors.groupingBy(
		        			  order->order.getProduct().getCategory(),
		        			  Collectors.maxBy(Comparator.comparing(Order::getTotalAmount))
		        			  ));
		        collect.
		        forEach((c,p)->System.out.println("category of "+c+" and most expensive order id and price :"+p.get().getOrderId()+" & $"+p.get().getTotalAmount()));
	        
		        
		        //total revenue for product
		        Map<String, Double> revenue = orders.stream()
		        	  .collect(Collectors.groupingBy(
		        			  order->order.getProduct().getName(),
		        			  Collectors.summingDouble(order->order.getTotalAmount())
		        			  ));
		        revenue.forEach((product,amount)->System.out.println(product+" and its total revenue $"+amount));
      
		        //finding the customer with most orders
		        Map<Customer, Long> mostOrders = orders.stream()
		        	  .collect(Collectors.groupingBy(
		        			  order->order.getCustomer(),
		        			  Collectors.counting()
		        			  ));
		        Optional<Entry<Customer, Long>> topOrder = mostOrders.entrySet().stream()
		        					 .max(Map.Entry.comparingByValue());
		        topOrder.ifPresent(entry -> {
		            System.out.println("Customer: " + entry.getKey().getName() + ", Orders: " + entry.getValue());
		        });
		        
		        //list of all orders by customer each
		        Map<Customer, List<Order>> each = orders.stream()
	        	  .collect(Collectors.groupingBy(
	        			  order->order.getCustomer()));
		        each.forEach((k,v)->{
		        	System.out.print(k.getName()+" :");
		        	v.forEach(o->System.out.print(" "+o.getProduct().getName()));
		        	System.out.println();
		        });
		        
		        //finding the city with revenue
		        Map<String, Double> revenueByCity = orders.stream()
		        	  .collect(Collectors.groupingBy(order->order.getOrderAddress(),
		        			  Collectors.summingDouble(Order::getTotalAmount)));
	        	
		        revenueByCity.forEach((s,d)->System.out.println(s+" and its revenue "+d));	  
	
		        //finding the city with highest revenue
		        Optional<Order> highestRevenue = orders.stream()
		        	  .max(Comparator.comparing(Order::getTotalAmount));
		        System.out.println("highest revenue city :"+highestRevenue.get().getOrderAddress());
		        
		        //avg rate of each customer
		        Map<Customer, Double> average = orders.stream()
	        	  .collect(Collectors.groupingBy(Order::getCustomer,Collectors.averagingDouble(Order::getTotalAmount)));
		        
		        average.forEach((c,d)->System.out.println(c.getName()+" avg purchase rate :$"+d));
		        
		        
		        //finding the Product Ordered Most Frequently
		        Map<Product, Long> frequently = orders.stream()
		        	  .collect(Collectors.groupingBy(Order::getProduct,Collectors.counting()));
		        Optional<Map.Entry<Product, Long>> mostOrderedProduct = frequently.entrySet().stream()
		        	    .max(Map.Entry.comparingByValue());

		        	mostOrderedProduct.ifPresent(entry -> {
		        	    System.out.println("Product: " + entry.getKey().getName() + ", Orders: " + entry.getValue());
		        	});
		        	
		        //Find Orders Within a Date Range
		        LocalDate startDate=LocalDate.of(2024,11,01);
		        LocalDate endDate=LocalDate.of(2024, 11,30);
		        List<Order> novemberOrders = orders.stream()
		        	  .filter(order->!order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
		        	  .collect(Collectors.toList());
		        
		        novemberOrders.forEach(order->System.out.println(order.getProduct().getName()+" order date "+order.getOrderDate()));
		        
		        //finding most recent order
		        Optional<Order> recentOrder = orders.stream()
		        	  .max(Comparator.comparing(Order::getOrderDate));
		        System.out.println("Recent order is :"+recentOrder.get().getProduct().getName()+" , "+recentOrder.get().getOrderDate());
		        
		        // Group Orders by Year and Month
		        Map<LocalDate, List<Order>> groupByDate = orders.stream()
		        	  .collect(Collectors.groupingBy(order->order.getOrderDate()));
		        
		        groupByDate.forEach((d,l)->{
		        	System.out.println(d);
		        	l.forEach(o->System.out.println(o.getProduct().getName()));
		        });
		        
//		        Find Orders Placed on Weekends
		        List<Order> ordersOnWeekend = orders.stream()
		        	  .filter(order->{
		        		  DayOfWeek day = order.getOrderDate().getDayOfWeek();
		        	      return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
		        	  })
		        	  .toList();
		        ordersOnWeekend.forEach(order -> 
		        System.out.println("Order ID: " + order.getOrderId() + ", Date: " + order.getOrderDate())
		    );
		        
		        
		        //finding order by month
		        Map<Month, List<Order>> ordersByMonth = orders.stream()
	        	  .collect(Collectors.groupingBy( order->order.getOrderDate().getMonth()));
		       	        
		        
		        ordersByMonth.forEach((month,order)->{
		        System.out.println(month);
		       System.out.println(order);
		        } );
		        
		        
		        //finding order by year and count
		        Map<Integer, Long> countOrderPerYear = orders.stream()
		        .collect(Collectors.groupingBy( order->order.getOrderDate().getYear(),
		        		Collectors.counting()
		        		));
		        
		        countOrderPerYear.forEach((year,c)->System.out.println(year+" order count :"+c));
		        
		        
		        
		        
		        //generating random 15 orders using loop
//        Random random=new Random();
//        for(int i=0;i<15;i++) {
//        	//generating random customer
//            Customer customer = customers.get(random.nextInt(customers.size()));
//            
//            //generating random product
//            Product product = products.get(random.nextInt(products.size()));
//            
//            //generating random adress
//            String orderAddress = customer.getAddresses().get(random.nextInt(customer.getAddresses().size()));
//            
//            //generating random quantity,price
//            int quantity=random.nextInt(10)+1; 
//            double total=quantity*product.getPrice();
//            
//            //generating random date
//            long millis = System.currentTimeMillis() - (random.nextInt(30) * 24 * 60 * 60 * 1000L);
//            Date orderDate = new Date(millis);
//            
//            //generating random order
//            Order order=new Order("o1",customer,product,quantity,total, orderAddress,orderDate );
//            
//            System.out.println(order);
//        }
//        
        		
	}
	
  

}
