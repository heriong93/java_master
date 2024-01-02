//function4.js

//달력을 생성하는 객체 
const cal = {
    days: ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat'],
    makeCalendar: function (month) {
        this.makeTitle(this.days, document.getElementById('theader'));
        this.makeBody(month, document.getElementById('tbody'));

    },
    makeTitle: function (fields, pos) {  //fields -> days배열의 값 
        let tr = document.createElement('tr');
        fields.forEach(function (field) {
            //https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach
            //forEach 설명 나와있음 
            let th = document.createElement('th');
            th.innerText = field;
            tr.appendChild(th);
        })
        pos.appendChild(tr);
    },


    makeBody: function (month, pos) {
        let tr = document.createElement('tr');
        //공백 
        let firstDay = this.getFirstDay(month);
        for (let i = 0; i < firstDay; i++) {
            let td = document.createElement('td');
            td.innerText = " ";
            tr.appendChild(td);
        }
        //날짜 출력 
        let lastDate = this.getLastDate(month);
        for (let i = 1; i < lastDate; i++) {
            let td = document.createElement('td');
            //토욜 pink, 일욜 aqua 
            if ((firstDay + i) % 7 == 0) {  //firstday공백+숫자가 7일때 토요일- 그래서 % 7==0
                td.setAttribute("style", "background-color:pink");
            }
            if ((firstDay + i) % 7 == 1) { // % 7 ==1 일요일 위치 
                td.setAttribute("style", "background-color:aqua");
            }

            td.innerText = i;
            tr.appendChild(td);

            if ((firstDay + i) % 7 == 0) {  //공란과 날짜가 7의 배수가 되면 tr 바꾸기 
                pos.appendChild(tr);
                tr = document.createElement('tr');
            }

        }
        pos.appendChild(tr);
    },//end of makeBody

    getFirstDay(month) {
        //월 입력 => 1일의 위치 (공백이 몇개인지 반환하는 메소드)
        switch (month) {
            case 1:   //1월 
                return 1;
                break;
            case 2:   //2월
                return 4;
                break;
            case 3:    //3월
                return 5;
                break;

            case 4:    //4월
                return 1;
                break;

            case 5:    //5월
                return 3;
                break;

            case 6:    //6월
                return 6;
                break;

            case 7:    //7월
                return 1;
                break;

            case 8:    //8월
                return 4;
                break;

            case 9:    //9월
                return 0;
                break;

            case 10:    //10월
                return 2;
                break;
        }
    },//end of getFirstDay

    getLastDate(month) {
         //월 입력 => 마지막날을 반환 31,29,31,30,31,30
    switch(month){
        case 4: 
        case 6:
        case 9:
        case 11:
            return 30;
            break;
        case 2: 
             return 29;
            break;
        default:
            return 31;
    }
    }//end of getLastDate
}
cal.makeCalendar(1);
