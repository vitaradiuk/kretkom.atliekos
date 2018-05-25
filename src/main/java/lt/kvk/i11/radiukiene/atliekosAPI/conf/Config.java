/*package lt.kvk.i11.radiukiene.atliekosAPI.conf;


import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lt.kvk.i11.radiukiene.atliekosAPI.service.ServiceImpl;
import lt.kvk.i11.radiukiene.atliekosAPI.service.ServiceInterface;



 * 
 * Dispatcher or configuration class
 
@Configuration
@EnableAsync
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = "lt.kvk.i11.radiukiene.atliekosAPI")
public class Config extends WebMvcConfigurerAdapter {

	@Bean
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setMaxPoolSize(10); // When you send a task to the
											// executor, //it tries to use a
											// pooled thread for the execution
											// of this task, to avoid continuous
											// spawning of threads.
		taskExecutor.setThreadNamePrefix("Executor-");
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Bean
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return new SimpleAsyncUncaughtExceptionHandler();
	}

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/"); // address of pages
		resolver.setSuffix(".jsp"); // format
		return resolver;
	}

	@Bean
	public SimpleMappingExceptionResolver exceptionMapping() {
		SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
		return exceptionResolver;
	}

	// Service Configuration
	@Bean
	public ServiceInterface service() { // service
		return new ServiceImpl();
	}
}
*/