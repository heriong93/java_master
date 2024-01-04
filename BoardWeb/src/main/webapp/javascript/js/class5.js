//class5.js

//Map, Set

//Map 객체는 키-값 쌍인 집합
const map = new Map();
map.set('홍길동',20);
map.set('김민수',22);
map.set('최성우',25);
map.set('홍길동',21); //똑같은 key 가 있으면 새로 생성되는 게 아니라 값을 덮어버림 

map.delete('최성우');

console.log(map.get('김민수'));  
// map.clear(); //모든 값을 지워줌 

for(let key of map.keys()){ // for...of 루프는 각 반복에 대해 [key, value]로 이루어진 멤버가 2개인 배열을 반환
    console.log(`key는 ${key}, value는 ${map.get(key)}`);
}
console.log(map.values());
for(let [name, value] of map.entries()){
    console.log(name,value);
}
console.log(map.entries());
//첫번째 매개값이 값. 두번째 매개값이 키 
map.forEach((val, key) => console.log('key:'+key+'val:'+val));
//Set 컬렉션 
const set = new Set();
set.add('홍길동');
set.add('김민수');
set.add('홍성길');
set.add('홍길동');

set.delete('김민수');
console.clear();  //위 콘솔창 내용 지워줌 
console.log(set.size);  //3으로 출력 . 홍길동 동일값이 두 개가 있어서 하나는 제거됨 
set.forEach(name => console.log(name));

const numAry = [10,14,12,10]
const num = new Set(numAry); //배열을 set컬렉션에 넣어준다 
num.forEach(number => console.log(number)); //배열의 중복된 값은 제거되고 3개가 출력됨

console.clear();
map.clear();

map.set('김명철',80);
map.set('김익수',70);
map.set('이명철',80);
map.set('이익수',85);
map.set('홍길동',80);

//김씨 점수의 합계
let sum = 0;
map.forEach((score,name) => {
    if(name.indexOf('김') == 0){ //이름의 첫글자가 '김'일 경우 
       sum += score; 
    }
})
console.log(`합계점수: ${sum}`);







