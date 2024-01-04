//array3.js

import {
    members,
    titles
} from './data.js';

console.log(members);
console.log(titles);

let str = titles.reduce((acc,title,idx) => {
    if(idx == 0){
        acc += '<tr>';
    }
    acc += '<th>' + title + '</th>';
    if(idx == titles.length-1){
        acc += '</tr>';
    }
    return acc;
},'');
console.log(str);
document.getElementById('theader').innerHTML = str; //<tr><th>...</th></tr>

//dom 이용해 테이블 만들기 

const tbody = document.getElementById('tbody');

members.reduce((acc, member) => {
    let tr = document.createElement('tr');
    for(let prop in member){
        let td = document.createElement('td');
        td.innerText = member[prop];
        tr.appendChild(td);
    }
    acc.appendChild(tr);
    return acc;
},tbody);

//map (A -> A'), filter(A -> B)
let result = members.map((item, idx) => { //members의 정보 중 id, name, email만 가져와서 새로운 배열 만들기 
    let obj = {}
    obj.id = item.id;
    obj.name = item.first_name +'-' + item.last_name;
    obj.email = item.email;
    return obj;
});
//filter -조건이 만족하는 것들만 배열로 출력
//메소드 체인 
result = members.filter(item => item.gender == 'Female')
.map((item, idx) => {
    let obj = {}
    obj.id = item.id;
    obj.name = item.first_name +'-' + item.last_name;
    obj.email = item.email;
    return obj;
})
.map(item => item.name); 
result.push('charles');
result.push('Hong');
result.push('charles');

console.log(result.indexOf('charles',6)); //6번째 위치부터 찾겠다고 설정해주면 두번째 charles 찾을 수 있음
console.log(result.indexOf('Roby-Rhubottom')); // 4가 출력됨 