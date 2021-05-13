package codingbat.WarmUp2;

public class Array667Challenge {

public int array667(int[] nums) {
  int count = 0;
  for(int i = 0; i< nums.length -1; i++){
  if((nums[i] == nums[i+1] && nums[i] == 6) 
  ||( nums[i] == 6 &&  nums[i+1] == 7)) {
    count ++;
  }
 }
  return count;
}

}
