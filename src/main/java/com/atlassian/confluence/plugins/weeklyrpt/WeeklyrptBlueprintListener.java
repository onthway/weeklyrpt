package com.atlassian.confluence.plugins.weeklyrpt;

import com.atlassian.confluence.plugins.createcontent.api.events.BlueprintPageCreateEvent;
import com.atlassian.event.api.EventListener;
import com.atlassian.event.api.EventPublisher;
import com.atlassian.plugin.ModuleCompleteKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WeeklyrptBlueprintListener {

	private static final ModuleCompleteKey MY_BLUEPRINT_KEY = new ModuleCompleteKey("com.atlassian.confluence.plugins.weeklyrpt.weeklyrpt", "my-blueprint");
	private static final Logger log = LoggerFactory.getLogger(WeeklyrptBlueprintListener.class);


	public WeeklyrptBlueprintListener(EventPublisher eventPublisher) {
		eventPublisher.register(this); //demonstration only
	}

	@EventListener
	public void onBlueprintCreateEvent(BlueprintPageCreateEvent event){


		ModuleCompleteKey moduleCompleteKey = event.getBlueprintKey();

		if (MY_BLUEPRINT_KEY.equals(moduleCompleteKey)){
			//Take some action when
			//log.warn("WARN: Created a blueprint.");
		}
	}
}
