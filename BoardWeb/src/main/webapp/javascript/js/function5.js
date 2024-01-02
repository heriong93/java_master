//function5.js

//Array.prototype.forEach(); 인터페이스라고도 정의함 - 
const ary = ['a','b','c']
ary.forEach(function (elem){
    console.log(elem);
})
//ary.forEach(elem => console.log(elem));
//이렇게 간단하게 줄일 수도 있다 

//화살표함수 (새로운 방식)
ary.forEach((elem, idx)=>{
    if(idx > 0){
        console.log(elem);
    }
})

//직접 배열에 메소드를 추가할 수 있다 
Array.prototype.sum = function (){
    console.log(this);
    let result = 0; 
    this.forEach(function (val){
        result += val;
    })
    return result;
}
const numbers = [1,2,3,4];
console.log('sum:'+numbers.sum());