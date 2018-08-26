function solution(A) {
    
    var smallestDis = 100;
    
    for(var i=0; i<A.length; i++){
      for(var j=i+1; j<A.length; j++){
          
          var num = A[i] - A[j];
          if( num  < smallestDis ){
           smallestDis = num;    
      }  
    }
    
}
return smallestDis;
}