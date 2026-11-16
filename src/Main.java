
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        String chosenSchool = "Necromancy";

        List<Spell> filteredSpells = spells.stream()
                .filter(spell -> spell.getSchool().equals(chosenSchool))
                .sorted((spell1, spell2) ->
                        Integer.compare(spell2.getPowerLevel(),
                                spell1.getPowerLevel()))
                .collect(Collectors.toList());

        System.out.println("=== Spells Ranked By Power ===");

        for (Spell spell : filteredSpells) {
            System.out.println(spell);
        }
    }
}
