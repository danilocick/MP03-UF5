package A3_OpenData_Streams_Lambdes.Model;

import com.opencsv.bean.CsvBindByName;

public class Title {
    @CsvBindByName
    String titleId;
    @CsvBindByName
    String title;
    @CsvBindByName
    String region;
    @CsvBindByName
    String language;
    @CsvBindByName
    int ordering;
    @CsvBindByName
    boolean isOrigianlTitle;
    @CsvBindByName
    char[] types;
    @CsvBindByName
    char[] attributes;
    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public boolean isOrigianlTitle() {
        return isOrigianlTitle;
    }

    public void setOrigianlTitle(boolean origianlTitle) {
        isOrigianlTitle = origianlTitle;
    }

    public char[] getTypes() {
        return types;
    }

    public void setTypes(char[] types) {
        this.types = types;
    }

    public char[] getAttributes() {
        return attributes;
    }

    public void setAttributes(char[] attributes) {
        this.attributes = attributes;
    }
}
