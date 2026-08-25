lass Solution {
    public int romanToInt(String s) {
        //Create a Hashmap
        Map<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        //initialise result
        int result =0;

        //traverse the string
        for (int i=0;i<s.length();i++){

            int current = map.get(s.charAt(i));   //current position

            //checking if char is last char       
            if(i+1 < s.length() && current < map.get(s.charAt(i+1))){
                result -= current;    //if current < next -> subtract
            }
            else{
                result += current;      //if current > next -> add
            }

        }

        return result;
        

        
    }
}