public class KeywordsDetector {

    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "We need to leverage our core competencies",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Our new technology presents a significant paradigm shift"
        };

        String[] keywords = {"transform", "leverage", "blockchain", "synergy", "paradigm"};

        detectAndPrint(sentences, keywords);
    }

    // Détecte et affiche les phrases contenant les mots-clés
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (String sentence : sentences) {
            String lowerSentence = sentence.toLowerCase();
            for (String keyword : keywords) {
                if (lowerSentence.contains(keyword.toLowerCase())) {
                    System.out.println(sentence);
                    break; // Éviter les répétitions
                }
            }
        }
    }
}

