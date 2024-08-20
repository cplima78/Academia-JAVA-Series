//package br.com.academia.finaljava;
//
//import br.com.academia.finaljava.principal.Principal;
//import br.com.academia.finaljava.repository.SerieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//public class FinaljavaApplicationSemWeb {
//import br.com.academia.finaljava.principal.Principal;
//import br.com.academia.finaljava.repository.SerieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//    @SpringBootApplication
//    public class FinaljavaApplication implements CommandLineRunner {
//
//        @Autowired
//        private SerieRepository repositorio;
//
//        public static void main(String[] args) {
//            SpringApplication.run(br.com.academia.finaljava.FinaljavaApplication.class, args);
//        }
//
//        @Override
//        public void run(String... args) throws Exception {
//            Principal principal = new Principal(repositorio);
//            principal.exibeMenu();
//        }
//    }
//}
