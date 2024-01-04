//array1.js
//ary = []
const ary = [1,2,'3',new Date()]; //type에 상관없이 값을 담을 수 있다

const numAry = [10,20]
numAry.push(30); //하나씩 값을 추가. 뒤에 추가됨
numAry.unshift(40); //맨 앞에 추가 
numAry.pop(); //마지막 요소 삭제 
numAry.shift(); //첫 요소 삭제 
//splice()설명 -196페이지
// numAry.splice(1,1); //지정한 위치 요소 삭제(1번째 위치에, 1개만 지우겠다) 
// numAry.splice(1,0,50,60); //수정도 가능: 1번째 위치의(index), 0은 추가를 의미(숫자 지정해주면 index위치부터 지정된 수만큼 수정) , 50과 60으로 바꾸겠다 
// numAry.splice(0); //빈 배열 출력

// numAry.length = 10; //길이 지정해주기: [10, 20, empty × 8] 이렇게 나옴 

const numAry2 = [50,60];
const numAry3 = numAry.concat(numAry2); //concat 배열 합치기 
//numAry에 numAry2를 추가 
numAry2.forEach(num => numAry.push(num));

console.log(numAry);
//reduce -배열의 각 요소에 대해 주어진 리듀서 (reducer) 함수를 실행하고, 하나의 결과값을 반환

