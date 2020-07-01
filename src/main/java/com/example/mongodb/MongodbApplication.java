package com.example.mongodb;

import com.example.mongodb.model.*;
import com.example.mongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MongodbApplication implements CommandLineRunner {

	@Autowired
	private ArtistRepository artistRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private EventRepository eventRepository;
	@Autowired
	private GenreRepository genreRepository;
	@Autowired
	private ListenerRepository listenerRepository;
	@Autowired
	private LocationRepository locationRepository;
	@Autowired
	private OrganizerRepository organizerRepository;
	@Autowired
	private PerformanceRepository performanceRepository;
	@Autowired
	private PublisherRepository publisherRepository;
	@Autowired
	private PreferenceRepository preferenceRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		City warsaw = new City("Warsaw");
		City berlin = new City("Berlin");
		City vienna = new City("Vienna");
		City madrid = new City("Madrid");
		City wroclaw = new City("Wroclaw");
		City barcelona = new City("Barcelona");

		cityRepository.save(warsaw);
		cityRepository.save(berlin);
		cityRepository.save(vienna);
		cityRepository.save(madrid);
		cityRepository.save(wroclaw);
		cityRepository.save(barcelona);

		List<City> polandCities = new ArrayList<City>();
		polandCities.add(warsaw);
		polandCities.add(wroclaw);

		List<City> germanCities = new ArrayList<City>();
		germanCities.add(berlin);

		List<City> austriaCities = new ArrayList<City>();
		austriaCities.add(vienna);

		List<City> spainCities = new ArrayList<City>();
		spainCities.add(barcelona);
		spainCities.add(madrid);

		List<City> ukCities = new ArrayList<City>();

		Country poland = new Country("Poland", polandCities);
		Country german= new Country("German", germanCities);
		Country austria = new Country("Austria", austriaCities);
		Country spain = new Country("Spain", spainCities);
		Country uk = new Country("United Kingdom", ukCities);


		countryRepository.save(poland);
		countryRepository.save(german);
		countryRepository.save(austria);
		countryRepository.save(spain);
		countryRepository.save(uk);

		Genre hiphop = new Genre("Hip hop");
		Genre jazz = new Genre("Jazz");
		Genre pop = new Genre("Pop");
		Genre rb = new Genre("R&B");
		Genre rock = new Genre("Rock");

		genreRepository.save(hiphop);
		genreRepository.save(jazz);
		genreRepository.save(pop);
		genreRepository.save(rb);
		genreRepository.save(rock);

		Organizer cosmopoliteScene = new Organizer("Cosmopolite Scene", "+ 43 887949019", "1234567893");
		Organizer avocadoArtists = new Organizer("Avocado Artists", "+ 43 887901919", "1232019493");
		Organizer musicVillage = new Organizer("Music Village", "+ 48 298379019", "0291867893");

		organizerRepository.save(cosmopoliteScene);
		organizerRepository.save(avocadoArtists);
		organizerRepository.save(musicVillage);

		Publisher arEditions = new Publisher("A-R Editions, Inc.");
		Publisher abkcoMusic = new Publisher("ABKCO Music, Inc.");
		Publisher airDeluxe = new Publisher("Air Deluxe Music Group");
		Publisher brumleyMusic = new Publisher("Brumley Music");
		Publisher fliArtists = new Publisher("FLi Artists");

		publisherRepository.save(arEditions);
		publisherRepository.save(abkcoMusic);
		publisherRepository.save(airDeluxe);
		publisherRepository.save(brumleyMusic);
		publisherRepository.save(fliArtists);

		Location salaGotycka = new Location("Sala Gotycka w Starym Klasztorze", wroclaw, "Purkyniego 1, 62-123", "+48 556737482", 400, "staryklasztor.pl", "Default description");
		Location a2 = new Location("Centrum Koncertowe A2", wroclaw, "Góralska 5, 53-610", "+48 666737482", 1000, "cka2.pl", "Default description");
		Location progresja = new Location("Progresja", warsaw, "Forst Wola 22, 02-258", "+48 936478842", 1500, "progresja.com", "Default description");
		Location bankAustriaHalle = new Location("Bank Austria Halle", vienna, "Guglgasse 8, 1110", "+43 676737482", 1750, "bah.com", "Default description");
		Location razzmatazz = new Location("Razzmatazz", barcelona, "Carrer de Pamplona, 88, 08018", "+46 928377482", 2000, "razzmatazz.com", "Default description");
		Location lariviera = new Location("La Riviera", madrid, "Paseo Bajo de la Virgen del Puerto", "+46 828377482",1500, "salariviera.com", "Default description");

		locationRepository.save(salaGotycka);
		locationRepository.save(a2);
		locationRepository.save(progresja);
		locationRepository.save(bankAustriaHalle);
		locationRepository.save(razzmatazz);
		locationRepository.save(lariviera);

		Artist eminem = new Artist("Eminem", arEditions, hiphop,  uk, "https://firebasestorage.googleapis.com/v0/b/library-3fe88.appspot.com/o/images%2F1579020117053.jpg?alt=media&token=fbaasas717-14c6-4391-ae76-707f82e8629f", "Default description");
		Artist britneySpears = new Artist("Britney Spears", arEditions, pop, spain, "https://firebasestorage.googleapis.com/v0/b/library-3fe88.appspot.com/o/images%2Fsasas17053.jpg?alt=media&token=fba87717-14c6-4391-ae76-707f82e8629f", "Default description");
		Artist adele = new Artist("Adele", arEditions, pop,  german, "https://firebasestorage.googleapis.com/v0/b/library-3fe88.appspot.com/o/images%2F1579020117053.jpg?alt=media&token=fasasasdc6-4391-ae76-707f82e8629f", "Default description");
		Artist jackWhite = new Artist("Jack White", fliArtists, rock, german, "https://firebasestorage.googleapis.com/v0/b/library-3fe88.appspot.com/o/images%2F1579020117053.jpg?alt=media&token=fboososoc6-4391-ae76-707f82e8629f", "Default description");
		Artist theBlackKeys = new Artist("The Black Keys", airDeluxe, rock, poland, "https://firebasestorage.googleapis.com/v0/b/library-3fe88.appspot.com/o/images%2F1579020117053.jpg?alt=media&token=fba87pasppspa391-ae76-707f82e8629f", "Default description");
		Artist cageTheElephant = new Artist("Cage The Elephant", brumleyMusic, rock, spain, "https://firebasestorage.googleapis.com/v0/b/library-3fe88.appspot.com/o/images%2F1579020117053.jpg?alt=media&token=fba87717-14c6-4391-a47438hnfddf29f", "Default description");

		artistRepository.save(eminem);
		artistRepository.save(britneySpears);
		artistRepository.save(adele);
		artistRepository.save(jackWhite);
		artistRepository.save(theBlackKeys);
		artistRepository.save(cageTheElephant);

		Listener jones = new Listener("Jack", "Jones", "+46 009878987", "jones@gmail.com", "admin123", new Date(1998, 2, 14), vienna);
		Listener brent = new Listener("Samantha", "Brent", "+76 898637827", "sam.brent@mail.com", "sam0203", new Date(1980, 2,3), berlin);
		Listener huxley = new Listener("Charlotte", "Huxley", "+45 993383992", "charlotte_123@gmail.com", "Char1kdk", new Date(1989, 12, 23), barcelona);
		Listener budd = new Listener("Brady", "Budd", "+48 883 993 727", "budd@gmail.com", "Hsdi899csj", new Date(1976, 9, 18), wroclaw);
		Listener karl = new Listener("John", "Karl", "+48 665774838", "john.karl@hamil.com", "ssssfj728", new Date(1964, 3,15), warsaw);
		Listener goody = new Listener("Carrie", "Goody", "+46 998737627", "carrie.goody12@gmail.com", "CariieKarl123", new Date(1987,4,27), warsaw);
		Listener ashley = new Listener("Ashley", "Ashley", "+43 878929092", "justAshley@gmail.com", "AshAshAsh3", new Date(1999, 11, 4), barcelona);

		listenerRepository.save(jones);
		listenerRepository.save(brent);
		listenerRepository.save(huxley);
		listenerRepository.save(budd);
		listenerRepository.save(karl);
		listenerRepository.save(goody);
		listenerRepository.save(ashley);

		List<Genre> listOfGenreJones = new ArrayList<Genre>();
		listOfGenreJones.add(pop);
		listOfGenreJones.add(rb);

		List<City> listOfCitiesJones = new ArrayList<City>();
		listOfCitiesJones.add(wroclaw);
		listOfCitiesJones.add(warsaw);
		listOfCitiesJones.add(berlin);

		List<Artist> listOfArtistsJones = new ArrayList<Artist>();
		listOfArtistsJones.add(theBlackKeys);
		listOfArtistsJones.add(jackWhite);
		listOfArtistsJones.add(cageTheElephant);

		Preference preferenceJones = new Preference("Jones preference", jones, listOfGenreJones, listOfCitiesJones, listOfArtistsJones);

		preferenceRepository.save(preferenceJones);

		Event britAndemCon = new Event("Britney Spears and Eminem concert", cosmopoliteScene, "Concert", new Date(2019,4,12), new Time(21,00,00), new Date(2019, 4,12), new Time(24,00,00), 12, progresja);
		Event popFestival = new Event("Pop Festival in Barcelona", avocadoArtists, "Festival", new Date(2019,8,22), new Time(11,00,00), new Date(2019, 8,29), new Time(11,00,00), 18, razzmatazz);
		Event theBlackKeysCon = new Event("Adele", avocadoArtists, "Concert", new Date(2018, 7, 14), new Time(18,0,0), new Date(2018, 7, 14), new Time(21,0,0), 7, a2);

		eventRepository.save(britAndemCon);
		eventRepository.save(popFestival);
		eventRepository.save(theBlackKeysCon);

		Performance britneySpearsPerf1 = new Performance("Britney Spears Performance", britneySpears, britAndemCon, new Date(2019,4,12), new Time(21,30,0), new Date(2019,4,12), new Time(22,15,0));
		Performance eminemPerf1 = new Performance("Eminem Performance", eminem, britAndemCon, new Date(2019,4,12), new Time(22,30,0), new Date(2019,4,12), new Time(24,0,0));
		Performance britneySpearsPerf2 = new Performance("Britney Spears Performance in Festival", britneySpears, popFestival, new Date(2019,8,22), new Time(19,0,0), new Date(2019,8,22), new Time(21,00,0));
		Performance eminemPerf2 = new Performance("Eminem Performance in Festival", eminem, popFestival, new Date(2019,8,24), new Time(19,0,0), new Date(2019,8,24), new Time(21,00,0));
		Performance adelePerf1 = new Performance("Adele Performance in Festival", adele, popFestival, new Date(2019,8,26), new Time(19,0,0), new Date(2019,8,26), new Time(21,00,0));
		Performance theBlackKeysPerf1 = new Performance("The Black Keys Performance", theBlackKeys, theBlackKeysCon, new Date(2018,7,14), new Time(18,0,0), new Date(2018,7,14), new Time(21,0,0));

		performanceRepository.save(britneySpearsPerf1);
		performanceRepository.save(eminemPerf1);
		performanceRepository.save(britneySpearsPerf2);
		performanceRepository.save(eminemPerf2);
		performanceRepository.save(adelePerf1);
		performanceRepository.save(theBlackKeysPerf1);

	}
}
