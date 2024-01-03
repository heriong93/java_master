//function6.js

const args = [4, 5, 6];

function sum(num1 = 0, num2 = 0, ...args) {//..args 몇개가 들어올 지 모르겠지만 들어오는 만큼 처리하겠다.라는 표편
    let result = 0;
    result = num1 + num2;
    if (args.length > 0) { //args의 값이 있다면 
        args.forEach(val => {
            result += val;
        })
    }
    return result;
}
console.log(sum(10, 20, ...args)); //45 출력됨 

const ary1 = [10, 20];
const ary2 = ary1.concat(args); //배열 합치기 concat
console.log(ary2);

const ary3 = [...ary1, ...args]; //배열 합치기 ...새로운 방법임 (나머지파라메터)
console.log(ary3);

const obj1 = { name: "Hong", age: 20 }
const obj2 = { name: "Hwang", height: 170 }

const obj3 = { ...obj1, ...obj2 }
console.log(obj3); //출력결과 : name: 'Hwang', age: 20, height: 170 중복된 값은 마지막 값으로 변경되고 없던 속성들은 추가해줌

//reduce 
let result = [4, 5, 6].reduce((acc, curItem, idx, ary) => { //=> 이건 화살표함수 
    console.log(acc, curItem, idx);
    return acc + curItem;
}, 0);
console.log('결과값:' + result); //결과값:15
//고차함수- 함수를 인자로 받는 함수 책 83페이지 

//map 메소드 Map 객체는 키-값 쌍과 키의 원래 삽입 순서를 기억합니다. 
result = [1, 2, 3, 4].map((item, idx, ary) => {
    console.log(item, idx, ary);
    return item * 2;

});
console.log('결과값:', result); //결과값: (4) [2, 4, 6, 8] 기존배열에서 *2 값을 해서 보여줌 

//변수의 스코프 
var name = '어피치';
function run() {
    if (true) {
        var name = '라이언';  //var선언하면 function안에서는 유효하지만 함수 밖에 선언되어있는게 있으면 대체됨
        // let으로 선언한다면 둘 다 어피치 출력됨. (블럭단위- 변수 의미 가짐)그리고 중복 막아줌
    }
    console.log(name);
    return name;
}
run();
console.log(name);

//스코프 체인 
var a = 1;
var b = 5;
function outerFunc() {

    function innerFunc() {
        a = b;
    }
    console.log(a); //a:1
    a = 3;
    b = 4;
    innerFunc();
    console.log(a, b); //a:4 b:4
    var b = 2;
    console.log(b);  //b:2
}
outerFunc();

const c = 10;

try {
    c = 20; //상수라 다시 설정할 수 없음 
} catch (error) {
    console.log(error.message) //에러값의 메세지 Assignment to constant variable.
} finally {
    console.log(c); //10 출력됨 
}





