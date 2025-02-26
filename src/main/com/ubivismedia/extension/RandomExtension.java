package com.ubivismedia.extension;

import java.util.concurrent.ThreadLocalRandom;

public class RandomExtension implements ExtensionInterface {
    @Override
    public String getName() {
        return "Random";
    }
    
    @Override
    public String getDescription() {
        return "Gibt eine zufällige Zahl aus einem Bereich zurück";
    }
    
    @Override
    public String execute(String[] params) {
        if (params.length < 2) {
            return "Fehlende Parameter: Min und Max";
        }
        try {
            int min = Integer.parseInt(params[0]);
            int max = Integer.parseInt(params[1]);
            return String.valueOf(ThreadLocalRandom.current().nextInt(min, max + 1));
        } catch (NumberFormatException e) {
            return "Ungültige Zahlenwerte";
        }
    }
}
