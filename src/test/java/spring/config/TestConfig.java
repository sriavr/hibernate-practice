package spring.config;

import com.sridhar.db.dao.ArticleDAO;
import com.sridhar.db.dao.FlightDAO;
import com.sridhar.model.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TestConfig {

    @Bean
    public ArticleDAO articleService(){
       return new ArticleDAO() {
            @Override
            public List<Article> getAllArticles() {
                List<Article> articles = new ArrayList<>();
                Article article = new Article();
                article.setTitle("Krishna chastises Kalindi");
                List<Category> categories = new ArrayList<>();
                categories.add(new Category("category 1"));
                categories.add(new Category("category 2"));
                article.setCategories(categories);
                List<LocalKeyword> localKeywords = new ArrayList<>();
                localKeywords.add(new LocalKeyword("keyword 1"));
                localKeywords.add(new LocalKeyword("keyword 2"));
                article.setLocalKeywords(localKeywords);
                ParentPage parentPage = new ParentPage("parent1");
                article.setParentPage(parentPage);
                article.setBody("Krishna chastises Kalindi. How lucky was kalindi!!! Hari bol!!");
                article.setCreatedDate(new Date());
                articles.add(article);

                article = new Article();
                article.setTitle("The Stealing of the Boys and Calves by Brahmā");
                categories = new ArrayList<>();
                categories.add(new Category("Brahmā"));
                article.setCategories(categories);
                localKeywords = new ArrayList<>();
                localKeywords.add(new LocalKeyword("Mahajan"));
                localKeywords.add(new LocalKeyword("paśupāṅgajāya"));
                article.setLocalKeywords(localKeywords);
                parentPage = new ParentPage("parent1");
                article.setParentPage(parentPage);
                article.setBody("Although the incident concerning Aghāsura had been performed one year before, when the cowherd boys were five years old, when they were six years old they said, “It happened today.” What happened was this. After killing Aghāsura, Kṛṣṇa, along with His associates the cowherd boys, went for a picnic within the forest. The calves, being allured by green grasses, gradually went far away, and therefore Kṛṣṇa’s associates became a little agitated and wanted to bring back the calves. Kṛṣṇa, however, encouraged the boys by saying, “You take your tiffin without being agitated. I shall go find the calves.” And thus the Lord departed. Then, just to examine the potency of Kṛṣṇa, Lord Brahmā took away all the calves and cowherd boys and kept them in a secluded place.");
                article.setCreatedDate(new Date());
                articles.add(article);
                return articles;
            }

            @Override
            public Article getArticleById(String id) {
                return null;
            }

            @Override
            public void addArticle(Article article) {

            }

            @Override
            public void deleteArticle(Article article) {

            }

            @Override
            public boolean articleExists(String title, String category) {
                return false;
            }
        };

    }

    @Bean
    public FlightDAO flightDAO(){
        return new FlightDAO() {
            @Override
            public List<Flight> getAllFlights() {
                List<Flight> flights = new ArrayList<>();
                Flight flight = new Flight();
                flight.setCompanyPrefix("Vishnu");
                flight.setNumber("GARUDA");
                flights.add(flight);
                flight = new Flight();
                flight.setCompanyPrefix("Rama");
                flight.setNumber("HANUMAN");
                flights.add(flight);
                flight = new Flight();
                flight.setCompanyPrefix("Vishnu");
                flight.setNumber("ADISHESHA");
                flights.add(flight);
                return flights;
            }

            @Override
            public Flight getFlightById(String id) {
                return null;
            }

            @Override
            public void addFlight(Flight flight) {

            }

            @Override
            public void deleteFlight(Flight flight) {

            }
        };
    }
}
