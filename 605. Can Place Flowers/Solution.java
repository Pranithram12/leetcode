class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      if (n == 0) {
        return true;
      }
  
      int count = 0;
  
      for (int i = 0; i < flowerbed.length; i++) {
        if (flowerbed[i] == 0) {
          if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
            flowerbed[i] = 1; // Place a flower
            count++; // Increment count
            if (count == n) {
              return true; // Reached required number of flowers
            }
          }
        }
      }
      return false; // Did not reach required number of flowers
    }
  }
  