//dom1.js

   //[{id,name,phone}....] //[배열{,objct}]
   const obj1 = {id: 'user1', name: '홍길동',phone: '010-1111'}
   const obj2 = {id: 'user2', name: '김민수',phone: '010-2222'}
   const obj3 = {id: 'user3', name: '박철호',phone: '010-3333'}
   const friends =[obj1,obj2,obj3];

   for(let friend of friends){
       for(let prop in friend){ //prop는 속성을 출력해줌(id,name,phone)
           console.log(prop.toUpperCase(),'-',friend[prop]); //obj1.id or obj1['id'] 하나씩 값을 불러올때 
       }
   }