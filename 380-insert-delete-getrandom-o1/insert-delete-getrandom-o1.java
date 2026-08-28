import java.util.*;
class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random random;
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);

        return true;
    }
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int lastValue = list.get(list.size() - 1);
        // Move last element to deleted element's position
        list.set(index, lastValue);
        // Update last element's index
        map.put(lastValue, index);
        // Remove last element
        list.remove(list.size() - 1);
        // Remove value from map
        map.remove(val);
        return true;
    }
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */