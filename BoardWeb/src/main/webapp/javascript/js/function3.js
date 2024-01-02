//function3.js
//객체생성: {}
let obj1 = {
    // key : 속성 
    name: "홍길동",
    age: 20, 
    //메소드 
    showInfo: function(){
        return '이름은 '+this.name+ ',나이는'+this.age;
    }
}
console.log(obj1.name);
console.log(obj1['age']);
console.log(obj1.showInfo());

//함수를 통해 객체 선언
//이렇게 생성해주면 객체를 반복해서 만들지 않고 let obj3 = new Member("김명철",22); 객체생성 가능
let Member =function Member(name,age){
    this.name = name;
    this.age = age;
    this.showInfo = function(){
        return '이름은' + this.name + ',나이는' +this.age;
    }
}
let obj3 = new Member("김명철",22);
let obj4 = new Member("이명석",25);
console.log(obj3.showInfo());
console.log(obj4.showInfo());