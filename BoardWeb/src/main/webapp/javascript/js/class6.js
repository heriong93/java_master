//class6.js

function sum(num1, num2) {
    return num1 + num2;
}

function getMax(num1, num2) {
    return num1 > num2 ? num1 : num2;
}

const friend = {
    name: "hong",
    age: 20,
    showInfo() {
        return `이름은 ${this.name}, 나이는 ${this.age}입니다.`;
    }
}

export { friend, sum, getMax }; //특정 요소/기능만 사용할 수 있도록 출력
//import/export하려면 html 에서 type=module로 지정해줘야함

