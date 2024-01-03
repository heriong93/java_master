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
delete friend.age; //속성 지우기 
friend.ages = 20; //속성 추가 
friend.showFriends = function(){  //showFriends 메소드 추가 
    console.log(this);
}
console.log(friend);
console.log(friend['pets'][0]['friends']); //아래와 같음 
console.log(friend.pets[0].friends[0]);

