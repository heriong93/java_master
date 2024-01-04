//array2.js

const numAry = [23,10,17,35,9];

let result = numAry.reduce((acc,num) => { //acc -> 누산기 num -> 현재값
    console.log(acc,num);
    return acc+num;
},0);

result = numAry.reduce((acc,num) => {
    return acc > num ? acc : num;
},0);

//최소값 
result = numAry.reduce((acc,num) => {
    return acc < num ? acc : num;
},numAry[0]);
console.log(`결과: ${result}`);
//평균 구하기 
result = numAry.reduce((acc,num,idx) => {
    if(idx == numAry.length-1){  //index번호가 배열의 길이와 같을때 
        return (acc+num) / numAry.length; 
    }
    return acc+num 
},0);
//10보다 큰 값을 새로운 배열
result = numAry.reduce((acc,num) => {
    if(num > 10){
        acc.push(num);
    }
    return acc;
},[]); //초기값을 배열로 지정해줌(acc) 


console.log(`결과: ${result}`);