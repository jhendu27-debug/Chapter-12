
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Spell> spells = new ArrayList<>();

        spells.add(new Spell("Shadow Curse", 95, "Necromancy"));
        spells.add(new Spell("Fireball", 80, "Evocation"));
        spells.add(new Spell("Mirror Image", 45, "Illusion"));
        spells.add(new Spell("Soul Drain", 100, "Necromancy"));
        spells.add(new Spell("Lightning Bolt", 90, "Evocation"));
        spells.add(new Spell("Invisibility", 60, "Illusion"));
        spells.add(new Spell("Dark Ritual", 85, "Necromancy"));
        spells.add(new Spell("Ice Storm", 75, "Evocation"));
        spells.add(new Spell("Phantom Double", 55, "Illusion"));
        spells.add(new Spell("Death Grasp", 98, "Necromancy"));

        System.out.println("=== Intergalactic Spell Archive ===");

        for (Spell spell : spells) {
            System.out.println(spell);
        }
    }
}
