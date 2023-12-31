  //var: 함수 레벨,let,const: block 레벨 
  var name = 'Hwang';
  function myfunc(){
      name = 'Hong'; //함수안에서 선언되면 함수 안에서만 유효한 값을 가짐 . 전역변수로 선언되어 있는게 있으면 밖에 있는 것으로 출력됨 
      console.log(this);

  }
  myfunc();
  console.log(name);
  console.log(this);

  let age = 20;
  function myfunc2(){
      let age = 22;
      console.log(age);
  }
  myfunc2();
  console.log(age);
  let obj = {
      id: 'Hong',
      age: 20,
      show:function(){
          console.log(this);
      }
  }
  obj.show();

  document.body.addEventListener('click', function(){
      console.log(this);
  })
  // this -> 1.전역 영역: window 객체 
          //2.함수 영역: window 객체 
          //3.객체: object 자신을 의미 
          //4.이벤트: 이벤트 실행 대상 

  // console.log(this);
// let show = 'Hello';
// function show(){
//     console.log('show');
// }
//함수의 이름도 변수로 적용됨 . 중복 불가 
//() -> 함수 실행 
let show = function(){
  console.log('show');
  //return undefined; //따로 선언안하면 이거임 
  return '반환값';
}   
console.log(show()); //안에 괄호가 있어야 실행이 된다 . 구문만 진행하려면 () 빼고 

(function(){
  console.log('익명함수');
})();  //익명함수라는 function을 실행해 출력하겠습니다 (괄호에 묶어주기)

//함수명명 규칙 
function showMyName(){
  console.log('홍길동');
}

//상수선언 - 선언 후 다른 value 줄 수 없음 
const height = 167.9;
// height = 169;
//참조하는 주소값의 속성 값을 바꾸는 것은 가능 
const friend = {
  name: '홍길동', 
  phone: '010-1111',
}
friend.phone = '010-2222';
// friend= {}