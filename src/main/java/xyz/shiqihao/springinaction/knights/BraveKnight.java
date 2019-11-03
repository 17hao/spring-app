package xyz.shiqihao.springinaction.knights;

public class BraveKnight implements Knight {
    private Quest quest;

    BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
