import com.aakash.Employees.Chef;
import com.aakash.Employees.Waiter;
import com.aakash.IRestaurants.IEmployee;
import com.aakash.IRestaurants.IRestaurant;
import com.aakash.Menu.Item;
import com.aakash.MenuHelper.Menu;
import com.aakash.Restaurants.CafeOne;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waiter w1= new Waiter();
		w1.setId(0);
		w1.setName("abcd");
		w1.setSalary(1000);
		w1.setType("waiter");
		
		Chef c1=new Chef();
		c1.setId(1);
		c1.setName("cer");
		c1.setSalary(2000);
		c1.setType("chef");
		
		IRestaurant cone=new CafeOne();
		cone.setName("cafeone");
		
		cone.setAddress("123,street");
		
		cone.addEmployee(w1);
		cone.addEmployee(c1);
		System.out.println(cone.getEmployeeById(1).getSalary());
		
		Item i1=new Item("cold", "vanialla", 100, 10);
		Item i2=new Item("hot", "corella", 200, 10);
		
		Menu m1=new Menu();
		m1.AddToMenu(i1, 100);
		m1.AddToMenu(i2, 200);
		
		cone.setMenu(m1);
		
		cone.getMenu();
	}

}
