BeanPostProcessor allows to setup and tune all application beans before they will appear in 
the IoC container. 

Use cases:
1. The BeanPostProcessors are used to implement the declarative logic
2. Use the method postProcessBeforeInitialization if you want to tune the object
3. Use the method postProcessAfterInitialization if you want to be sure that all methods
annotated with @PostConstruct have already been invoked

Examples of the use cases:
1. The BeanPostProcessors are used to process the custom made annotations