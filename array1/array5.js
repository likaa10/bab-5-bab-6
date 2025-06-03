<script>
    var arrNegara = ["Indonesia","Malaysia","Korea","Jepang"];
    alert(arrNegara.toString()); //Indonesia,Malaysia,Korea,Jepang
    delete arrNegara[1];
    alert(arrNegara.toString()); //Indonesia,,Korea,Jepang
    alert(arrNegara.length);     //4
</script>