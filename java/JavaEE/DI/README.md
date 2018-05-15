# Guice vs Weld (Java EE) vs Spring CDI

## Guice

##### Doc: https://github.com/google/guice/wiki/GettingStarted

###### How to enable/configure
You need to Define GuiceModel an create injector using this model.

###### Injecting and wiring:
@Inject (javax)  
@Named(NAME) (javax)  
@Provides  
using annotation @BindingAnnotation  

###### Scopes:
@Singleton (javax)  
@RessionScoped  
@RequestScoped - default  



## Weld 

##### Doc: http://docs.jboss.org/weld/reference/latest-master/en-US/html_single/#intro

###### How to enable/configure
beans.xml

###### Injecting and wiring:
@Inject  
@Resource -  enables you to inject any resource available in the JNDI namespace into any container-managed object, such as a servlet, an enterprise bean, or a managed bean  
@Named(NAME)  
@Produces  
using annotation @Qualifier  
@Alternative  

###### Bean types:
@Local  
@Stateful  

###### Scopes
@RequestScoped - a user's interaction with a web application in a single HTTP request.
@SessionScoped - a user's interaction with a web application across multiple HTTP requests.
@ApplicationScoped - shared state across all users' interactions with a web application.
@Dependent - the default scope if none is specified; it means that an object exists to serve exactly one client (bean) and has the same lifecycle as that client (bean).
@ConversationScoped - not important

###### Constructing and destoying
@PostConstruct
@PreDestroy

###### Predefined beans
UserTransaction
Principal
Validator
ValidatorFactory
HttpServletRequest
HttpSession
ServletContext



## Spring

##### Doc: https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-spring-beans-and-dependency-injection.html

###### Injecting
@Required

###### Scopes
singleton - (Default) scopes a single bean definition to a single object instance per Spring IoC container.  
prototype - scopes a single bean definition to any number of object instances.  
request - scopes asingle bean definition to the lifecycle of a single HTTP request; that is, each HTTP request has its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware Spring ApplicationContext.  
session - scopes a single bean definition to the lifecycle of an HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.  
application - scopes a single bean definition to the lifecycle of a ServletContext. Only valid in the context of a web-aware Spring ApplicationContext.  
websocket - scopes a single bean definition to the lifecycle of a WebSocket. Only valid in the context of a web-aware Spring ApplicationContext.  