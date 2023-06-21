// class staticPractice{
    
//     static{
//         System.out.println("Block 1");
//     }
 
//         public static void main(String args[]){
//             System.out.println("Main Block");
//     }

//     static{
//         System.out.println("Block 2");
//     }
// }
//-------------------------------------------------------------------------------------
// class staticPractice{
//     class Test{
//         static{
//             System.out.println("Block 1");
//         }
//         static{
//             System.out.println("Block 2");
//         }
//     }
//         public static void main(String args[]){
//             System.out.println("Main Block");
//     }
// }
//----------------------------------------------------------------------------------------
class staticPractice{
        public static void main(String args[]){
            Test t = new Test();
            System.out.println("Main Block");
    }
}

class Test{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}