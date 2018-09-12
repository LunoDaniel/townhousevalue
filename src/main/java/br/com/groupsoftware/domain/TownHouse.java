package br.com.groupsoftware.domain;

import java.util.List;

public class TownHouse {

	private List<Block> blocks;
	private String name;

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
