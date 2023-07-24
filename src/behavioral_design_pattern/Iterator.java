package behavioral_design_pattern;

public interface Iterator {
    boolean hasNext();
    public Object next();
}

interface Container {
    Iterator getIterator();
}

class NameRepo implements Container {
    String names[] = {"Fahad", "Pathan", "Abd"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int idx = 0;

        @Override
        public boolean hasNext() {
            if (idx < names.length) return true;
            else return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[idx++];
            }
            else return null;
        }
    }
}

class Main7 {
    public static void main(String[] args) {
        NameRepo nameRepo = new NameRepo();

        for (Iterator itr = nameRepo.getIterator(); itr.hasNext(); ) {
            String abc = (String) itr.next();
            System.out.println(abc);
        }
    }
}