package com.example.maven_samples;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.GreaterThan;
import org.mockito.internal.matchers.LessThan;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

	
	private greeter greeter;

	  @Before
	  public void setup() {
	    greeter = new greeter();
	  }

	  @Test
	  public void greetShouldIncludeTheOneBeingGreeted() {
	    String someone = "World";

	    assertThat(greeter.greet(someone), containsString(someone));
	  }

	  @Test
	  public void greetShouldIncludeGreetingPhrase() {
	    String someone = "World";

	    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
	  }

	    @Test
	  public void greetShouldIncludeGreetingMessage() {
	    String someone = "World, Thanks you making me Happy";

	    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
	  }
	    
	    @Test
		  public void greetShouldIncludeGreetingThanks() {
		    String someone = "World, Thank you a lot";

		    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
		  }
}
