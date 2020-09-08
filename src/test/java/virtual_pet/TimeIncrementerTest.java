/*package virtual_pet;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.powermock.api.easymock.PowerMock.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(VirtualPetsContainer.class)

public class TimeIncrementerTest {
  
	
	@Mock
	VirtualPetsContainer vpc;
	
	@Test
    public void testRun () {
		expect(VirtualPetsContainer.getInstance()).andReturn(vpc);
		expect(vpc.isRunning()).andReturn(true, true, false);
		
        TimeIncrementer ti = new TimeIncrementer(); 
        
        
        
    }
    
}
*/