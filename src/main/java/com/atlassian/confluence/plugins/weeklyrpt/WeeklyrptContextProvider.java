package com.atlassian.confluence.plugins.weeklyrpt;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;

public class WeeklyrptContextProvider extends AbstractBlueprintContextProvider {
    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext blueprintContext) {
        blueprintContext.put("vName", "Sherlock");
        blueprintContext.put("ContentPageTitle", "周报");
        blueprintContext.setTitle("dddddd");
/*
        // project id is used in the page report macros
        String projectId = (blueprintContext.get("projectId").toString().toUpperCase());
        blueprintContext.put("projectId", projectId);
        // project name is used in title
        String projectName = (blueprintContext.get("projectName").toString());
        blueprintContext.put("projectName", projectName);
        // page title
        projectName = (blueprintContext.get("projectName").toString());
        String contentPageTitle = projectId + ": " + projectName;
        blueprintContext.setTitle(contentPageTitle);
*/
        return blueprintContext;
    }
}
