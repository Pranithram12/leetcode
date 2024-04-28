import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    private ArrayList<Integer> nums;
    private HashMap<Integer, Integer> locs;
    private Random random = new Random();

    public RandomizedSet() {
        nums = new ArrayList<>(); 
        locs = new HashMap<>(); 
    }
    
    public boolean insert(int val) {
        if (locs.containsKey(val)) {
            return false; 
        }
        else {
            locs.put(val,nums.size()); 
            nums.add(val); 
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (!locs.containsKey(val)) {
            return false;
        }

        int location = locs.get(val);
        if (location < nums.size() - 1) {
            int lastOne = nums.get(nums.size() - 1); 
            nums.set(location, lastOne);
            locs.put(lastOne, location);
        }
        nums.remove(nums.size() - 1);
        locs.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
    }

    /**
    * Your RandomizedSet object will be instantiated and called as such:
    * RandomizedSet obj = new RandomizedSet();
    * boolean param_1 = obj.insert(val);
    * boolean param_2 = obj.remove(val);
    * int param_3 = obj.getRandom();
    */