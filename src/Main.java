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

        // Test 1: Equal power levels
        spells.add(new Spell("Spirit Shield", 90, "Abjuration"));
        spells.add(new Spell("Magic Barrier", 90, "Abjuration"));

        System.out.println("=== Intergalactic Spell Archive ===");

        // Test different schools
        testSchool(spells, "Necromancy");
        testSchool(spells, "Evocation");
        testSchool(spells, "Illusion");

        // Test a school with no matching spells
        testSchool(spells, "Conjuration");

        // Test equal power levels
        testSchool(spells, "Abjuration");
    }

    public static void testSchool(ArrayList<Spell> spells, String chosenSchool) {

        List<String> topSpells = spells.stream()
                .filter(spell -> spell.getSchool().equals(chosenSchool))
                .sorted((spell1, spell2) ->
                        Integer.compare(spell2.getPowerLevel(),
                                spell1.getPowerLevel()))
                .map(Spell::getName)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("\nTop spells for " + chosenSchool + ":");

        if (topSpells.isEmpty()) {
            System.out.println("No spells found.");
        } else {
            for (String spellName : topSpells) {
                System.out.println(spellName);
            }
        }
    }
}