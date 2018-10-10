package org.computermentors.inceractivestory.Model;

public class Choice {
    private int nextPage;
    private int textId;

    public Choice(int textId, int nextPage) {
        this.nextPage = nextPage;
        this.textId = textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }
}
