let success = (a) => {
  console.log(a + " it worked!");
};

let error = (a) => {
  console.log(a + " it failed!");
};

const Promise = (num) => {
  return new Promise((resolve, reject) => {
    if (num % 2 == 0) {
      resolve("Success!");
    }
    reject("Failure!");
  });
};

Promise(100).then(success, error);
Promise(21).then(success, error);
/*let promise = new Promise((resolve, reject)=>{  
    let a = 3;  
    if(a==3)  {  resolve('Success');  }  
    else      {  reject('Failed');    }  
})  
promise.then((message)=>{  
    console.log("It is then block. The message is: ?+ message)  
}).catch((message)=>{  
console.log("It is Catch block. The message is: ?+ message)  
}) 
let success = (a) => {  
    console.log(a + " it worked!")  
  }  
    
  let error = (a) => {  
    console.log(a + " it failed!")  
  }  
    
  const Promise = num => {  
    return new Promise((resolve,reject) => {  
      if((num%2)==0){  
        resolve("Success!")  
      }  
      reject("Failure!")  
    })  
  }  
    
  Promise(100).then(success, error)   
  Promise(21).then(success,error) 


*/
