# An example Vaadin Portlet

This is an example Vaadin Portlet built for Liferay+Vaadin Webinar in May 2014. It uses the user database in Liferay and user Vaadin UI to update it.

Essentials in this demo:

 * The new "self-contained packaging". Vaadin libraries and generated resources are in portlets wars. This packanging method makes most task simpler, e.g. one can start to update Vaadin 6 portlets to Vaadin 7 - one by one.
 * The example uses the upcoming Valo theme. To be officially released in 7.3. This, even with its basic settings, fit better for the new theme in latest Liferay  versions.
 
To start playing around with this project, you'll need to create "liferay" profile to your Maven settings. Check out "Configuring your Liferay Maven Project" part in [Liferay documentation](https://www.liferay.com/documentation/liferay-portal/6.2/development/-/ai/developing-plugins-using-maven-liferay-portal-6-2-dev-guide-02-en).

E.g. following snippet in your .m2/settings.xml

```
    <profiles>
        <profile>
            <id>liferay</id>
            <properties>
                <liferayinstall>/Users/youraccount/Applications/liferay-portal-6.2-ce-ga2</liferayinstall>
                <plugin.type>portlet</plugin.type>
                <liferay.version>6.2.1</liferay.version>
                <liferay.maven.plugin.version>6.2.1</liferay.maven.plugin.version>
                <liferay.auto.deploy.dir>${liferayinstall}/deploy</liferay.auto.deploy.dir>
                <liferay.app.server.deploy.dir>${liferayinstall}/tomcat-7.0.42/webapps</liferay.app.server.deploy.dir>
                <liferay.app.server.lib.global.dir>${liferayinstall}/tomcat-7.0.42/lib/ext</liferay.app.server.lib.global.dir>
                <liferay.app.server.portal.dir>${liferayinstall}/tomcat-7.0.42/webapps/ROOT</liferay.app.server.portal.dir>
            </properties>      
        </profile>
    </profiles>

```

