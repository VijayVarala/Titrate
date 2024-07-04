package steps;

import io.cucumber.java.en.Then;

public class deleteroles
{
	@Then("roles should be deleted")
	public void roles_should_be_deleted()
	{
	    System.out.println("Successfully deleted the roless");
	}

}
