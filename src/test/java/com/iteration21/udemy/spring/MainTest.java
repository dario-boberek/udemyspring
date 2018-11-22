package com.iteration21.udemy.spring;


import com.in28minutes.spring.basics.step16.Step16;
import com.in28minutes.spring.basics.step14.BinarySearchPrototypeImpl;
import com.in28minutes.spring.basics.step14.BinarySearchSingletonImpl;
import com.in28minutes.spring.basics.step14.Step14;
import com.in28minutes.spring.basics.step15.Step15;
import com.in28minutes.spring.basics.step17.Step17;
import com.in28minutes.spring.basics.step18.Step18CdiApplication;
import com.in28minutes.spring.basics.step22.XmlContextApplicationStep22;
import com.in28minutes.spring.step19.springin5steps.Step19BasicApplication;
import com.in28minutes.spring.step23.springin5steps.XMLContextApplicationStep23;
import com.iteration21.udemy.spring.version1notcompliant.ComplexBusinessServiceV1;
import com.iteration21.udemy.spring.version2nospring.BubbleSortAlghoritmV2;
import com.iteration21.udemy.spring.version2nospring.ComplexBusinessServiceV2;
import com.iteration21.udemy.spring.version2nospring.SortingAlgorithmV2;
import com.iteration21.udemy.spring.version3withspring.ComplexBusinessServiceV3Impl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


import static org.junit.Assert.assertTrue;

/**
 * focus: https://www.noisli.com/
 * <p>
 * BHP:
 * tabata timer on android 5/2
 * <p>
 * analyze productivity:
 * 1) https://wakatime.com/dashboard
 *      tu widze tylko 2 tygodnie ostatnie (wersja za FREE) dlatego powinienenm sobie gdzies zapisywac wydajnosc
 *
 * 2) https://www.rescuetime.com/dashboard?src=client
 * 3) IDEA time tracking ? git helper?
 * 4) android timelaps program
 * <p>
 * Continuous Integration/Delivery
 * 1) https://travis-ci.org/iteration21/udemyspring
 * 2) https://dashboard.heroku.com/apps/
 * 3) https://udemyspringend.herokuapp.com/
 * <p>
 * static code quality
 * 1) sonar:
 * mvn sonar:sonar -Dsonar.projectKey=iteration21_udemyspring -Dsonar.organization=iteration21-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=bf25ecd40502a7b735d4607ab8012cbdddf59a3c
 * https://sonarcloud.io/code?id=iteration21_udemyspring
 * 2) CheckStyle
 * 3) FindBugs-IDEA
 * 4) junit coverage (build in in idea)
 *
 * 	i21t reopen this
 * 	     https://github.com/iteration21/udemyspring/tree/master
 * 	     https://travis-ci.org/iteration21/udemyspring
 * 	     https://dashboard.heroku.com/apps/udemyspring
 * 	     https://udemyspring.herokuapp.com/
 */



