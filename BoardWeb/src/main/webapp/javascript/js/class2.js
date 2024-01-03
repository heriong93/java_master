//class2.js
//function4.js 를 클래스로 변환 

// let today = new Date(year,month-1,1); //{}new Object() //0 이 1월임 
// today = new Date(year,month,0); //1월의 마지막 날 
// console.log(today.getDate(),today.getDay()); //

let year = 2024;
let month = 1;

class Calendar {
    constructor(year, month) {
        this.year = year;
        this.month = month;
    }

    days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat'];

    makeCalendar() {
        console.log('달력생성');
        this.makeTitle(document.getElementById('theader'));
        this.makeBody(document.getElementById('tbody'));
    }

    makeTitle(pos) { // pos:'theader'
        let tr = document.createElement('tr');
        this.days.forEach(function (field) {
            let th = document.createElement('th');
            th.innerText = field;
            tr.appendChild(th);
        })
        pos.appendChild(tr);
    }

    makeBody(pos) {  //pos: 'tbody'
        let tr = document.createElement('tr');
        //공백 
        let firstDay = this.getFirstDay();
        for (let i = 0; i < firstDay; i++) {
            let td = document.createElement('td');
            td.innerText = " ";
            tr.appendChild(td);
        }
        //날짜 출력 
        let lastDate = this.getLastDate();
        for (let i = 1; i <= lastDate; i++) {
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
    }

    getFirstDay() { //1일에 대한 요일정보 . 
        let fsday = new Date(this.year, this.month - 1, 1);
        return fsday.getDay();
    }

    getLastDate() {
        //년,월:this.year, this.month //0은 전달의 마지막 날 의미(1일이 다음달의 첫날)
        let day = new Date(this.year, this.month, 0);
        return day.getDate();
    }

}//end of class Calendar

const cal = new Calendar(year, month);
cal.makeCalendar();
