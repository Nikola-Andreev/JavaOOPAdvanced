package d_iteratorsAndComparators.exercises.d_froggy;

import java.util.Iterator;
import java.util.List;

public class LakeImpl implements Iterable {

    private List<Integer> elements;

    public LakeImpl(List<Integer> arr) {
        this.setElements(arr);
    }

    private void setElements(List<Integer> arr) {
        this.elements = arr;
    }

    @Override
    public Iterator iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator {

        private int index;
        private int count;
        private boolean foundAllEven;
        private Integer number;

        private Frog() {
            this.count = 0;
            this.index = -2;
            this.foundAllEven = false;
        }

        private void getNumber() {
            if (!this.foundAllEven) {
                if (this.index + 2 < elements.size()) {
                    this.number = elements.get(index += 2);
                    this.count++;
                    return;
                }
                this.index = -1;
                this.foundAllEven = true;
            }
            this.number = elements.get(index += 2);
            this.count++;
        }

        @Override
        public boolean hasNext() {
            return count < elements.size();
        }

        @Override
        public Integer next() {
            if (this.hasNext()) {
                getNumber();
                return this.number;
            }
            return null;
        }
    }
}