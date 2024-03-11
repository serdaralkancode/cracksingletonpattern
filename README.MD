Crack Singleton Object and Prevent
---

***Technique 1 :***

   Crack :

    Reflection API

   Prevent :

    Throw exception in Construction 
   

***Technique 2 :***
    
   Crack :

    Serializable and DeSerializable
 
   Prevent :

    override readResolve method

***Technique 3 :***

   Crack: 

    Clonable

   Prevent:
    
     return instance or throw excepiton in clone method
