//class3.js

//-----------------
const ary = []
ary.push(1)
ary.push(2)
ary.push(3)

//find 메소드 
console.log(ary.find(item => {
    return item >= 2; //true 값을 새로운 배열에 담아준다 
}))

//책 99페이지 보기 
class Estimate {
    constructor(param) {
        this.unit = param;
    }
    //견적가 얻기 메소드 
    getEstimate(unittype, width, height) {
        let priceinfo = this.unit.find(item => item.type == unittype);
        return priceinfo.price * width * height;
    }
    //배열에 요소 추가 메소드 
    addUnit(unit) {
        unit.push(unit);
    }
}
let unitinfo = [{ type: "wood", price: 100 }, { type: "iron", price: 300 }, { type: "plastic", price: 200 }];
const estimator = new Estimate(unitinfo);
let result = estimator.getEstimate('wood', 20, 20);
console.log(result);

//책 p 112
//1. 객체: this 는 객체 자신
//2. function() this는 전역객체 (window);

function myFunc() {
    console.log(this);
}
myFunc(); //window 객체 

let obj = {}
//객체 메소드 act생성 
obj.act = function () {
    this.value = 'default value'; //객체에 value 변수 값 설정
    //객체 메소드 act() 안의 추가함수 
    function innerAct() {
        this.value = 'innerAct value'; //전역 객체 value 변수에 값 할당
        console.log("this.value:" + this.value); //전역 객체를 참조함 
    }
    //객체 참조를 넘기는 act()메소드 안의 추가 함수 
    function innerReact(caller) {
        caller.value = "innerReact value"; //obj 객체의 value 변수에 값 할당
        console.log("this.value:" + this.value); //undefined 반환. 전역 객체의 value 변수를 참조함 
        console.log("caller.value:" + caller.value); //"innerReact value "반환.obj 객체의 value 참조
    }
    innerAct();
    console.log("obj 객체의 this.value:" + this.value);
    innerReact(this);
    console.log("obj 객체의 this.value:" + this.value);
}
obj.act();
//  window.location.href = "https://www.daum.net";

//클로저 -실행되는 시점의 환경을 기억
function outerFunc(name) {
    let saying = name + '안녕';
    return function () {
        return saying;
    }
}
const closure1 = outerFunc('라이언');
const closure2 = outerFunc('콘');
console.log(closure1());
console.log(closure2());

function getCounter() {
    let cnt = 1;

    return function () {
        cnt++;
        console.log(cnt);
    }
    // increaseCounter();
}
const clo1 = getCounter();
clo1();
clo1();
clo1();

