//class4.js

const friend = {
    name: "홍길동",
    age: 20,
    hobbies: ['독서', '운동', '영화'],
    pets: [{ 
        name: '야옹이', 
        gender: 'M', 
        friends: ['검양이','빨양이']
    }, { 
        name: '멍멍이', 
        gender: 'F' 
    }],
    showHobby() {
        return `${this.hobbies[0]},${this.hobbies[1]},${this.hobbies[2]}`;
    }
}
friend.pets[0]['friends'][2] = '노량이'; //노량이 배열에 추가 
// delete friend.age; //속성 지우기 
friend.ages = 20; //속성 추가 
friend.showFriends = function(){  //속성을 showFriends 메소드(기능으)로 추가 
    console.log(this);
}
console.log(friend);
console.log(friend['pets'][0]['friends']); //아래와 같음 
console.log(friend.pets[0].friends[0]);

// 참조값을 복사 //동일한 객체 (원본도 값이 바뀜)
const fcopy = friend;
fcopy.age = 22;
console.log(fcopy);

//객체를 복사 // 새로운 객체 생성한 것 (원본은 값이 변경안됨)
const fcopy2 = Object.assign({bloodType:'O'}, friend);
fcopy2.age = 24;
console.log(fcopy2);

//속성추가 
Object.defineProperty(friend,'height',{
    get: function(){
        return this._height;
    },
    set: function(value){
        if(value <= 0){
            alert ('error');
        }else{
            this._height = value;
        }
    }
});
friend.height = 162;
console.log(friend.height);

