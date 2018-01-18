package guru.springfamework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springfamework.domain.Category;
import guru.springfamework.repositories.CategoryRepository;

/* CommandLineRunner is specific to SpringBoot. Allows us to run application code on startup.
 * Earlier in the course there was an example of events that was not specific to SpringBoot.
 * I should go check that out. 
 */
@Component
public class Bootstrap implements CommandLineRunner {
	private CategoryRepository categoryRepository;
	
	public Bootstrap(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	/**
	 * gets called on startup
	 * any arguments passed to the JVM will get passed here
	 * as well. Don't need for this example
	 */
	@Override
	public void run(String... args) throws Exception {
		Category fruits = new Category();
		fruits.setName("Fruits");

		Category dried = new Category();
		dried.setName("Dried");

		Category fresh = new Category();
		fresh.setName("Fresh");

		Category exotic = new Category();
		exotic.setName("Exotic");

		Category nuts = new Category();
		nuts.setName("Nuts");

		categoryRepository.save(fruits);
		categoryRepository.save(dried);
		categoryRepository.save(fresh);
		categoryRepository.save(exotic);
		categoryRepository.save(nuts);
		
		System.out.println("Data Loaded " + categoryRepository.count());
	}
}
