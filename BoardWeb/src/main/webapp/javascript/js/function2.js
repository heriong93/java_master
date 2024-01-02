//function2.js
//https://www.mockaroo.com/ 사이트에서 테이터 생성해서 json 파일 붙여넣기 
let members = `[{"id":1,"first_name":"Aimil","last_name":"Goodding","email":"agoodding0@time.com","gender":"Female","salary":9006},
{"id":2,"first_name":"Ethe","last_name":"Drabble","email":"edrabble1@vkontakte.ru","gender":"Male","salary":9075},
{"id":3,"first_name":"Leticia","last_name":"Massel","email":"lmassel2@unc.edu","gender":"Female","salary":5743},
{"id":4,"first_name":"Hastie","last_name":"Rider","email":"hrider3@rambler.ru","gender":"Male","salary":8791},
{"id":5,"first_name":"Hakeem","last_name":"Edser","email":"hedser4@census.gov","gender":"Male","salary":5839},
{"id":6,"first_name":"Boy","last_name":"Bitten","email":"bbitten5@issuu.com","gender":"Male","salary":4011},
{"id":7,"first_name":"Chance","last_name":"McCord","email":"cmccord6@ezinearticles.com","gender":"Male","salary":9627},
{"id":8,"first_name":"Brinn","last_name":"Casswell","email":"bcasswell7@cbslocal.com","gender":"Female","salary":1163},
{"id":9,"first_name":"Ives","last_name":"Minard","email":"iminard8@fda.gov","gender":"Male","salary":3799},
{"id":10,"first_name":"Almire","last_name":"Brill","email":"abrill9@feedburner.com","gender":"Female","salary":9395},
{"id":11,"first_name":"Gaile","last_name":"Gudgion","email":"ggudgiona@nhs.uk","gender":"Male","salary":982},
{"id":12,"first_name":"Pepita","last_name":"Tonge","email":"ptongeb@seesaa.net","gender":"Female","salary":8873},
{"id":13,"first_name":"Sigfrid","last_name":"Domenicone","email":"sdomeniconec@ocn.ne.jp","gender":"Male","salary":7171},
{"id":14,"first_name":"Jay","last_name":"Lutwidge","email":"jlutwidged@goo.ne.jp","gender":"Male","salary":3971},
{"id":15,"first_name":"Josh","last_name":"Trudgian","email":"jtrudgiane@printfriendly.com","gender":"Male","salary":7069}]`;

let memberAry = JSON.parse(members); //json의 문자열 정보 ``안에 넣어줘야 인식됨-> 객체 변환 
console.log(memberAry[14]); //객체 속성의 index번호로 호출 

let titles = ['아이디','이름','성씨', '이메일','성별','급여']

function makeHeader(fields=[],pos={}){ //pos={}어느 위치에 붙일 것인지 thead tbody 
    let tr = document.createElement('tr');
    tr.setAttribute("style","background-color:yellow");
    fields.forEach(function(field){
        let th = document.createElement('th');
        th.innerText = field;
        tr.appendChild(th);
    })
    pos.appendChild(tr);
}
makeHeader(titles, document.getElementById('theader'));

function makeBody(data = [],pos = {}){ //pos={}어느 위치에 붙일 것인지 thead tbody 
    data.forEach(function(eadata){ //eadata는 data의 한건. 개수만큼 돌리겠다
        let tr2 = document.createElement('tr');
       
        console.log(eadata); //확인용 출력 
        for(let prop in eadata){ //data의 한건마다 prop속성 생성 넣어주기 
            let td = document.createElement('td'); //td생성해서 
            td.innerText = eadata[prop]; //속성 데이터'값' 넣어주기 
            console.log(eadata);
            tr2.appendChild(td); //tr에 붙여
        }
        pos.appendChild(tr2);  //tbody의 자녀로 붙이기 
        if(eadata.gender == "Male"){ //속성 gender가 남자일 경우 tr의 배경색 파란색 지정
            tr2.setAttribute("style","background-color: lightblue");
        }
        if(eadata.gender == "Female"){ //속성 gender가 여자일 경우 tr의 배경색 핑크색 지정
            tr2.setAttribute("style","background-color: lightpink");
        }
    })
}
makeBody(memberAry, document.getElementById('tbody')); //data = [], pos={}여기서 지정해줌 
