package Book_com.example.Bookdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;


@Repository
public interface BookRepo extends JpaRepository<BookEntity, String> {
	
	

}
