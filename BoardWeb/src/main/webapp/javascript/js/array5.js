//array5.js 

const ary = [12,20,2,1,100,88]
ary.sort((a,b)=> {
    //오름차순 정렬방식 : -1, 내림차순: 1
    if(a < b){  //앞에 값 뒤의 값 비교 
        return -1;
    }else{
        return 1;
    }
});
console.log("Hong" > "Park");
const friends = [
    {name: "Hong", age:12},
    {name: "Hwang", age:111},
    {name: "Park", age:2},
    {name: "Kim", age:33}
]
friends.sort((a,b) => { //앞의 값 뒤의 값 비교 
    if(a.name < b.name){
        return -1;
    }else{
        return 1;
    }
})
console.log(friends);