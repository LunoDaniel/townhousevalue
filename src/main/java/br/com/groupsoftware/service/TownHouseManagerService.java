package br.com.groupsoftware.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.groupsoftware.domain.Apartment;
import br.com.groupsoftware.domain.Block;
import br.com.groupsoftware.domain.Cost;
import br.com.groupsoftware.domain.Owner;

@Service
public class TownHouseManagerService {

	public void calculateTownHouseBlockValue() {
		Block blockA = makeMockBockA();
		Block blockB = makeMockBockB();
		
		Double resultBlockA = blockA.getApartment().stream().mapToDouble(i -> i.getCost().getTownHouseValue()).sum();
		Double resultBlockB = blockB.getApartment().stream().mapToDouble(i -> i.getCost().getTownHouseValue()).sum();
		
		System.out.println("Valor do Comdominio do Block A:" + resultBlockA);
		System.out.println("Valor do Comdominio do Block B:" + resultBlockB);
	}
	
	private Block makeMockBockA() {
		Block blockA = new Block();
		
		Apartment apartment330 = new Apartment();
		Apartment apartment320 = new Apartment();
		Owner ownerApart330 = new Owner();
		Owner ownerApart320 = new Owner();
		Cost cost330 = new Cost();
		Cost cost320 = new Cost();

		cost330.setIdealFraction(74);
		cost330.setTownHouseValue(250.00);

		ownerApart330.setName("Romer");
		ownerApart330.setLastName("Simpson");

		apartment330.setOwner(ownerApart330);
		apartment330.setCost(cost330);

		cost320.setIdealFraction(48);
		cost320.setTownHouseValue(250.00);

		ownerApart320.setName("Luno");
		ownerApart320.setLastName("Batista");

		apartment320.setOwner(ownerApart320);
		apartment320.setCost(cost320);

		List<Apartment> apartmentsBlockA = new ArrayList<>();

		apartmentsBlockA.add(apartment330);
		apartmentsBlockA.add(apartment320);

		blockA.setApartment(apartmentsBlockA);
		
		return blockA;
	}
	
	private Block makeMockBockB() {
		Block blockB = new Block();
		
		Apartment apartment330 = new Apartment();
		Apartment apartment320 = new Apartment();
		Owner ownerApart330 = new Owner();
		Owner ownerApart320 = new Owner();
		Cost cost330 = new Cost();
		Cost cost320 = new Cost();

		cost330.setIdealFraction(100);
		cost330.setTownHouseValue(870.00);

		ownerApart330.setName("Romer");
		ownerApart330.setLastName("Simpson");

		apartment330.setOwner(ownerApart330);
		apartment330.setCost(cost330);

		cost320.setIdealFraction(43);
		cost320.setTownHouseValue(970.00);

		ownerApart320.setName("Luno");
		ownerApart320.setLastName("Batista");

		apartment320.setOwner(ownerApart320);
		apartment320.setCost(cost320);

		List<Apartment> apartmentsBlockA = new ArrayList<>();

		apartmentsBlockA.add(apartment330);
		apartmentsBlockA.add(apartment320);

		blockB.setApartment(apartmentsBlockA);
		
		return blockB;
	}
}
