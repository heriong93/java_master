//table.js

    //-----------------------------------------------------
        //교수님 풀이법
        //for(let prop in obj1){}
        //table 생성
        let tb1= document.createElement('table');
        tb1.setAttribute('border',1); //attribute 속성 추가. 테이블 보더 넣어주기 
        tb1.setAttribute('id','list'); //다른 테이블과 구분하기 위해 id 지정해줌 
        tb1.appendChild(makeHead()); //함수로 table에 thead넣어줌 
        tb1.appendChild(makeBody()); //table에 tbody 넣어주기 
        document.querySelector('body').appendChild(tb1);  //화면에 보여지려면 html body 영역에 저장해줘야함 
        //table생성 끝 

        //추가버튼 클릭 이벤트 
        document.getElementById('addBtn').addEventListener('click',function(){  //dom02.html에 지정해준 id로 호출 
            let id = document.getElementById('uid').value; //사용자가 적는 값 받아오기 
            let name = document.getElementById('uname').value;
            let phone = document.getElementById('uphone').value;

            if(!id || !name || !phone){  //사용자가 값을 입력하지 않을경우 return
                alert('값을 입력하세요');
                return;
            }

            let obj = {id: id, name: name, phone: phone}  //앞에는 속성, 뒤에는 값을 의미 (속성과 값이 같을 경우 한번씩만 써도됨)
            document.querySelector('#list>tbody').appendChild(makeTr(obj)); // >은 자식요소를 말하는 것./ list라는 id를 가진 tbody를 선택해서 그 아래에 넣어주겠다 라는 의미
            
            //값 입력 후 추가하면 칸을 비워주고, id에 focus 주기 .깜빡깜빡거리게 
            document.getElementById('uid').value = ''; 
            document.getElementById('uname').value = '';
            document.getElementById('uphone').value = '';
            document.getElementById('uid').focus();
        });  

        //변경버튼 클릭 이벤트 등록
        document.getElementById('editBtn').addEventListener('click',function(){
            //찾을 값:
            let findId= document.getElementById('uid').value; 
            let phone= document.getElementById('uphone').value; 
            //찾을 대상 target 
            let target = document.querySelectorAll('#list>tbody>tr'); //#list>tr 은 바로 아래 자식. 공백은 하위요소는 어디든 다 적용() 
            console.log(target);
            target.forEach(function(item, idx, ary){  //배열의 수 만큼 함수를 반복해준다 (item= tr, idx=0,1,2..., ary= 요소 그 자체 )
             //forEach(callbackfn: (value: Element, key: number, parent: NodeListOf<Element>) => void, thisArg?: any): void
                console.log(item,idx,ary)
                let tr = item;
                if(tr.children[0].innerText == findId){  //id값이 같다면 
                    tr.children[2].innerText = phone;  //값을 넣어주어라 
                }
            }) 
        })

        //선택 삭제 이벤트 시작 
        document.getElementById('delBtn').addEventListener('click',function(){
            document.querySelectorAll('#list>tbody>tr>td>input:checked').forEach(function(item){ //추가속성은 :뒤에 적어준다.체크 된 것들만 가져오기 위해 
                item.parentElement.parentElement.remove();  //상위요소의(td) 상위요소(tr) 지워주어라  
            }) 
        })

    function makeHead(){ //함수로 thead 묶어줌
        //thead 시작
        let thd = document.createElement('thead');

        //tr
        let tr = document.createElement('tr');

        //th*3
        for(let prop in obj1){
            let th= document.createElement('th');
            th.innerText = prop.toUpperCase();
            tr.appendChild(th);
        }

        //삭제 기능
      
            let th = document.createElement('th');
            th.innerText = '삭제';
            tr.appendChild(th);

            th = document.createElement('th');  //th에 선택삭제 용 한 줄 만들어주기 
            th.innerText = '선택삭제';
            tr.appendChild(th);


        thd.appendChild(tr);
        return thd;   //호출 시 thead 반환

    } //end of makeHead()

     

        //tbody 시작

        function makeBody(){        
        let tbd = document.createElement('tbody');

        for(let friend of friends){  //큰 for문에 넣어 3번 반복되게 한다 friends배열의 값 friend 
            tbd.appendChild(makeTr(friend)); //tbody에 생성된 tr을 넣어주겠다.배열의 값 만큼 반복될 것임 
        }
        return tbd;
    }//end of makeBody()

    function makeTr(obj={}){  //함수안에서 들어올 변수 선언 obj->초기값
         //tr (body 영역)
         let trb = document.createElement('tr');
         trb.addEventListener('click',function(){
            console.log(this.children[0].innerText);  //테이블 row를 클릭하면 uid가 console창에 출력됨 
            document.getElementById('uid').value = this.children[0].innerText; //선택된 id값을 id입력창에 자동으로 넣어줌 
            document.getElementById('uname').value = this.children[1].innerText;
            document.querySelector('#uphone').value = this.children[2].innerText;   //getElementById or querySelector 둘 중 아무거나 써도됨 
         })
         //td 생성 
         for(let prop in obj){
             let td = document.createElement('td');
             td.innerText = obj[prop];
             trb.appendChild(td);  //만들어진 td를 tbody 안의 tr에 넣어주겠다 
         }
         //삭제버튼 생성 
         let td = document.createElement('td'); //삭제 기능 용 버튼 만들기 
         let btn = document.createElement('button');
         
         //button 이벤트 등록 
         btn.addEventListener('click',function(e){  //이벤트 핸들러 
            e.stopPropagation();  //상위요소로 이벤트 전파 차단 
             console.log(this.parentElement.parentElement.remove());  //이벤트의 경우에는 this=btn 을 의미. button의 상위요소 td -> 의 위 상위요소 tr 을 지워줌
         }); 
         btn.innerText = '삭제';
         td.appendChild(btn);
         trb.appendChild(td); 


         //체크박스 생성 

         td= document.createElement('td'); // th 만든 후 그 안에 들어갈 td 만들어주기 
         td.setAttribute('align','center');

         let checkbox = document.createElement('input'); //input checkbox 만들어주기 
         checkbox.addEventListener('click',function(e){   //클릭 시 다른 이벤트들이랑 함께 실행되지 않도록 지정해주는 것 
            e.stopPropagation();  //상위요소로 이벤트 전파 차단 
            console.log(e);
         })
         checkbox.setAttribute('type','checkbox');

         td.appendChild(checkbox);  //checkbox 를 td에 넣어주기 
         trb.appendChild(td);       //table 에 td 추가 

         return trb;
    }//end of makeTr
    
    //순서대로 td-> trb -> tbd -> tbl 넣어줌 
        console.log(tb1);

       



        