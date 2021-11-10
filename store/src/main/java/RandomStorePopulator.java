import com.github.javafaker.Faker;
import com.github.javafaker.Stock;

public class RandomStorePopulator {

    Faker faker = new Faker();

    Stock name = faker.stock();
}
