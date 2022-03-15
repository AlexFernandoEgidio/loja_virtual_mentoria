package jdev.mentoria.lojavirtual;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EntityScan(basePackages = "jdev.mentoria.lojavirtual.model")
@ComponentScan(basePackages = {"jdev.*"})
@EnableJpaRepositories(basePackages = {"jdev.mentoria.lojavirtual.repository"})
@EnableTransactionManagement
public class LojaVirtualMentoriaApplication implements AsyncConfigurer {

	public static void main(String[] args) {
		
		
		SpringApplication.run(LojaVirtualMentoriaApplication.class, args);
	}
	
	
	
	@Override
	@Bean
	public Executor getAsyncExecutor() {
		
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		
		executor.setCorePoolSize(10);
		executor.setMaxPoolSize(20);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("Assyncrono Thread");
		executor.initialize();
		
		return executor;
	}

}
