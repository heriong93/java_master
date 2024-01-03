//string1.js

let str1 = "Hello";
console.log(str1, typeof str1); //string 문자열
let str2 = new String ("Hello");
console.log(str2, typeof str2); //object 객체 

console.log(str1 == str2); //같은 값을 가지고 있기 때문에 true 하지만 ===으로 비교하면 false(type이 다르기 때문에)

console.log(str2.substring(1,3)); //첫번째는 index값부터 두번째 위치 전까지 자르기/ 출력:el

//trim
let word = "   Hello,World ";
console.log(word.trimStart()); //시작부분의 공백만 삭제 
console.log(word.trimEnd()); //뒷부분의 공백만 삭제 
console.log(word.trim()); //앞 뒤 모든 공백 삭제 


console.log(word.replace('H','h')); //대체 
//const obj = new Object(); {}
//const reg = new RegExp(); /값/
console.log(word.replace(/l/g,'L'));  //천체 구문에서 가져와서 바꾸겠다 
console.log(word.replace(/\s/g,'')); //빈공객을 다 가져와서 삭제해주겠다   

word = '  how are you to day everyone.  ';
console.log(word.split(' ').filter((val)=>{
    return val;

}).join(' ')); //filter()는 가져온 값으로 새로운 배열을 만들어줌. 빈 공간은 빼고 값이 담겨진 것든만

console.log(word.split(' ').filter(val => val).join(''));  //모든 공백을 지워줌 howareyoutodayeveryone.