//i21t spring boot testin HAMCREST / MOCKITIO / INTEGRATION - full examples https://stackabuse.com/how-to-test-a-spring-boot-application/

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest {

	public static final boolean VIDEO_DONE = true;
	public static final boolean VIDEO_NOT_DONE = false;

	@Test
	public void contextLoads() {
	}


	//---------------------------------------------------------------------------------------------
	// new lessons below that line




	@Test
	public void step29_SpringUnitTestingWithMockito() {

	}

	@Test
	public void step28_SpringUnitTestingWithAnXmlContext() {

	}


	@Test
	public void step27_SpringUnitTestingWithAJavaContext() {
		//com.in28minutes.spring.step29.springin5steps.basic.BinarySearchTest
	}

	@Test
	public void howToDeleteGitHistory() {
		/*
		git checkout --orphan TEMP_BRANCH
		git add -A
		git commit -am "Initial commit"
		git branch -D master
		git branch -m master
		git push -f origin master
		git branch --set-upstream-to=origin/master master  //i21> a to zeby idea smigala dalej

		s: https://gist.github.com/heiswayi/350e2afda8cece810c0f6116dadbe651
		*/
	}

	@Test
	public void mockitoModule() {
		//goto : com.i21.mockito123.MockitominiappApplicationTests

		//i21c: jak nie testowac.
		//com.i21.mockito123.fintech.ShityStubTests

		//i21c: jak uzywac mockito bez adnotacji.
		//com.i21.mockito123.fintech.FirstLevelMockingTests

		//i21c: jak ułatwić sobie zycie i uzywać mockito z adnotacjami.
		//com.i21.mockito123.fintech.SecondLevelMockingTests

	}

	@Test
	public void junitModule() {
		//goto : 	com.i21.junit123.HelloJUnitTests
	}

	@Test
	public void step26_readValuesFromExternalFile() {
		//i21c:
	}

	@Test
	public void step25_springContextBasicAnnotations() {
		//i21c: up untill now we were using @Component
		/*
		the other types of TYPE annotations are:
			@Service - for busienss layer objects "Business Service Facade"
			@Repositoru - encapsulationg storage
			@Controller - Controller in MVC pattern

		te adnotacje NIE zmieniają funkcjonalnosci beanów ale sa przydatne kiedy uzywamy AOP. Mechanizm AOP pozwala na pobranie adnotacji i w ten sposób wiemy do której
		warstwy aplikacji dana klasa nalazy


		lekcja nie wspomniała ale mamy tez adnotacje @Bean którą lokujemy na metodzie - umozliwia to parametryzowanie zwracanego obiektu (tailored object)
		dodatkowo @Bean mozemy uzyc jesi odpalamy 3rd party kod do ktorego nie mamy dostepu a chcemy miec "łapki" do tego kodu nw naszym applicationContexc


			DAO -> @Repository
			JDBC -> @Component

			QuickSortAlgorithm          -> @Service
			BubbleSortAlgorithm        -> @Service
			BinarySearchImpl             -> @Service


		 */
	}

	@Test
	public void setp24_OC_AppContext_BeanFactory() {
		//i21c: IOC container is a general concept and is not Spring specific..

		//i21c: applicationContext vs BeanFactory
		/*
		ApplicationContext have functionality of BeanFactory and some others..:
			1) Spring AOP features
			2) internationalzation
			3) WebApplicationContext out of the box.
			*all funcrionality needed for enterprise level applications.

		BeanFactory is suggested to be used ONLY when amount of available memory is low - IOT device.
			*spring-core - bean factory here, DI + Autowiring
		 */
	}

	@Autowired
	XMLContextApplicationStep23 step23;

	@Test
	public void step23_LastTimeWeTryToPlayAroundWithXMLs() {
		//i21c: po tej lekcji będziemy się juz tylko trzumac podejścia z adnotacjami zamiast XMLowego.
		step23.doIt();
	}



	//23 komentarze tutaj SpringIn5StepsBasicApplication

	@Autowired
	XmlContextApplicationStep22 step22;

	@Test
	public void step22_HistoricallPainInTheAssWithXmls() {
		step22.doIt();
	}

	@Autowired
	Step19BasicApplication step19n20;

	//i21c: hello Spring 5
	@Test
	public void step19n20_NoSpringBootAnymore() {
		step19n20.doIt();

		//error:  nie dzialaly testyi musialem je zacomentowac zeby calosc sie mogla kompilowac
	}

	@Autowired
	Step18CdiApplication step18;

	@Test
	public void step18_CDIAPI() {
		step18.doIt(new String[]{});
	}


	@Autowired
	Step17 step17;

	@Test
	public void step17_PreAndPostConstruct() {
		step17.doIt(new String[]{});
	}

	@Autowired
	Step16 step16;

	@Test
	public void step16_ComponentScanApplication() {
		step16.doIt(new String[]{});
	}

	@Autowired
	Step15 step15;

	@Test
	public void step15_AdvancedBeanScopes_AreDifferent() {
		//need to debug and observe logs
		step15.doIt(new String[]{});
	}

	@Autowired
	Step14 step14;

	@Test
	public void step14_BeanScopes_Different() {

		//Arrange
		String[] args = {};
		ApplicationContext ac = step14.getContext(args);

		//Act
		BinarySearchPrototypeImpl bspi1 = ac.getBean(BinarySearchPrototypeImpl.class);
		BinarySearchPrototypeImpl bspi2 = ac.getBean(BinarySearchPrototypeImpl.class);

		//Assert
		assertThat(bspi1, is(not(equalTo(bspi2))));
	}

	@Test
	public void step14_BeanScopes_Same() {

		//i21c BEAN SCOPE
		/*
		wyrózniamy:
			SINGLETON
			PROTOTYPE
			REQUEST - connected with HTTP request
			SESSION - connected with User session
		 */

		ApplicationContext applicationContext = step14.getContext(new String[]{});

		BinarySearchSingletonImpl binarySearch =
				applicationContext.getBean(BinarySearchSingletonImpl.class);

		BinarySearchSingletonImpl binarySearch1 =
				applicationContext.getBean(BinarySearchSingletonImpl.class);

		assertThat(binarySearch, is(equalTo(binarySearch1)));

	}

	@Test
	public void step12_and_13_AutowiringInDeepthByNameAndAtPrimary() {

		//i21c 3 rodziaje AUTOWIRE-owania
		//      1) poprzez typ i nazwę (private SortAlgorithm quickSortAlgorithm;)
		//      2) @Primary
		//      3) @Qualifie
		//
		// @Primary ma wyższy priorytet niz autowireowanie przez uzywanie nazwy
		//s: com.in28minutes.spring.basics.step12.SpringIn5StepsApplication

		//i21c issue: maven projekt wyszarzony
		// w zakładce "Maven projects" > prawy na module szarym > "unignore" > re-import
		// w wyniku w projekcie>module>zakladce dependancy pojawyly sie wszystkie brakujące zaleznosci
		// UWAGA: co prawa IDEA podpowiadala pojedyncze jary ale sam bym takiej struktury nie odtworzyl dobrze!! (z 40 zaleznosci w odpowiednich wersjach!)


	}

	/**
	 * part of Spring Level 1 - Introduction to Spring Framework in 10 Steps
	 * https://www.udemy.com/spring-tutorial-for-beginners/learn/v4/t/lecture/7725664?start=0
	 */

	@Test
	public void video17WhIsSpringPopular() {
		/*
		i21c why spring is so popular
			*   testing included in design, very easy to test (with mocks also)
			*   no plumbing code - if 100 lines of code its probably business logic. a lot of exceptions are UNCHECKED - we do not need to catch them..
			*   architecrural flexibility - modular design.
			*   staying current/relevant
		 */
		assertTrue(VIDEO_DONE);
	}


	@Test
	public void video16SpringProjects() {

		/*
		 i21c spring projects:
		    *   batch
		    *   security
		    *   HATEOAS
		    *   boot
		    *   cloud
		    *   data
		    *   integration

		    others... web services / mobile / session
		 */
		assertTrue(VIDEO_DONE);
	}


	@Test
	public void video15SpringModules() {
		/*
		i21c spring modules:
			*   data access/integration  (and sub-modules: JDBC/ORM/OXM/JMS/TRANSACTIONS)
			*   web  (and sub-modules: WEBSOCKET/SERVLET/WEB/PORTLET)
			*   AOP
			*   aspects
			*   instrumentation
			*   messaging
			*   core container (and sub-modules: BEANS/CORE/CONTEXT/SpEL)
			*   test

			... portlets outdated today
			... crosscutting concerns - modul junitow ktory dotyczy i weba i warstwy danych..
		 */
		assertTrue(VIDEO_DONE);

	}


	@Test
	public void video14ConstructorAndSetterInjection() {

		/*
		i21c jakie mamy typy wstrzykiwania?

		istnieją 3 typy wstrzykiwania:
				*   via constructor
				*   via setter
				*   no constructor or setter - tez sobie spring poradzi (@Autowired private SortAlgorithm sortAlgorithm;)

		* no setter injection is actually setter injection - spring is smart enough to autowire bean as if setter was present.

		//i21c czy ma znaczenie czy uzyjemy wstrzykiwania przez konstruktor czy przez setter?
		in previous versions of spring
				*   if property is MANDATORY for class to run properly we would place it as a constructor parameter (constructor injection then will take place)
				*   if property is not crucial for object to do its job, then we can use setter injection
		since @Autovired annotation there is no difference because if property will not be filled with object we will get a runtime error.

		 */

		assertTrue(VIDEO_DONE);
	}


	@Test
	public void video13DynamicAutoWiringAndTroubleshooting_AtPrimary() {

		/*

		i21c no bean found ERROR i multiple beans found ERROR - @Primary and making sure we have all annotations in place

		do
			com.iteration21.udemy.spring.basics.udemy411.sorting.QuickSortAlgorithm
		dodałem
			@Component
		i dostalem błąd:
			Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with
			name 'udemy411Application': Unsatisfied dependency expressed through field 'binarySearch';
			nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException:
			Error creating bean with name 'binarySearchImpl' defined in file ...\BinarySearchImpl.class]:
			Unsatisfied dependency expressed through constructor parameter 0;
			nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
			No qualifying bean of type 'com.iteration21.udemy.spring.basics.udemy411.sorting.SortAlgorithm' available:

			>>>>>>>>> expected single matching bean but found 2: bubbleSortAlgorithm,quickSortAlgorithm  <<<<<<<<<<

			SOLUTION: @Primary nadaje priorytet jesli wiecej niz 1 bean pasuje

		 */


		assertTrue(VIDEO_DONE);
	}



	@Test
	public void video12WhatIsHappeningInTheBackground() {

		assertTrue(VIDEO_DONE);

		/*

		//i21c stalkujemy narodziny beanów c.d. tym razem dodaliśmy konstruktor, jak zmieniły sie logi?

		i21> spring bez problemu autowire-uje prywatne zmienne
        @Autowired  private SortAlgorithm sortAlgorithm;
        in log:
                2018-10-22 20:04:04.419 DEBUG 3912 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : Autowiring by type from bean name 'binarySearchImpl' to bean named 'bubbleSortAlgorithm'

		i21> po dodaniu konstruktora z property Spring dodatkowo wykrywa i uzywa taką opcje autowire-owania
		    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		        super();
		        this.sortAlgorithm = sortAlgorithm;
		    }
		    in log:
				2018-10-22 20:08:33.263 DEBUG 15444 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'binarySearchImpl' via constructor to bean named 'bubbleSortAlgorithm'
		        2018-10-22 20:08:33.267 DEBUG 15444 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : Autowiring by type from bean name 'binarySearchImpl' to bean named 'bubbleSortAlgorithm'



		i21c  jaki jest cykl życia BEANÓ? analizowanie logów..

			i21> proces poszukiwania klas-beanów w obszarach component scann > spring boo szuka tm gdzie jest główna
			adnotacja @SpringBootApplication
			=========================================================

					2018-10-22 16:35:23.960 DEBUG 12524 --- [           main] .i.s.PathMatchingResourcePatternResolver : Resolved 	location pattern [classpath*:com/iteration21/udemy/spring/basics/udemy411/<><>.class] to resources [ ... ]
					2018-10-22 16:35:24.012 DEBUG 12524 --- [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [ ... BinarySearchImpl.class]
					2018-10-22 16:35:25.171 DEBUG 12524 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@3697186: defining beans [... ]; root of factory hierarchy



			i21> proces rejestrowania jake są zależności między beanami
			=================================================

					2018-10-22 16:35:25.248 DEBUG 12524 --- [           main] o.s.b.f.annotation.InjectionMetadata     : Registered injected element on class [com.iteration21.udemy.spring.basics.udemy411.Udemy411Application$$EnhancerBySpringCGLIB$$5c8ef929]: AutowiredFieldElement ...
					2018-10-22 16:35:25.260 DEBUG 12524 --- [           main] o.s.b.f.annotation.InjectionMetadata     : Processing injected element of bean 'udemy411Application': ...



			i21> proces tworzenia instancji, wrzucania ch do cachea i autowire-owania ich pomiędzy sobą na podstawie
			typu obiektu
			=======================================================

					2018-10-22 16:35:25.269 DEBUG 12524 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'binarySearchImpl'
					2018-10-22 16:35:25.269 DEBUG 12524 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating instance of bean 'binarySearchImpl'
					2018-10-22 16:35:25.269 DEBUG 12524 --- [           main] o.s.b.f.annotation.InjectionMetadata     : Registered injected element on class [com.iteration21.udemy.spring.basics.udemy411.services.BinarySearchImpl]: ...
					2018-10-22 16:35:25.269 DEBUG 12524 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Eagerly caching bean 'binarySearchImpl' to allow for resolving potential circular references
					2018-10-22 16:35:25.276 DEBUG 12524 --- [           main] o.s.b.f.annotation.InjectionMetadata     : Processing injected element of bean 'binarySearchImpl': ...
					2018-10-22 16:35:25.286 DEBUG 12524 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : Autowiring by type from bean name 'binarySearchImpl' to bean named 'bubbleSortAlgorithm'
					2018-10-22 16:35:25.286 DEBUG 12524 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Finished creating instance of bean 'binarySearchImpl'
					2018-10-22 16:35:25.286 DEBUG 12524 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : Autowiring by type from bean name 'udemy411Application' to bean named 'binarySearchImpl'



			i21> dużo pozniej, podczas wykonania programu, pobieramy zcacheowane instacje
			===============================================================

					2018-10-22 16:35:25.288 DEBUG 12524 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Returning cached instance of singleton bean 'binarySearchImpl'
					2018-10-22 16:35:26.296 DEBUG 12524 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Returning cached instance of singleton bean 'binarySearchImpl'



			i21> usuwanie instancji przy wyłączaniu programu (ciekawostka, do usuwania pojawił się nowy wątek	)
			==================================================================================

					2018-10-22 16:35:26.299 DEBUG 12524 --- [       Thread-1] o.s.b.f.s.DefaultListableBeanFactory     : Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@3697186: defining beans [...]; root of factory hierarchy


		i21c dodajemy logowanie springowe
			logging.level.org.springframework=DEBUG
			issue: nie wykrywał application.properties jako Spring Bootowe - nie podpowiadał BO nie mialem wlaczonego
			 pluginu spring boot

		 */
	}


	@Test
	public void video411UsingSpringFrameworkToManageDependencies() {
		assertTrue(VIDEO_DONE);
		/*
		i21c tight coupling - solution for it  WITCH SPRING

		> we need a COMPONENT SCAN on some packages to help Spring find beans.
		Spring boot automatically is scanning from this level: com.iteration21.udemy.spring.basics.udemy411.Udemy49Application
		and every sub-packages

		> spring is managing beens, dependancies, manages lifecycle of the beans,

		 */

	}


	@Test
	public void video410MakingTheBinarySearchAlgorithmExampleLooselyCoupled() {

        /*
        i21c tight coupling - solution for it (NON-SPRING solution)

        > 2 krokiem do uniknięcia tight coupling jest przekazanie interfejsu obiektu podzednego
        dodajemy interfejsy com.iteration21.udemy.spring.basics.udemy411.sorting.SortAlgorithm
        dizęki temu mamy mozliwosc dynamiecznej podmiany implementacji

        > to sie nazywa loosley coupled programming - przez interfejsy

        > podsumowanie, 2 koncepcje które trzeba rozumiec uczac sie springa to :
            1) DEPENDANCY INJECTION
            2) LOOSELY COUPLING PROGRAMMING

		kod w klasie:
			com.iteration21.udemy.spring.basics.udemy411.Udemy49Application
		wyglada tak:
			BinarySearchImpl binarySearch =
			new BinarySearchImpl(new QuickSortAlgorithm());
		tworzenie instancji QuickSortAlgorithm i przekazywanie jesj do BinarySearchImpl jest to czynnosc którą mozemy
		 powieżyc SPRINGowi.
		*/

	}

	@Test
	public void heyIHaveLicenceForNewIDELetsReinstall() {
		/*
		reinstalowalem intellij zeby miec wersje z 2018 z najnowsza licencją

		pluginy:
			BashSupport
			CheckStyle-IDEA
			Docker integration
			FindBugs-IDEA
			infinitest
			Key Promoter X
			Loombok Plugin
			Time Tracking
			Translation
			WakaTime
				installation: https://wakatime.com/intellij-idea
				sublime3 package
					sublime multi find /filter: https://github.com/davidpeckham/sublime-filterlines Ctrl+K > Ctrl+S
				notepad++ package error (plugin 32bit ale moja instalka notepad++ 64 bit)
				https://wakatime.com/dashboard
         */
	}


	@Test
	public void video49UnderstandingTightCoupling() {

		/*
		i21c tight coupling - czym jest

		> tight coupling, gdzies w srodku
			BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();    <--------- TIGHT COUPLING
			bubbleSortAlgorithm.sort()

		 > 1szym krokiem do uniknięcia tight coupling jest dynamiczne przekazywanie która instancja ma zostać
		 uzyta, mozna to zrobic bez uzycia springa (old school przez konstruktor np)
		 */

	}

	@Test
	public void heyWhatMavenDoIUse() {
		//https://scoop.sh/   <- one installed with this too

	}
	@Test
	public void heyMavenCanYouCompileFasterOnTablet() {
        /*
        jesli mam czas i silnego kompa to
        clean install

        jesli chce przyciac jak tylko sie da kompilowanie
        1) clean oddzielnie
        2) -T 4 install -offline -DMaven.test.skip=true
             -t 4                                          :               dotyczy 4 watkow
             -offline                                    :               maven nie bedzie sprawdzał artefaktow z neta
             -Dmaven.test.skip=true          :               ten propertas powoduje ze testy nawet się nie kompilują (jest silniejszy niz -DskipTests=true który wykonuje kompilacje)
                                                                             błędy kompilacji to ja mam w IDE na bierząco.

        wnioski:
        hykker 3,5 min do 35 sekund
        meta 45 sekund do 8 sekund :)
         */

	}



	@Test
	public void video08FastestApproachtoSolveAllYourExceptions() {

		//i21t przejrzec linka:                 https://github.com/in28minutes/in28minutes-initiatives/blob/master/The-in28Minutes-TroubleshootingGuide-And-FAQ/quick-start.md
		assertTrue(VIDEO_DONE);

        /*
        i21c setup FAQ
                filmik zawiera link do FAQ z problemami ktore pojawialy sie przy setupie
                https://github.com/in28minutes/in28minutes-initiatives/blob/master/The-in28Minutes-TroubleshootingGuide-And-FAQ/quick-start.md


        i21c róznice pomiedzy spring boot 1.X a 2.X
                w wersji pdf (ciagle updateowane)
                        https://github.com/in28minutes/spring-microservices/blob/master/spring-boot-2-0-0-Upgrade-notes.pdf

                w wersji filmu:
                        https://www.youtube.com/watch?v=e2J4NfJ1Mns

                        numeracja releasow boota:
                                 M1,M2,.. MX, RC1,RC2, RELEASE
                                 najpierw milestony, potem release candidate, na koncu sam release
                                 przyklad
                                 2.0.0 M1
                        ...

         //i21c off topic - sprign actuators - a co to?
         Spring actuator - prekonfigurowalny endpoint webowy w spring boot dzięki któremu mozemu podejrzec jaki jest status naszej aplikacji
                 w nowym springu dostajemy sie do actuatora poprzez linka http://localhost:8080/actuator

                 Unlike in previous versions, Actuator comes with most endpoints disabled.
                 Thus, the only two available by default are /health and /info.
                 s: https://www.baeldung.com/spring-boot-actuators

                 teoria:
                 https://www.youtube.com/watch?v=hieLEsp5cTk


         */
	}


	@Test
	public void video07IntroductionToSpringFramework() {

		//i21c hey Spring Boot - generting udemy2 module.
        /*
        thight coupling
        dependancy injection
        https://start.spring.io/ -> C:\meta\data\git\\udemyspring\\udemy2
        wygenerowalem proj bez zadnych zaleznosci.
        com.iteration21.udemy.spring.basics.udemy2.Udemy2ApplicationTests
         */


	}

	@Test
	public void video06IntroductionToSpringFramework() {
		//tylko link do https://github.com/in28minutes/spring-master-class/tree/master/01-spring-in-depth

	}

	@Test
	public void video05IntroductionToSpringFramework() {
		//w plikach *.md sa rozwiazania do krokow
		assertTrue(VIDEO_DONE);
	}

	/**
	 * https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html
	 */
	@Test
	public void video04ShowingOffWithStatistics() {

        /*

        ############################################################################################################
        ############################################################################################################
        ############################## book with auxilary steps instructions: ###############################################
        ############################################################################################################
        ############################################################################################################
       C:\\users\Darius\Dropbox\Public\read basket\2018 not synchronized\SpringMasterClass-CourseGuidev0.1.pdf

        ############################################################################################################
        ############################################################################################################
        ############################## TOC for sources: ################################################################
        ############################################################################################################
        ############################################################################################################

        1. Spring Level 1 to Level 6
        =====================
                        1.1. Spring Framework in 10 Steps	Spring - Level 1	Project Folder on Github
                                C:\meta\data\git\\udemyspring\src\main\resources\01-spring-in-depth

                        1.2. Spring in Depth	Spring - Level 2	Project Folder on Github
                                C:\meta\data\git\\udemyspring\src\main\resources\01-spring-in-depth.

                        1.3. Unit Testing with Spring Framework	Spring - Level 3	Project Folder on Github
                                C:\meta\data\git\\udemyspring\src\main\resources\01-spring-in-depth

                        1.4. Spring Boot in 10 Steps	Spring - Level 4	Project Folder on Github
                                C:\meta\data\git\\udemyspring\src\main\resources\00-framework-tool-introductions\05.Spring-Boot-Introduction-In-10-Steps

                        1.5. Spring AOP	Spring - Level 5	Project Folder on Github
                            C:\meta\data\git\\udemyspring\src\main\resources\03-spring-aop

                        1.6. Spring JDBC and JPA	Spring - Level 6	Project Folder on Github
                            C:\meta\data\git\\udemyspring\src\main\resources\04-spring-jdbc-to-jpa

        2. 5 Bonus Sections - Introduction to Tools and Frameworks
        =============================================
                        2.1 Title	Category	Github
                        Eclipse in 5 Steps	Introduction	Project Folder on Github
                            C:\meta\data\git\\udemyspring\src\main\resources\00-framework-tool-introductions\01.Eclipse-Introduction-in-5-steps

                        2.2 Maven in 5 Steps	Introduction	Project Folder on Github
                            C:\meta\data\git\\udemyspring\src\main\resources\00-framework-tool-introductions\02.Maven-Introduction-In-5-Steps

                        2.3 JUnit in 5 Steps	Introduction	Project Folder on Github
                            C:\meta\data\git\\udemyspring\src\main\resources\00-framework-tool-introductions\03.JUnit-Introduction-In-5-Steps

                        2.4 Mockito in 5 Steps	Introduction	Project Folder on Github
                            C:\meta\data\git\\udemyspring\src\main\resources\00-framework-tool-introductions\04.Mockito-Introduction-In-5-Steps

                        2.5 Basic Web Application with Spring MVC	Introduction	Project Folder on Github
                            C:\meta\data\git\\udemyspring\src\main\resources\02-basic-web-application




        sourcs:
        pdf: C:\\users\Darius\Dropbox\Public\read basket\2018 not synchronized\SpringMasterClass-CourseGuidev0.1.pdf
        online version: https://www.in28minutes.com/spring-master-class
        */
		assertTrue(VIDEO_DONE);


	}

	@Test
	public void soILikeToHaveWatchDogRunning() {

		//i21c watchdog is causing idea to be extreamely unresponsive and lagging - plugin turned off for now, NEXT: fuck it, I'll use something else.

        /*
        d.boberek@gmail.com
        ITERATION21
        userID 0c9fa178c7f144b5d1bcf19a06b4ff7429ac9e52
        udemySpringIn28Min
        https://www.udemy.com/spring-tutorial-for-beginners/learn/v4/t/lecture/8068606?start=0
        projectID 10b02bb49f46c84eef2bc46a484600700c0baf75

        https://testroots.org/reports/project/10b02bb49f46c84eef2bc46a484600700c0baf75.html
        https://testroots.org/report.html
         */
	}

	@Test
	public void soILikeToHaveSonarCloud() {

		// i21c homepage for reports https://sonarcloud.io/dashboard?id=iteration21_udemyspring

		// https://sonarcloud.io/dashboard?id=iteration21_udemyspring
		// bf25ecd40502a7b735d4607ab8012cbdddf59a3c


		//i21c report generation:
		//cd C:\meta\data\git\\udemyspring
		// Running a SonarCloud analysis with Maven is straighforward. You just need to run the following command in your project's folder.
		// mvn sonar:sonar -Dsonar.projectKey=iteration21_udemyspring -Dsonar.organization=iteration21-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=bf25ecd40502a7b735d4607ab8012cbdddf59a3c


		//i21t Sonar cloud will be part of CI
		//        NEXT: If you are using Travis CI, the SonarCloud Travis Add-on makes it easier to run these commands with your CI process.
		//                https://docs.travis-ci.com/user/sonarcloud/

	}

	@Test
	public void soILikeToHaveCD() {

		//i21c homepage for CD: https://dashboard.heroku.com/apps/udemyspring

		assertTrue(true);
		//next for local postgres setup: https://devcenter.heroku.com/articles/heroku-postgresql#local-setup
		//local or in docker :P? maybe docker compose? my pet project should have all in place..
	}

	@Test
	public void soILikeToHaveCI() {

		//i21c homepaga for CI: https://travis-ci.org/iteration21/udemyspring

		//  in
		//      .travis.yml:2
		//  adding
		//      before_install:
		//          - chmod +x mvnw
		//   helps, s: https://github.com/travis-ci/travis-ci/issues/6298
		//  another solution would be to execute git update-index --chmod=+x mvnw
		//  but I see its in place already.. -rwxr-xr-x 1 Darius 197121 7346 Sep 28 17:39 mvnw*

	}

	@Test
	public void video02() {

		//i21c WSTĘP
		//==========
		//3 warstwowa aplikacja (layers)
		//różnica pomiędzy DEPENDANT a DEPENDANCY
		//kto kogo woła: web woła > business woła > data
		//warstwa biznesu jest zależna -DEPENDANT ON- od warstwy danych (data layer/wywołuje data API)
		//warstwa danych jest zależnością -DEPENDANCY OF- konieczną dla warstwy biznesowej


		//i21c SREDNIWIECZE - silne powiazania miedzy obiektami ("tight coupling")
		//==================
		//przed springiem bylo TIGHT COUPLING
		ComplexBusinessServiceV1 complexBusinessServiceV1 = new ComplexBusinessServiceV1();


		//i21c BAROK - sterowanie powiazaniami miedzy obiektami przez konstruktory ("loosely coupled programming")
		//===========
		//teraz dzieki uzyciu konstruktora mozemy parametryzowac w runtime - alecala prace wykonujemy sami i zaciemnia to kod
		SortingAlgorithmV2 sortingAlgorithmV2 = new BubbleSortAlghoritmV2();
		ComplexBusinessServiceV2 complexBusinessServiceV2 = new ComplexBusinessServiceV2(sortingAlgorithmV2);
		//niby ok ale dlaczego musialem wywlec flaki na zewnatrz i wskazac jakiego sortowania uzyc przy tym wywolaniu,
		//nie ladniej byloby ukryc ta informacje gdzies w srodku?

		//i21c OSWIECENIE  -  SPRING - defijniujemy co jest potrzebne komponentowi
		// przestajemy tworzyc instancje przed uzyciem danego komponentu, defijniujemy co jest potrzebne komponentowi
		//=> SPRING instantiates objects and populate dependancies automatically
		//=> it's still programmers job to manage dependancies so that SPRING knows what to instantiate.

		// wyjasnienie co to jest maven wrapper: https://github.com/takari/maven-wrapper

		//tak to sie odpali bez kontekstu springowego, utworzylem nowy modol na potrzeby pracy ze springiem

		//i21c fakap z mavenem - nie powinienem dodawac w module parenta - bo prbowal zbudowac parent najpierw i krzyczal ze cyclic dependancy
		// [ERROR] The projects in the reactor contain a cyclic reference: Edge between 'Vertex{label='com.iteration21:udemy.spring.onehundretsteps:1.0-SNAPSHOT'}' and 'Vertex{label='com.iteration21:udemy1:1.0-SNAPSHOT'}' introduces to cycle in the graph com.iteration21:udemy1:1.0-SNAPSHOT --> com.iteration21:udemy.spring.onehundretsteps:1.0-SNAPSHOT --> com.iteration21:udemy1:1.0-SNAPSHOT @
		//wystarczylo usunac parenta...
		ComplexBusinessServiceV3Impl complexBusinessServiceV3Impl;
		//i21c bardziej kompletny kod z uzyciem Springa
		// ComplexBusinessServiceV3Impl.executeCommand()

		//terminology
		//      beans - managed by Spring
		//      autowiring - Spring finds dependancies and populates class properties (objects)
		//      DI - we are injecting Object into another Object
		//      IoC - previously class which needs dependancy creates it, now we give contol of creating object into frramework
		//      IoC Container - is container using IoC
		//      AC - is context in which all beans are created and managed by spring

		assertTrue(VIDEO_DONE);
	}

	@Test
	public void video01() {
		//i21c INTRO DO KURSU
		//===================
		//src: https://github.com/in28minutes/spring-master-class
		//opis tego co znajdzie sie w kursie
		assertTrue(VIDEO_DONE);
	}
}
