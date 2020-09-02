package models;

public class Dictionary {
    private String keyWord;
    private String pronounce;
    private String adjective;
    private String example;
    private String noun;
    private String similar;

    public Dictionary(String keyWord, String pronounce, String adjective, String example, String noun, String similar) {
        this.keyWord = keyWord;
        this.pronounce = pronounce;
        this.adjective = adjective;
        this.example = example;
        this.noun = noun;
        this.similar = similar;
    }

    public Dictionary() {
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce;
    }

    public String getSimilar() {
        return similar;
    }

    public void setSimilar(String similar) {
        this.similar = similar;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String display() {
        return  "* Pronounce = " + pronounce +
                "\n* Adjective = " + adjective +
                "\n- Example = " + example +
                "\n* Noun = " + noun +
                "\n* Similar = " + similar;
    }

    @Override
    public String toString() {
        return "Keyword = " + keyWord + ", Pronounce = " + pronounce + ", Adjective = " + adjective +
                ", Example = " + example + ", Noun = " + noun + ", Similar = " + similar;
    }
}
