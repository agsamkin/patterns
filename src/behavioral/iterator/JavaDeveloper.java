package behavioral.iterator;

public class JavaDeveloper implements Collection {

    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator<String> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public String next() {
            return skills[index++];
        }

    }

}
