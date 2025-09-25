public class Samosa {
    
        //field to store created object and by default it will be null
        // if we keep it private only then we cannot use it in below static method as non static variables are not used in static method
        private static Samosa samosa;


        // Constructor is priate
        private Samosa(){

        }

        // Not good for threads 
        // LAZY Method of creating singleton object and you are not worried about threads 
        // Method to get the object 
        // static method as we can useit witht he class name to get the object
        // Non static method need objects to access them
        // public static Samosa getSamosa()
        // {
        //     // Object of this class
        //     if(samosa == null)
        //     {
        //         samosa = new Samosa();
        //     }
        //     return samosa;
        // }


        // To handle threads problem we can use below Method synchronization
        // But we only want the block line to be synchronised there might be code above it or  below it we do not want it to be synchronised

        /* 
        public  synchronized static Samosa getSamosa() ----> Method Synchormized
        {
            // Object of this class
            if(samosa == null)
            {
                samosa = new Samosa();
            }
            return samosa;
        }
        */ 


        //To handle above problem instead of Method synchronization we will use block synchronization
               
        public  static Samosa getSamosa()
        {
            // Object of this class
            if(samosa == null)
            {
                synchronized(Samosa.class) /// ----------------------------->> Block of code is synchornised
                {
                    if(samosa==null){
                        samosa = new Samosa();
                    }
                }
                
            }
            return samosa;
        }
        

        
}


/*
 * 
 *  1. Constructor should always be private so that no one would call it directly 
 *  2. Object create with help of method
 *  3. Field to store created object is private
 * 
 */

