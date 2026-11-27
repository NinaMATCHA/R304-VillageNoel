import Building.SimulatorBuilding;
import Characters.SimulatorCharacter;

import java.util.Scanner;

public class SantaClaus {

    public void examineBat(SimulatorBuilding Building) {
        // TODO : Examine un bâtiment et affiche ses caractéristiques de celui-ci avec les personnages
        System.out.println(Building.showActualCharactersInBuildingAndBuildingInfo());
    }

    public void askCleanService(SimulatorBuilding building) {
        // TODO : Demande l'entretient d'un bâtiment
        building.cleanUp();
    }

    public void moveCharacter(SimulatorCharacter character, SimulatorBuilding startBuilding, SimulatorBuilding destination) {
        // TODO : Peut faire déplacer un personnage d'un bâtiment à un autre
        if (startBuilding == null || destination == null) {
            System.out.println("Le personnage n'est pas dans un bâtiment, il ne peut être deplacé.");
            return;
        }

        if (startBuilding == destination) {
            System.out.println("Le personnage se trouve déjà dans ce bâtiment");
            return;
        }

        if (!startBuilding.contains(character)) {
            System.out.println(character.getName() + " N'est pas dans le bâtiment de départ");
            return;
        }

        if (destination.welcomeCharacter(character)) {
            startBuilding.removeCharacter(character);
            System.out.println(character.getName() + " a été déplacé");
        }
    }

    private SimulatorBuilding chooseBuilding(SimulatorBuilding[] buildings, Scanner scanner) {
        for (int i = 0; i < buildings.length; i++) {
            System.out.println(i + ". " + buildings[i].getClass().getSimpleName());
        }
        int index = scanner.nextInt();

        if (index < 0 || index >= buildings.length) {
            System.out.println("Bâtiment invalide.");
            return null;
        }
        return buildings[index];
    }

    public void play(SimulatorBuilding[] buildings, Scanner scanner) {
        int nbAction = 3;

        while (nbAction > 0) {
            System.out.println("\n--- Menu du Père Noël (" + nbAction + " action(s) restante(s)) ---");
            System.out.println("1. Examiner un bâtiment");
            System.out.println("2. Demander l'entretien d'un bâtiment");
            System.out.println("3. Déplacer un personnage");
            System.out.println("0. Terminer le tour");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    // TODO : Choisit un bat puis l'examine avec examineBat()
                    SimulatorBuilding b = chooseBuilding(buildings, scanner);
                    if (b != null) {
                        examineBat(b);
                        nbAction--;
                    }
                    break;
                }
                case 2: {
                    // TODO : Choisit un bat puis demande à le nettoyer avec askCleanService()
                    SimulatorBuilding b = chooseBuilding(buildings, scanner);
                    if (b != null) {
                        askCleanService(b);
                        nbAction--;
                    }
                    break;
                }
                case 3: {
                    // TODO : deplacer le character, choisit deux bat avec move()
                    // Batiment de depart
                    SimulatorBuilding start = chooseBuilding(buildings, scanner);
                    if (start == null) {
                        break;
                    }
                    if (start.getCurrentCapacity() == 0) {
                        System.out.println("Ce bâtiment est vide, personne à déplacer.");
                        break;
                    }

                    // on choisit le perso
                    SimulatorCharacter[] presents = start.getPresentCharacters();
                    for (int i = 0; i < start.getCurrentCapacity(); i++) {
                        System.out.println(i + ". " + presents[i].getName());
                    }
                    int charIndex = scanner.nextInt();
                    if (charIndex < 0 || charIndex >= start.getCurrentCapacity()) {
                        System.out.println("Personnage invalide.");
                        break;
                    }
                    SimulatorCharacter character = presents[charIndex];

                    // destination
                    SimulatorBuilding destination = chooseBuilding(buildings, scanner);
                    if (destination == null) {
                        break;
                    }

                    moveCharacter(character, start, destination);
                    nbAction--;
                    break;
                }
                case 0:
                    // TODO : Termine le tour du père noel
                    nbAction--;
                    break;
                default:
                    System.out.println("Action fausse, refaire");
            }
        }
    }
}
