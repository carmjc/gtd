package net.carmgate.gtd.actions;

import java.util.Collection;

import net.carmgate.gtd.jpa.beans.Stuff;
import net.carmgate.gtd.services.StuffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskListAction {

	@Autowired
	private StuffService stuffService;
	private Collection<Stuff> stuffs;

	/**
	 * @return the stuff list
	 */
	public Collection<Stuff> getStuffs() {
		return stuffs;
	}

	public void setStuffService(StuffService stuffService) {
		this.stuffService = stuffService;
	}

	/**
	 * Action public method
	 * @return
	 */
	public String show() {
		stuffs = stuffService.getStuffs();
		
		return "show";
	}
	
}
