Confluence.Blueprint.setWizard('com.atlassian.confluence.plugins.weeklyrpt.weeklyrpt:create-by-sample-template', function(wizard) {
    wizard.on('submit.page1Id', function(e, state) {
        var vName = state.pageData.vName;
        if (!vName){
            alert('Please provide a name value.');
            return false;
        }
    });
});