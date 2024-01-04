//class7.js 

//class6.js와 같이 참조되기 때문에 메소드 사용가능 (class.html에서)

//import/export하려면 html 에서 type=module로 지정해줘야함
import {friend, sum, getMax} from './class6.js'; //class6에서 사용하기를 원하는 기능 가져오기
let n1 = 10, n2 = 20;
// console.log(sum(n1,n2));

// console.log(getMax(n1,n2));

console.log(friend.showInfo());

