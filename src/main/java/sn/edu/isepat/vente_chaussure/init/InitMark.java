package sn.edu.isepat.vente_chaussure.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepat.vente_chaussure.entities.Marque;
import sn.edu.isepat.vente_chaussure.repositories.MarqueRepository;

@Component
public class InitMark implements CommandLineRunner {

    private final MarqueRepository marqueRepository;

    public InitMark(MarqueRepository marqueRepository) {
        this.marqueRepository = marqueRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("### Initialisation des marques");

        Marque nike = new Marque();
        nike.setNom("Nike");

        marqueRepository.save(nike);
    }
}
