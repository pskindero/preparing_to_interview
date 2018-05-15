# Guice vs Weld (Java EE) vs Spring CDI

## Guice

##### Doc: https://github.com/google/guice/wiki/GettingStarted

###### How to enable/configure
You need to Define GuiceModel an create injector using this model.

###### Injecting and wiring:
@Inject (javax)
@Named(NAME) (javax)
@Provides
using annotation (@@BindingAnnotation)

###### Scopes:
@Singleton (javax)
@RessionScoped
@RequestScoped



## Weld 

##### Doc: http://docs.jboss.org/weld/reference/latest-master/en-US/html_single/#intro)

######Injecting and wiring:
@Inject
@Named(NAME)

Bean types:
@Local
@Stateful

Scopes:
@SessionScoped



## Spring

##### Doc: https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-spring-beans-and-dependency-injection.html
