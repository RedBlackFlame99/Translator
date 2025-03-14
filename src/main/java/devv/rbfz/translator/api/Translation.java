package devv.rbfz.translator.api;

import space.dynomake.libretranslate.Language;
import space.dynomake.libretranslate.Translator;

public class Translation {
    public static String translate(Language from, Language to, String message) {
        String msg;
        try {
            msg = Translator.translate(from, to, message);
        } catch (Exception e) {
            msg = message;
        }
        return message;
    }
}
