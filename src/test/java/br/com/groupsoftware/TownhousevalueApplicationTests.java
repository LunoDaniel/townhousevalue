package br.com.groupsoftware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.groupsoftware.service.TownHouseManagerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TownhousevalueApplicationTests {

	@Autowired
	private TownHouseManagerService mangerService;
	
	@Test
	public void contextLoads() {
		mangerService.calculateTownHouseBlockValue();
	}

}
