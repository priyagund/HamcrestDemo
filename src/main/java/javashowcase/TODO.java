package javashowcase;

public class TODO {
    private  int id;
    private  String summary;
    private  String desc;

    public TODO(int id, String summary, String desc) {
        this.id=id;
        this.summary=summary;
        this.desc=desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TODO{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
