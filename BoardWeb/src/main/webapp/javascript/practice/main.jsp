<body>
    <h2> jsp EL</h2>
    request : ${userid}<br>
    session : ${ sessionScope.userId}


<script>
    //템플릿 리터럴 - place holder 
    let userid= 'client';
    let msg1= `${userId}님`;
    let msg2= `\${userId}님`;
    let msg3= '\${userId}님';
    console.log("msg1", msg1);
    console.log("msg2", msg2);
    console.log("msg3", msg3);
</script>

</body>