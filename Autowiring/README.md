<h2>In Spring, autowiring, @Primary, and @Qualifier</h2> are mechanisms to manage how Spring injects beans into your application. They help resolve situations where multiple beans of the same type exist and you need control over which bean gets injected. Let's go through each concept.

<h2>1. Autowiring</h2>
Autowiring is a feature in Spring that allows the framework to automatically inject dependencies into a bean (class) without explicitly specifying them. Spring resolves and injects beans either by type or name based on the available beans in the application context.

<h2>How to Autowire:</h2>
Field Injection:</h2> Spring injects dependencies directly into fields. (Not recommended because it makes testing harder.)

<h2>Constructor Injection:</h2> The preferred way. Spring injects dependencies via the constructor
<h2>Setter Injection: Spring injects dependencies via setter methods.

<h2>2. @Primary</h2>
When there are multiple beans of the same type, Spring will not know which bean to inject and will throw a NoUniqueBeanDefinitionException. To resolve this, you can use the @Primary annotation to specify which bean should be the default when multiple beans of the same type are available.

<h2>3. @Qualifier</h2>
Sometimes, you may not want to rely on @Primary to choose the default bean, or you might have multiple beans where no default is appropriate. In these cases, you can use @Qualifier to explicitly tell Spring which bean to inject.

<h2>Summary:</h2>
Autowiring: Spring automatically resolves and injects dependencies into your classes.
@Primary: Used to define a default bean when multiple beans of the same type exist.
@Qualifier: Used to specify which exact bean to inject when there are multiple candidates.
These mechanisms allow Spring to effectively manage bean dependencies, providing flexibility when working with multiple beans of the same type.
